/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dockassist;

/**
 *
 * @author jamesmurphy
 */

//This stores the data for every record
//it provides the base for inheritance and provides getSummary() later in polymorphism
public class DocklandsRecord {
    //stores the record id number,title,desc,location
    private int id;
    private String title;
    private String description;
    private String location;
    
    //constructor to setup a new record
    public DocklandsRecord(int id, String title, String description,String location){
        this.id=id;
        this.title=title;
        this.description=description;
        this.location=location;
    }
    //getters
    public int getId(){
    return id;//sends back id value
}
    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getLocation() {
        return location;
    }
    
    public String getSummary(){
        return "ID: "+id+", Title: "+title+", Description: "+description+", Location: "+location;
    }
    
    @Override
    public String toString() { //returns a string
        return getSummary();
    }
    
}
