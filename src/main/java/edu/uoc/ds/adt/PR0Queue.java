package edu.uoc.ds.adt;


import edu.uoc.ds.adt.sequential.Queue;
import edu.uoc.ds.adt.sequential.QueueArrayImpl;

import java.util.ArrayList;

public class PR0Queue {

    public final int CAPACITY = 9;

    private Queue<Integer> queue;

    public PR0Queue() {
        newQueue();
    }
    public void newQueue() {
        queue = new QueueArrayImpl<>(CAPACITY);
    }

    public void fillQueue() {
        for (int i = 0; i < 9; i++) {
            queue.add(i);
        }
    }


    public ArrayList<Integer> clearFullQueue() {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        while (!queue.isEmpty())
            integerArrayList.add(queue.poll());
        return integerArrayList;
    }

    public Queue<Integer> getQueue() {
        return this.queue;
    }

}
