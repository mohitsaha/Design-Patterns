package multithreading;

import java.util.LinkedList;
import java.util.Queue;

public class SharedQueue {
    Queue<Integer> queue;
    int size;
    SharedQueue(int size){
        this.size = size;
        queue = new LinkedList<Integer>();
    }
    public synchronized void produceItem(int num)  {
            while(queue.size() == size){
                System.out.println("queue reached maximum size waiting it to be consumed");
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            queue.offer(num);
            System.out.println("produced item " + num + "by" + Thread.currentThread().getName());
            notifyAll();
    }
    public synchronized int consumeItem()  {
        while(queue.size() == 0){
            System.out.println("queue is empty waiting it for the produce");
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("consumed item " + queue.peek() + "by" + Thread.currentThread().getName());
        notifyAll();
        return queue.poll();
    }
}
