/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dockassist;

import java.util.ArrayList; //util package import to use ArrayList

/**
 *
 * @author jamesmurphy
 */
//RecordList class dictates what the record list must be able to do
public class RecordList implements RecordListInterface{ //RecordList class implements RecordListInterface
    
    private ArrayList<DocklandsRecord> records;
    
    public RecordList(){
        records = new ArrayList <DocklandsRecord>();//creates an instance of ArrayList object and stored in records
    }
    @Override
    public boolean isEmpty() {//this method is used to check if the list is empty
        return records.isEmpty();//then returns true if empty and false if not empty
    }
    @Override
    public int size(){//method used to return the num of records
        return records.size();
    }
    @Override
    public void addRecord(DocklandsRecord record) {
        records.add(record);//adds the record object at the end of the ArrayList
    }
    @Override
    public DocklandsRecord getRecord(int index) {
        //validation to check if the index is valid
        if (index >=0 && index < records.size()) { 
            return records.get(index);//returns the record at that index
        }
        else{
            return null;
        }
    }
    
    @Override
    public void removeRecord(int index) {
        //validation to check if index is valid
        if (index >=0 && index < records.size()){
            records.remove(index);//removes the record at that index
        }
    }
    
    @Override
    public String printRecords() {
        String output;
        output= "";
        //for loop used to loop through the ArrayList
        for (int i = 0; i < records.size(); i++) {
            output = output + records.get(i).getSummary() + "\n";
        }
        return output;
    }
    
}
