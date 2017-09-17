package org.project.Stack;

import java.util.Arrays;

public class ArrayStack implements Stack{

    private int [] table;
    private int indx = 0 ;


    public String toString (){
        return Arrays.toString(table);
    }


    public ArrayStack(int size) {
        table = new int[size];
    }

    /*public int[] getTable() {

        System.out.println("Table max size is: "+table.length);
        return table;
    }*/

    public boolean empty() {

       /* if (bookStandLenght<=0){
        System.out.println("Your bookstand is not empty! ");
        return true;}
        else {
            System.out.println("Your bookstand is empty! ");
        }*/
        return false;
    }


    public boolean push(int e) {

        if(indx ==table.length) {

            return false;
        }
        table[indx] = e;
        indx++;

        // table [0] = e;
        return true;

    }

    public int pop() {
        if (indx>0){

        indx-= 1;

        return table[indx];

        }
        else throw new IllegalStateException("stack empty");



    }

    public int peek() {


        return 0;
    }
}
