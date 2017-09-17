package org.project.Stack;

import java.util.Arrays;

public class ArrayQueue implements Queue {

    private int tail= 0;
    private int head= 0;
    private int table[];
    private int index;


    public String toString (){
        return Arrays.toString(table);
    }



    public ArrayQueue(int size) {
        table = new int[size];


    }

    public boolean empty() {
        return false;
    }

    public boolean add(int e) {

        if (index== table.length){
            System.out.println("Too many added value. Can't add ");
            return false;
        }
        table[index]= e;
        index++;
        System.out.println("Added new value: " + e);


        return false;
    }

    public int poll() {
        if (head!=index)
        System.out.println("Dequeue: "+table[head]);
        head++;
        return 0;

    }

    public int peek() {

        return 0;
    }
}
