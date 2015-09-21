/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab1.student.solution1;

/**
 *
 * @author John
 */
public class HourlyEmployee implements Employee{
    private double hourlyRate;
    private double hoursWorked;

    public HourlyEmployee(double hourlyRate, double hoursWorked) {
        setHourlyRate(hourlyRate);
        setHoursWorked(hoursWorked);
    }

    public final double getHourlyRate() {
        return hourlyRate;
    }

    public final void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public final double getHoursWorked() {
        return hoursWorked;
    }

    public final void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    
    @Override
    public final double getAnnualWages(){
    return hourlyRate * hoursWorked;
}
    
    
    
}
