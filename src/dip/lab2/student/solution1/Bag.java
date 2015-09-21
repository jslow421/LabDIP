/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2.student.solution1;

/**
 *
 * @author John
 */
public class Bag implements Service{
    private int bagCount;
    private final double baseTip;
    //private double tipAmount;
    public enum ServiceQuality {
        GOOD, FAIR, POOR
    }
    private ServiceQuality serviceQuality;
    
    public Bag (ServiceQuality q,int bagCount){
        this.setServiceRating(q);
        setBagCount(bagCount);
        baseTip = 1;
    }

    public final int getBagCount() {
        return bagCount;
    }

    public final void setBagCount(int bagCount) {
        if(bagCount < 0) {
            throw new IllegalArgumentException(
                    "bag count must be greater than or equal to zero");
        }
        this.bagCount = bagCount;
    }
    
    
    
    @Override
    public final double getTotalTip(){
        double tipAmount = 0;
        
        switch(serviceQuality){
            case GOOD:
                tipAmount = (baseTip * bagCount) * 1.2;
                break;
            case FAIR:
                tipAmount = (baseTip* bagCount) * 1.15;
                break;
            case POOR:
                tipAmount = (baseTip * bagCount) * 1.1;
                break;
        }
        
        
        return tipAmount;
    }
    public final void setServiceRating(ServiceQuality q) {
        serviceQuality = q;
    }

    public ServiceQuality getServiceQuality() {
        return serviceQuality;
    }

    public void setServiceQuality(ServiceQuality serviceQuality) {
        this.serviceQuality = serviceQuality;
    }

    public double getBaseTip() {
        return baseTip;
    }
    
    
}
