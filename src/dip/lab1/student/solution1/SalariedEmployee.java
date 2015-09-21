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
public class SalariedEmployee implements Employee{
    private double salary;
    private double bonus;
    
    public SalariedEmployee(double salary, double bonus){
        setSalary(salary);
        setBonus(bonus);
    }

    public final double getSalary() {
        return salary;
    }

    public final void setSalary(double salary) {
        this.salary = salary;
    }

    public final double getBonus() {
        return bonus;
    }

    public final void setBonus(double bonus) {
        this.bonus = bonus;
    }
    
    @Override
    public final double getAnnualWage(){
        return salary + bonus;
    }
    
    
    
}
