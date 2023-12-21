/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project2;

/**
 *
 * @author syifa
 */
class HourlyWorker extends Employee {
     protected int numberOfHours;


    public HourlyWorker(int numberOfWorkers, int numberOfHours) {
        super(numberOfWorkers);
        this.numberOfHours = numberOfHours;
    }

    @Override
    public double calculateSalary() {
        double baseSalary = Math.min(numberOfHours, 40) * 30.00; // First 40 hours
        double overtimeHours = Math.max(numberOfHours - 40, 0);
        double overtimeSalary = overtimeHours * 30.00 * 1.5; // Overtime hours with 1.5 times rate

        return numberOfWorkers * (baseSalary + overtimeSalary);
    }
}
