/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraryFunctions;

import java.util.ArrayList;

public class stack {

    private static int stackSize;
    private static String[] stack;
    private static int top;

     public static boolean isStackFull() {
        boolean full = false;
        if (top == stackSize - 1) {
            full = true;
        }
        return full;
    }

    public static boolean isStackEmpty() {
        boolean empty = false;
        if (top == -1) {
            empty = true;
        }
        return empty;
    }

    public static void addElement(String current) {

        boolean full = isStackFull();
        if (full==true) {
            
        } else {
            top = top + 1;
            stack[top] = current;

        }
    }

    public static String removeElement() {

        boolean empty = isStackEmpty();
         
        if (empty==true) {
        } else {
            String event = stack[top];
            top = top - 1;
             
             return event;
        }
        return null;
    }

    
    public static ArrayList<String> reverseList(ArrayList<String> sortedList){
        ArrayList<String> reversedList = new ArrayList<>();
        stackSize = sortedList.size();
         top = -1;
         stack = new String[stackSize];
        for (int i = 0; i < stackSize; i++) {
            String current = sortedList.get(i);
            addElement(current);
            System.out.println(stack[i]);
        }
        System.out.println();
        for (int i = 0; i < stack.length; i++) {
            String event = removeElement();
            reversedList.add(event);
            System.out.println(reversedList.get(i));
        }
        return reversedList;
    }

}
