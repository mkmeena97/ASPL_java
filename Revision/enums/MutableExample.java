package remaining_topics.enums;

public enum MutableExample {
    A,
    B;
    private int count=0;
    public void increment(){
        count++;
    }
    public void print() {
        System.out.println("The count of " + name() + " is " + count);
    }
}
class Main{
    public static void main(String[] args) {
        MutableExample.A.print();
        MutableExample.A.increment();
        MutableExample.A.print();
        MutableExample.B.print();
        MutableExample.B.increment();
        MutableExample.B.print();
    }
}
