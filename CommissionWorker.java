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
 public class CommissionWorker extends Employee {
    protected double weeklySales;

     public CommissionWorker(int numberOfWorkers, double weeklySales) {
         super(numberOfWorkers);
         this.weeklySales = weeklySales;
     }

     @Override
     public double calculateSalary() {
         return getnumberOfWorkers() * (500.00 + (0.055 * weeklySales));
     }
     
     
}
