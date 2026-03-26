/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dockassist;

import java.util.ArrayList;

/**
 *
 * @author jamesmurphy
 */
public class MyStack implements StackInterface {
    
    private ArrayList<Object> stack; // ArrayList used to store the stack items
    //constructor to create a new empty stack
    public MyStack (){
        stack = new ArrayList <Object>(); //create ArrayList object
    }
    
    @Override
    public boolean isEmpty() {
        return stack.isEmpty();//returns true if stack is empty or false if not empty
    }
    
    @Override
    public int size() {
        return stack.size();//retruns the size of ArrayList
    }
    
    @Override
    public void push(Object element){//add item to top of stack
        stack.add(0,element); //inserts new item at index 0 i.e the top of stack
    }
    
    @Override
    public Object pop() { //removes top item from stack and returns it
        //checks that stack is not empty
        if(stack.size() < 0) {
            return stack.remove(0);//removes and returns item at top of stack
        }
        else {
            return null;//if the stack is empty this returns null
        }
    }
    
    @Override
    //returns the item from top of stack but does not remove it
    public Object peek() {
        if (stack.size() > 0) { //checks if stack is not empty
            return stack.get(0);//retruns item at top
        }
        else {
        return null;//otherwise if the stack is empty this returns null
    }
    }
    
    //push,pop,peek creates stack i.e LIFO
    
    @Override
    //returns all stack items as one string
    public String printStack() {
        String output;
        output = "";
        //for loop loops through items in the stack
        for (int i = 0; i < stack.size(); i++){
            output = output + stack.get(i).toString() + "\n"; //adds each item to outputed string
        }
        
        return output; //returns the string
    }
   
    
}
