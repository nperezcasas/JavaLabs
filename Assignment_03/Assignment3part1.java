// Nuria Perez Casas
// COMS 104
// P3.8
import java.util.Scanner;
public class Assignment3part1
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        // We first ask the user for the four integers. 
        System.out.print("Please enter four integers: "); 
        int firstNum = in.nextInt();
        int secondNum = in.nextInt();
        int thirdNum = in.nextInt();
        int fourthNum = in.nextInt(); // and we separate all of them assigning a name for each one. 
        
        // Using if statements and else if, we compare each other with all 
        // the possible options of having two pairs. 
        
        System.out.println(); // We will print an extra line to separete the 
        // input from the final statement. 

        if (firstNum == secondNum && thirdNum == fourthNum)
        {
            System.out.println("two pairs");
        }
        else if (firstNum == thirdNum && secondNum == fourthNum)
        {
            System.out.println("two pairs");
        }
        else if (firstNum == fourthNum && secondNum == thirdNum)
        {
            System.out.println("two pairs");
        }
        else // if they are not in the options above they won't be two pairs, so else. 
        {
            System.out.println("not two pairs");
        }
    }
}