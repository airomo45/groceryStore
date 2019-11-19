package config.Queue;

import structures.QueueInterface;

public class Queue<T> implements QueueInterface<T> {
    private int queueSize;

    private Node first;
    private Node last;

    private class Node {
        private T element;
        private Node next;
    }
    @Override
    public T dequeue() {
        //Check to see if the queue is empty
        if (queueSize == 0){
            throw  new IllegalStateException();
        }

        T elementToDequeue = first.element;
        first = first.next;

        if((-- queueSize) == 0){
            last = null;
        }

        return elementToDequeue;

    }

    @Override
    public T peek() {
        if(queueSize == 0){
            throw new IllegalStateException();
        }
        else {
            return first.element;
        }

    }

    @Override
    public QueueInterface<T> enqueue(T elem) {
        Node current = last;
        last = new Node();
        last.element = elem;

        // Check to see if the queue is empty each time a new item is added
        if ((queueSize++) == 0 ){
            // if it is empty then first and last are the same
            first = last;
        }
        else{
            // Other wise the next element is gonna be last
            current.next = last;
        }
        return this;
    }

    @Override
    public boolean isEmpty() {
        if(queueSize == 0){
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public int size() {
        return queueSize;
    }

    public static void main(String[] args) {
        Queue<String> test = new Queue<>();
//        test.dequeue();
        test.enqueue("Hello");

        System.out.println("Is is empty: " + test.isEmpty());
        System.out.println("Size: "+ test.size());
        System.out.println("First on cue " + test.peek());
        test.enqueue("Hello2");
        System.out.println("Is is empty: " + test.isEmpty());
        System.out.println("Size: "+ test.size());
        System.out.println("First on cue " + test.peek());
        test.dequeue();
        System.out.println("Is is empty: " + test.isEmpty());
        System.out.println("Size: "+ test.size());
        System.out.println("First on cue " + test.peek());



    }
}
