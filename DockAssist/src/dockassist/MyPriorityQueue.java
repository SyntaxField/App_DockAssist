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
public class MyPriorityQueue implements PQInterface {
    
    private ArrayList <PQElement> thePQueue;//used to store PQElement objects
    //constructor
    public MyPriorityQueue() {//used to create a new empty priority queue
        thePQueue = new ArrayList <PQElement>();//creates the ArrayList object
    }
    
    @Override
    public void enqueue(int key, Object element) {
        PQElement newElement;
        int position;
        
        newElement = new PQElement(key , element);
        position = findInsertPosition(key);//finds the right position based on priority
        thePQueue.add(position, newElement);//inserts new item into the right position
    }
    
    @Override
    public Object dequeue() {//removes and returns highest priority item
        if (thePQueue.size() > 0) { //checks that queue is not empty
            return thePQueue.remove(0).getElement();//returns the first item in priority queue
        }
        else {//else if queue is empty
            return null;//return null
        }
    }
    
    @Override
    public Object peek() {
        if (thePQueue.size() > 0) {
            return thePQueue.get(0).getElement();
        }
        else {
            return null;
        }
    }
    
    @Override
    public boolean isEmpty() {
        return thePQueue.isEmpty();
    }
    
    @Override
    public int size() {
        return thePQueue.size();
    }
    
    @Override
    public String printPQueue(){
        String output;
        output = "";
        
        for (int i = 0; i < thePQueue.size(); i++) {
            output = output +thePQueue.get(i).toString() + "\n";
        }
        return output; //returns the final output
    }
    
    private int findInsertPosition(int newKey) {
        int i;
        
        i=0;
        
        while(i < thePQueue.size() && newKey >= thePQueue.get(i).getKey()){
            i++;
        }
        return i; //returns the insert position
    }
    
    
}
