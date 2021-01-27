// Nuria Perez Casas
// COMS 104
// P3.26
import java.util.Scanner;
public class Assignment3part3
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        // First since we want to create a program that transforms integers to
        // roman numbers we ask the user for input. 
        System.out.print("Enter a number: "); 
        int numNormal = in.nextInt();

        // Now to make it easier to transform we separate the numeral into thousands
        // hundreds, tens and units. To make this we can simply use mathematical 
        // espressions that will make each number a integer of one digit. 

        int numThousands = (numNormal / 1000);
        int numHundreds = (numNormal - numThousands * 1000) / 100;
        int numTens = (numNormal - numThousands * 1000 - numHundreds * 100) / 10;
        int numUnits = (numNormal - numThousands * 1000 - numHundreds * 100 - numTens * 10);
        
        // Once we have this we create a sring where we will add every part when
        // we check the if statements. 
        String romanNumber = "";

        // Now, we basically make each thousand option, since numbers go from 0-3999,
        // we only need 1,2,3 for the thousands. 

        if (numThousands == 3)
        {
            romanNumber += "MMM"; // Now we add to the string the part that we need. 
            // In this case for example, three thousands in roman numerals is MMM. 
        }
        else if (numThousands == 2)
        {
            romanNumber += "MM";
        }
        else if (numThousands == 1)
        {
            romanNumber += "M";
        }
        // Now we repeat the process for the hundreds, the tens and the units. 
        if (numHundreds == 9)
        {
            romanNumber += "CM";
        }
        else if (numHundreds == 8)
        {
            romanNumber += "DCCC";
        }
        else if (numHundreds == 7)
        {
            romanNumber += "DCC";
        }
        else if (numHundreds == 6)
        {
            romanNumber += "DC";
        }
        else if (numHundreds == 5)
        {
            romanNumber += "D";
        }
        else if (numHundreds == 4)
        {
            romanNumber += "CD";
        }
        else if (numHundreds == 3)
        {
            romanNumber += "CCC";
        }
        else if (numHundreds == 2)
        {
            romanNumber += "CC";
        }
        else if (numHundreds == 1)
        {
            romanNumber += "C";
        }
        if (numTens == 9)
        {
            romanNumber += "XC";
        }
        else if (numTens == 8)
        {
            romanNumber += "LXXX";
        }
        else if (numTens == 7)
        {
            romanNumber += "LXX";
        }
        else if (numTens == 6)
        {
            romanNumber += "LX";
        }
        else if (numTens == 5)
        {
            romanNumber += "L";
        }
        else if (numTens == 4)
        {
            romanNumber += "XL";
        }
        else if (numTens == 3)
        {
            romanNumber += "XXX";
        }
        else if (numTens == 2)
        {
            romanNumber += "XX";
        }
        else if (numTens == 1)
        {
            romanNumber += "X";
        }
        if (numUnits == 9)
        {
            romanNumber += "IX";
        }
        else if (numUnits == 8)
        {
            romanNumber += "VIII";
        }
        else if (numUnits == 7)
        {
            romanNumber += "VII";
        }
        else if (numUnits == 6)
        {
            romanNumber += "VI";
        }
        else if (numUnits == 5)
        {
            romanNumber += "V";
        }
        else if (numUnits == 4)
        {
            romanNumber += "IV";
        }
        else if (numUnits == 3)
        {
            romanNumber += "III";
        }
        else if (numUnits == 2)
        {
            romanNumber += "II";
        }
        else if (numUnits == 9)
        {
            romanNumber += "I";
        }

        // Finally, we print the string with all the roman numerals added. 
        System.out.println(romanNumber);
    }

}