/**
 * Employee
 * Creates the employee class for HW assignment 1
 *
 * @author - Samuel Mckinney
 * @date 2/2/21
 */


public class Employee {
    private int employeeID, hoursWorked;
    private double hourlyRate, grossPay;

    public Employee(int employeeID, int hoursWorked, double hourlyRate) {
        this.employeeID = employeeID;
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    /**
     * Gross Pay calculator
     * @param hourlyRate
     * @param hoursWorked
     * @return
     */
    public double getGrossPay(double hourlyRate, int hoursWorked) {
        grossPay = hourlyRate * hoursWorked;
        return grossPay;
    }

    // Getters and Setters
    // Get/Set Employee ID
    public int getEmployeeID() {
        return employeeID;
    }
    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }
    // Get/Set Hours Worked
    public int getHoursWorked() {
        return hoursWorked;
    }
    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    // Get/Set Hourly Rate
    public double getHourlyRate() {
        return hourlyRate;
    }
    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    /**
     * Object to String
     * @return
     */
    public String toString() {
        return "Employee ID = " + employeeID + ".\n Hours Worked(Week) = " + hoursWorked + ". Hourly Rate = " + hourlyRate
                + ". Gross Pay(Week) = " + getGrossPay(this.hourlyRate, this.hoursWorked);
    }
}
