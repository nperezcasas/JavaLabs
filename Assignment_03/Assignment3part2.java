// Nuria Perez Casas
// COMS 104
// P3.16
import java.util.Scanner;
public class Assignment3part2
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        // We ask the user for input and we ask them to type 3 strings. 
        System.out.print("Enter three strings: "); 
        String wordOne = in.next();
        String wordTwo = in.next();
        String wordThree = in.next();

        //We will print this line to separate the input with the strings in alphabetical order. 
        System.out.println("This are the strings in alphabetical order:");  

        // Basically what we will do is compare each one and try to recreate and check
        // all the possible outputs. In order to compare the alphabetical order of the
        // strings I found in the book that we had: stringOne.compareTo(stringTwo) < 0. 
        // So basically we use this to make a comparison between the three strings and 
        // recreate all the possible options. 
        
        if (wordOne.compareTo(wordTwo) < 0 && wordTwo.compareTo(wordThree) < 0 && wordOne.compareTo(wordThree) < 0)
        {
            System.out.println(wordOne);
            System.out.println(wordTwo);
            System.out.println(wordThree);

        }
        else if (wordOne.compareTo(wordTwo) < 0 && wordTwo.compareTo(wordThree) < 0 && wordThree.compareTo(wordOne) < 0)
        {
            System.out.println(wordOne);
            System.out.println(wordThree);
            System.out.println(wordTwo);
        }
        else if (wordTwo.compareTo(wordOne) < 0 && wordTwo.compareTo(wordThree) < 0 && wordOne.compareTo(wordThree) < 0)
        {
            System.out.println(wordTwo);
            System.out.println(wordOne);
            System.out.println(wordThree);
        }
        else if (wordTwo.compareTo(wordOne) < 0 && wordTwo.compareTo(wordThree) < 0 && wordThree.compareTo(wordOne) < 0)
        {
            System.out.println(wordTwo);
            System.out.println(wordThree);
            System.out.println(wordOne);
        }
        else if (wordThree.compareTo(wordTwo) < 0 && wordThree.compareTo(wordOne) < 0 && wordOne.compareTo(wordTwo) < 0)
        {
            System.out.println(wordThree);
            System.out.println(wordOne);
            System.out.println(wordTwo);
        }
        else if (wordThree.compareTo(wordTwo) < 0 && wordThree.compareTo(wordTwo) < 0 && wordTwo.compareTo(wordOne) < 0)
        {
            System.out.println(wordThree);
            System.out.println(wordTwo);
            System.out.println(wordOne);
        }

    }
}