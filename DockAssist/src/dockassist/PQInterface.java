/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dockassist;

/**
 *
 * @author jamesmurphy
 */
public interface PQInterface {//interface that list methods for MyPriorityQueue
    
    public void enqueue(int key, Object element);//adds item with a priority key into the priority queue
    
    public Object dequeue(); //removes and returns the item with highest priority
    public Object peek(); //returns the highest priority item and does not remove it
    public boolean isEmpty();//checks if priority queue is empty
    public int size(); //returns num of items in priorty queue
    public String printPQueue(); //returns all priority items as string
}
