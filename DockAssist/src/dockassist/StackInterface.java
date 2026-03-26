/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dockassist;

/**
 *
 * @author jamesmurphy
 */
public interface StackInterface {
    
    public boolean isEmpty(); //checks if stack is empty
    public int size(); //returns num of items in stack
    
    public void push(Object element); //adds item to top of stack
    public Object pop(); //removes and returns top item from stack
    public Object peek(); //returns top item from stack without deleting it
    public String printStack(); //returns the stack items as a String
    
    
}
