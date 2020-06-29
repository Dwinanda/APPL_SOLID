package Model;

import Interface.IRechargeable;
public class Robot extends Worker implements IRechargeable{
    String id;
    private int capacity;
    private int currentPower;
    
    public Robot(String id, int capacity) {
        super(id);
        this.capacity = capacity;
        
    }
    
    public int getCapacity() {
        return this.capacity;
    }
    
    public int getCurrentPower() {
        return this.currentPower;
    }
    
    public void setCurrentPower(int currentPower) {
        this.currentPower = currentPower;
    }
    
    public void Work(int hours) {
        if(hours > this.currentPower) {
            hours = currentPower;
        } 
        this.Work(hours);
        this.currentPower -= hours;
    }
    @Override
    public void Recharge() {
        this.currentPower = this.capacity;
    }
    
}
