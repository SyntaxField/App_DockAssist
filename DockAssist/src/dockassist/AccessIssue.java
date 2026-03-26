/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dockassist;

/**
 *
 * @author jamesmurphy
 */
public class AccessIssue extends DocklandsRecord{
    
    private int priority;
    private String status;
    private String issueType;
    private String reportDate;
    
    public AccessIssue(int id,String title, String description, String location, int priority, String status, String issueType, String reportDate){
        super(id,title,description,location);
        this.priority = priority;
        this.status = status;
        this.issueType = issueType;
        this.reportDate = reportDate;
    }
    
    public int getPriority() {
        return priority;
    }
    
    @Override
    public String getSummary() {
        return super.getSummary() + ", Priority: "+ priority +", Status: "+status+", Issue Type: "+issueType+", Report Date: "+reportDate;
    }
}
