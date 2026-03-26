/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dockassist;

/**
 *
 * @author jamesmurphy
 */
public class AccessIssue extends DocklandsRecord{ //AccessIssue is the child class that inherits from DocklandsRecord
    //such as
    private int priority;//storing the priority issue
    private String status;// the issues status
    private String issueType;// the issue type
    private String reportDate;// and the date the issue was reported on
    
    //constructor used to create and initialise AccessIssue object
    public AccessIssue(int id,String title, String description, String location, int priority, String status, String issueType, String reportDate){
        super(id,title,description,location);//this calls the parent constructor DocklandsRecord
        this.priority = priority;//saves priority value
        this.status = status;//saves status value
        this.issueType = issueType;//saves issue type value
        this.reportDate = reportDate;//saves report date value
    }
    //getters
    
    public int getPriority() {
        return priority;//returns the priority value
    }
    
    @Override
    public String getSummary() {
        //adds the child class details to parent summary
        return super.getSummary() + ", Priority: "+ priority +", Status: "+status+", Issue Type: "+issueType+", Report Date: "+reportDate;
    }
}
