/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dockassist;

/**
 *
 * @author jamesmurphy
 */
public class PQElement {
    
    private int key;//stores priority value
    private Object element; //stores the element object linked to the priority
    //constructor to create and intialise PQElement object
    public PQElement(int priority, Object e){
        key = priority;//sets priority key
        element=e;//sets object that is stored in PQElement
    }
        
    public int getKey(){
        return key;//send back key value
    }
    
    public void setKey(int val) {
        key =val;
    }
    
    public Object getElement() {
        return element;//send back the element object
    }
    
    public void setElement(Object e){//sets new object
        element = e;
    }
        
    @Override
    public String toString() {
        return "Priority: "+key+", "+element.toString();//combines key and object into string for output
    }
    
    
}
