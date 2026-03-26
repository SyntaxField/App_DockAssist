/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dockassist;

/**
 *
 * @author jamesmurphy
 */
//this interface list all the methods that is needed by RecordList
public interface RecordListInterface {
    
    public boolean isEmpty(); //method used to check if record list is empty
    public int size(); //num of records in list
    public void addRecord(DocklandsRecord record);//adds a DocklandsRecord object to the list
    public DocklandsRecord getRecord(int index);//returns the record at specified index in the ArrayList i.e RecordList
    public void removeRecord(int index);//removes a record at specified index in the ArrayList i.e RecordList
    public String printRecords();//this method is used to return all record values as one string
    
}
