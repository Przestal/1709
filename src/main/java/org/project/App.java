package org.project;

import org.project.Stack.ArrayStack;

/**
 * Hello world!
 *
 */
public class App 
{


    public static void main( String[] args )
    {

        ArrayStack arrayStack = new ArrayStack(3);
        arrayStack.push(2);
        arrayStack.push(3);

        arrayStack.toString();

        System.out.println(arrayStack.toString());
        System.out.println(arrayStack.pop());
        arrayStack.push(5);
        System.out.println(arrayStack.toString());


        /*for (int i = 0; i < stack.table.length; i++) {
            System.out.println("Table number: ");

        }*/


        //pop move and delete
        // push add book






    }
}
