package config;

import simulator.checkout.CheckoutLineInterface;
import simulator.shopper.Shopper;
import structures.QueueInterface;

public class NormalLine implements CheckoutLineInterface {
    private int queueSize;

    private Node first;
    private Node last;

    private class Node {
        private Shopper element;
        private Node next;
    }
    @Override
    public boolean canEnterLine(Shopper shopper) {
        //Always true for Normal Line

        return true;
    }

    @Override
    public Shopper dequeue() {
        //Check to see if the queue is empty
        if (queueSize == 0){
            throw  new IllegalStateException();
        }

        Shopper elementToDequeue = first.element;
        first = first.next;

        if((-- queueSize) == 0){
            last = null;
        }

        return elementToDequeue;

    }

    @Override
    public Shopper peek() {
        return first.element;
    }

    @Override
    public QueueInterface<Shopper> enqueue(Shopper shopper) {
        Node current = last;
        last = new Node();
        last.element = shopper;

        if ((queueSize ++ ) == 0){
            first = last;
        }
        else {
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
}


