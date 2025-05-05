package MultiThreading;

class SharedResource1 {
    private int data;
    private boolean available = false;

    public synchronized void produce(int value) throws InterruptedException {
        while (available) {
            wait(); // Wait for the consumer to consume
        }
        data = value;
        available = true;
        notify(); // Notify the consumer
    }

    public synchronized int consume() throws InterruptedException {
        while (!available) {
            wait(); // Wait for the producer to produce
        }
        available = false;
        notify(); // Notify the producer
        return data;
    }
}

public class ProducerConsumerExample {
    public static void main(String[] args) {
        SharedResource1 resource = new SharedResource1();

        Thread producer = new Thread(() -> {
            try {
                for (int i = 0; i < 5; i++) {
                    resource.produce(i);
                    System.out.println("Produced: " + i);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread consumer = new Thread(() -> {
            try {
                for (int i = 0; i < 5; i++) {
                    int value = resource.consume();
                    System.out.println("Consumed: " + value);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        producer.start();
        consumer.start();
    }
}
