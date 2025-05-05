package MultiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// 1. Creating Threads using Thread class
class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running using Thread class.");
    }
}

// 2. Creating Threads using Runnable interface
class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running using Runnable interface.");
    }
}

// 3. Synchronization Example (To prevent race conditions)
class SharedResource {
    private int count = 0;

    public synchronized void increment() { // Synchronization applied
        count++;
        System.out.println(Thread.currentThread().getName() + " - Count: " + count);
    }

    public int getCount() {
        return count;
    }
}

// 4. Inter-thread Communication Example (wait & notify)
class ProducerConsumer {
    private boolean available = false;

    public synchronized void produce() {
        try {
            while (available) {
                wait(); // Wait until consumed
            }
            System.out.println("Produced an item!");
            available = true;
            notify(); // Notify consumer
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Restore interrupted status
            System.out.println("Producer thread interrupted.");
        }
    }

    public synchronized void consume() {
        try {
            while (!available) {
                wait(); // Wait until produced
            }
            System.out.println("Consumed the item!");
            available = false;
            notify(); // Notify producer
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Restore interrupted status
            System.out.println("Consumer thread interrupted.");
        }
    }
}

// 5. Thread Pool Example using ExecutorService
class Task implements Runnable {
    private final int taskId;

    public Task(int id) {
        this.taskId = id;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is executing Task " + taskId);
        try {
            Thread.sleep(1000); // Simulating work
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Restore interrupted status
            System.out.println("Task " + taskId + " interrupted.");
        }
    }
}

// Main Class to run all examples
public class MultiThreadingDemo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main thread started");

        // 1. Using Thread class
        MyThread thread1 = new MyThread();
        thread1.start();

        // 2. Using Runnable interface
        Thread thread2 = new Thread(new MyRunnable());
        thread2.start();

        // 3. Synchronization Example
        SharedResource resource = new SharedResource();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                resource.increment();
            }
        }, "Thread-1");
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                resource.increment();
            }
        }, "Thread-2");
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Final Count: " + resource.getCount());

        // 4. Inter-thread Communication Example
        ProducerConsumer pc = new ProducerConsumer();
        Thread producer = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                pc.produce();
            }
        });
        Thread consumer = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                pc.consume();
            }
        });
        producer.start();
        consumer.start();
        producer.join();
        consumer.join();

        // 5. Thread Pool Example
        ExecutorService executor = Executors.newFixedThreadPool(3);
        for (int i = 1; i <= 5; i++) {
            executor.execute(new Task(i));
        }
        executor.shutdown();

        // Wait for all tasks to complete
        while (!executor.isTerminated()) {
            // Wait
        }
        System.out.println("All tasks completed.");

        System.out.println("Main thread finished");
    }
}