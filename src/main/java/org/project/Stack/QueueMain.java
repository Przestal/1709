package org.project.Stack;

public class QueueMain {

    public static void main(String[] args) {

        ArrayQueue arrayQueue = new ArrayQueue(3);
        arrayQueue.add(12);
        arrayQueue.add(5);
        arrayQueue.add(8);
        arrayQueue.poll();
        arrayQueue.poll();

        arrayQueue.poll();
        arrayQueue.poll();
        arrayQueue.add(9);




    }
}
