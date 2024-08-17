package multithreading;

public class Multithreading {
    public static void main(String args[]){
        SharedQueue queue = new SharedQueue(2);
        Thread consumerThread = new Thread(()->queue.consumeItem());
        Thread producerThread = new Thread(() -> queue.produceItem(1));
        Thread producerThread1 = new Thread(() -> queue.produceItem(2));
        Thread producerThread2 = new Thread(() -> queue.produceItem(3));
        Thread consumerThread1 = new Thread(()->queue.consumeItem());
        Thread consumerThread2 = new Thread(()->queue.consumeItem());
        Thread consumerThread3 = new Thread(()->queue.consumeItem());
        consumerThread.start();
        producerThread.start();
        producerThread1.start();
        producerThread2.start();
        consumerThread1.start();
        consumerThread2.start();
        consumerThread3.start();

    }
}
