
import java.util.Scanner; // We import this to use it to get the input

public class Homework2
// Nuria Perez Casas
// COMS 104
// P2.5

{
    public static void main(String[] args)
    
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter the first integer: "); //We ask the user and get the first input
        int first_num = in.nextInt();

        System.out.print("Please enter the second integer: "); //We ask the user and get the second input
        int second_num = in.nextInt();

        int sum = first_num + second_num; 
        System.out.println();
        System.out.printf("Sum:       %5d\n", sum); // We make the calculations and we use %5d\n for the string formatting. 
        // We repeat this process with all the calculations except for the average 
        // Because since it is giving us a decimal we need to make some changes. 
        System.out.println(); // We can put an extra line to separate each value, and to make it look better. 

        int difference = first_num - second_num;
        System.out.printf("Difference:%5d\n", difference);
        System.out.println();

        int product = first_num * second_num;
        System.out.printf("Product:   %5d\n", product);
        System.out.println();

        double double_sum = sum; // We change the sum from and int to a double in order to get a decimal number when we divide.
        double average = double_sum / 2; // And this time we want the result to be a double 
        System.out.printf("Average:   %8.2f\n", average); 
        // We use f instead of d because it is a double and we put 8 instead of 5
        // because we want to align all the non decimal parts of the number. 
        // We also put .2 because I only want to get 2 decimals for the aesthetics. 
        System.out.println();

        int absolute = Math.abs(difference); // Found this operation in the book. 
        System.out.printf("Distance:  %5d\n", absolute);
        System.out.println();

        int max = Math.max(first_num, second_num); // Found this operation in the book.
        System.out.printf("Maximum:   %5d\n", max);
        System.out.println();

        int min = Math.min(first_num, second_num); // Found this operation in the book.
        System.out.printf("Minimum:   %5d\n", min);
        System.out.println();
    }


}
