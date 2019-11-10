package config.Queue;

import structures.QueueInterface;

public class Queue<T> implements QueueInterface {
    public T dequeue(){
        return null;
    }

    @Override
    public Object peek() {
        return null;
    }

    @Override
    public QueueInterface enqueue(Object elem) {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }
}
