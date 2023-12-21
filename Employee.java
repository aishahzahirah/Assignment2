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
abstract class Employee {
    protected int numberOfWorkers;

        public Employee(int numberOfWorkers) {
            this.numberOfWorkers = numberOfWorkers;
        }
        
        
    public int getnumberOfWorkers() {
        return numberOfWorkers;
    }

    public void setnumberOfWorkers(int numberOfWorkers) {
        this.numberOfWorkers = numberOfWorkers;
    }
        
        // Abstract method
        public abstract double calculateSalary();
        
}
