/**
 * This program tests our Employee class. 
 */
public class EmployeeTester
{
    public static void main(String[] args)
    {
        // We create our own employees by calling the constructor and giving the parameters.
        Employee bob = new Employee("Bob Morris", 56000);
        Employee emily = new Employee("Emily Carlson", 62000);
        Employee ellie = new Employee("Ellie Stuart", 68000);

        // Now we can actually create interactions with the different methods from the class. 
        System.out.println("These are all the employees and their full names: ");
        System.out.println(bob.getName());
        System.out.println(emily.getName());
        System.out.println(ellie.getName());

        System.out.println("Now we will give a $5000 raise to Emily, and print her new salary: ");
        emily.raiseSalary(5000);
        System.out.println(emily.getSalary());

        System.out.println("Next, we will get bob's full name, lower his salary and print it afterwards: ");
        System.out.println(bob.getName());
        bob.raiseSalary(-3000);
        System.out.println(bob.getSalary());

        System.out.println("Finally, with ellie we will get her full name and her current salary without changing it: ");
        System.out.println(ellie.getName());
        System.out.println(ellie.getSalary());

    }
}