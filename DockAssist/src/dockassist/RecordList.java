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
public class RecordList implements RecordListInterface{
    
    private ArrayList<DocklandsRecord> records;
    
    public RecordList(){
        records = new ArrayList <DocklandsRecord>();
    }
    @Override
    public boolean isEmpty() {
        return records.isEmpty();
    }
    @Override
    public int size(){
        return records.size();
    }
    @Override
    public void addRecord(DocklandsRecord record) {
        records.add(record);//adds the record object
    }
    @Override
    public DocklandsRecord getRecord(int index) {
        //validation that check if the index is valid
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
        
        for (int i = 0; i < records.size(); i++) {
            output = output + records.get(i).getSummary() + "\n";
        }
        return output;
    }
    
}
