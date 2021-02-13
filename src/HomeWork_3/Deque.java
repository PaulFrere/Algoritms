package HomeWork_3;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Deque {


    private final int[] array;
    private final int size;
    private int head;
    private int tail;
    private int capacity;

    public static void main(String[] args) {
        Deque deque = new Deque(15);
        for (int i = 0; i < 15; i++) {
            deque.insertLeft(i);
        }
        System.out.println(deque);
        System.out.println(deque.removeLeft());
        System.out.println(deque.removeRight());
        System.out.println(deque.removeLeft());
        System.out.println(deque.removeRight());
        deque.insertLeft(22);
        System.out.println(deque.getTail());
        deque.insertLeft(33);
        System.out.println(deque.getTail());
        deque.insertLeft(44);
        System.out.println(deque.getTail());
        deque.insertRight(55);
        System.out.println(deque.getTail());
        System.out.println(deque);
        for (int i = 0; i < 15; i++) {
            deque.removeRight();
        }
        for (int i = 0; i < 15; i++) {
            deque.insertLeft(i+10);
        }
        System.out.println(deque);
        PriorityQueue priorityQueue = new PriorityQueue(5);
        priorityQueue.add(1);
        priorityQueue.add(3);
        priorityQueue.add(2);
        priorityQueue.add(4);
        priorityQueue.add(5);
        System.out.println(priorityQueue);
        System.out.println(priorityQueue.remove());
        priorityQueue.add(6);
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue);
        priorityQueue.add(1);
        priorityQueue.add(15);
        priorityQueue.remove();
        System.out.println(priorityQueue);
    }

    public Deque(int size) {
        this.size = size;
        array = new int[size];
        capacity = 0;
        head = 0;
        tail = -1;
    }

    public int getSize() {
        return size;
    }

    public int getHead() {
        return head;
    }

    public int getTail() {
        return tail;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public void insertLeft(int i) {
        if (isFull()) throw new FullDeque();
        if (--head < 0) {
            head = size - 1;
        }
        array[head] = i;
        capacity++;
    }

    public int removeLeft() {
        if (++head > size - 1)
            head = 0;
        capacity--;
        return array[head - 1];
    }

    public void insertRight(int i) {
        if (isFull()) throw new FullDeque();
        if (++tail > size){
            tail = 0;
        }
        array[tail - 1] = i;
        capacity++;
    }

    public int removeRight() {
        if (--tail < 0) tail = size - 1;
        capacity--;
        return array[tail];
    }

    @Override
    public String toString() {
        return "Deque{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
