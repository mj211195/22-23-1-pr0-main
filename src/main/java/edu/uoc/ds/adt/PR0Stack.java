package edu.uoc.ds.adt;


import edu.uoc.ds.adt.sequential.Stack;
import edu.uoc.ds.adt.sequential.StackArrayImpl;

import java.util.ArrayList;

public class PR0Stack {

    // Capacitat màxima de la seqüència.
    public final int CAPACITY = 9;

    private Stack<Integer> stack;

    public PR0Stack() {
        newStack();
    }

    public void newStack() {
        stack = new StackArrayImpl<>(CAPACITY);
    }


    public void fillStack() {
        for (int i = 0; i < 9; i++) {
            stack.push(i);
        }
    }

    public ArrayList<Integer> clearAllStack() {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        while (!stack.isEmpty())
            integerArrayList.add(stack.pop());
        return integerArrayList;
    }

    public Stack<Integer> getStack() {
        return this.stack;
    }
}
