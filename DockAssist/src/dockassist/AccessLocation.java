/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dockassist;

/**
 *
 * @author jamesmurphy
 */
public class AccessLocation extends DocklandsRecord{//inherits from DocklandsRecord
    //stores true/false value
    private boolean hasRamp;//such as whether the location has a ramp
    private boolean hasLift;
    private boolean stepFree;
    //constructor
    public AccessLocation(int id, String title, String description,String location, boolean hasRamp, boolean hasLift,boolean stepFree){
        super(id,title,description,location);
        this.hasRamp = hasRamp;
        this.hasLift = hasLift;
        this.stepFree = stepFree;
    }
    @Override
    public String getSummary(){ //this method returns the summary of access location
        return super.getSummary() + ", Ramp: "+ hasRamp +", Lift: "+hasLift+", Step Free: "+ stepFree;
    }
    
}
