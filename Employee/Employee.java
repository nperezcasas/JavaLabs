/**
 * COMS 104
 * Nuria Perez Casas
 * Assignment #5
 * 
 * An employee with a name and a current salary, and the possibility to raise it. 
 */
public class Employee
{
    private String employeeName;
    private int currentSalary;

    /**
     * Constructor that sets up the instance variables with two paramaters. 
     * @param employeeName
     * @param currentSalary
     */
    public Employee(String employeeName, int currentSalary)
    {
        // Set up the variable(s)
        this.employeeName = employeeName;
        this.currentSalary = currentSalary;
    }
    /**
     * Gets the employee full name
     * @return the employee name. 
     */
    public String getName()
    {
        return employeeName;
    }
    
    /**
     * Gets the current salary.
     * @return the current employee salary. 
     */
    public int getSalary()
    {
        return currentSalary;
    }

    /**
     * This raises the salary by adding it to the current one. 
     * @param salaryIncrease the amount you will increase. 
     */
    public void raiseSalary(int salaryIncrease)
    {
        currentSalary += salaryIncrease;
    }
}