import java.util.Scanner;

/**
   This program turns an integer into its English name.
*/
public class IntegerName
{
   public static void main(final String[] args) 
   {
      final Scanner in = new Scanner(System.in);
      System.out.print("Please enter an integer between -1,000,000,000 and 1,000,000,000: ");
      int input = in.nextInt();
      String lastName = ""; //This will be the last name when all the things are checked that will be printed out. 
      if (input == 0) // We first check if the number is 0. If it is we'll simply print zero. 
      {
         lastName = "zero";
      }
      else if (input < 0) // This part is to handle if the number is negative. If it is we will change the sign and 
      // and make it run through the function that tranforms it into a name (finalNumber).
      {
         input = -input;
         lastName = "negative " + finalNumber(input);
      }
      else 
      {
         lastName = finalNumber(input);
      }
      System.out.println(lastName);
   }

      /**
    * This is the second most important function after the main one it turns a number into its English name.
    * 
    * It handles all number to name transitions and it calls all the original functions that were already on the program. 
    *
    * @param number any integer between -1000000000 and 1000000000
    * @return the name of the number (e.g. "two hundred seventy four")
    */
   public static String finalNumber(int number)
   {
      String finalName = "";
      if (number >= 1000000) // This statement will handle if the number is larger than a million and using subrtaction and 
      // division it will check the millions, the thousands and finally the hundreds that were already in the original method. 
      {
         int millionNumber = (number / 1000000);
         int thousandsNumber = ((number - (millionNumber*1000000)) / 1000);
         int hundredsNumber = (number - ((millionNumber*1000000) + (thousandsNumber*1000))); 
         finalName = (intName(millionNumber) + " million " + intName(thousandsNumber) + " thousand " + intName(hundredsNumber));
      } 
      else if (number >= 1000) // This statement will handle if the number is larger than a thousand and using subrtaction and 
      // division it will check the thousands and the hundreds.
      {
         int thousandsNumber = (number / 1000);
         finalName = (intName(thousandsNumber) + " thousand " + intName(number - (thousandsNumber * 1000)));
      } 
      else // If the number is smaller than a thousand it will just go through the original method. 
      {
         finalName = (intName(number));
      }
      return finalName;
   }


   /**
    * Turns a number into its English name.
    * 
    * @param number any integer between -1000000000 and 1000000000
    * @return the name of the number (e.g. "two hundred seventy four")
    */
   public static String intName(int number) 
   {
      int part = number; // The part that still needs to be converted
      String name = ""; // The name of the number

      if (part >= 100) 
      {
         name = digitName(part / 100) + " hundred";
         part = part % 100;
      }

      if (part >= 20) 
      {
         name = name + " " + tensName(part);
         part = part % 10;
      } 
      else if (part >= 10) 
      {
         name = name + " " + teenName(part);
         part = 0;
      }

      if (part > 0) 
      {
         name = name + " " + digitName(part);
      }

      return name;
   }

   /**
    * Turns a digit into its English name.
    * 
    * @param digit an integer between 1 and 9
    * @return the name of digit ("one" ... "nine")
    */
   public static String digitName(int digit) 
   {
      if (digit == 1) 
      {
         return "one";
      }
      if (digit == 2) 
      {
         return "two";
      }
      if (digit == 3) 
      {
         return "three";
      }
      if (digit == 4)
      {
         return "four";
      }
      if (digit == 5) 
      {
         return "five";
      }
      if (digit == 6) 
      {
         return "six";
      }
      if (digit == 7) 
      {
         return "seven";
      }
      if (digit == 8) 
      {
         return "eight";
      }
      if (digit == 9) 
      {
         return "nine";
      }
      return "";
   }

   /**
    * Turns a number between 10 and 19 into its English name.
    * 
    * @param number an integer between 10 and 19
    * @return the name of the given number ("ten" ... "nineteen")
    */
   public static String teenName(int number) 
   {
      if (number == 10) 
      {
         return "ten";
      }
      if (number == 11) 
      {
         return "eleven";
      }
      if (number == 12) 
      {
         return "twelve";
      }
      if (number == 13) 
      {
         return "thirteen";
      }
      if (number == 14) 
      {
         return "fourteen";
      }
      if (number == 15) 
      {
         return "fifteen";
      }
      if (number == 16) 
      {
         return "sixteen";
      }
      if (number == 17) 
      {
         return "seventeen";
      }
      if (number == 18) 
      {
         return "eighteen";
      }
      if (number == 19) 
      {
         return "nineteen";
      }
      return "";
   }

   /**
    * Gives the name of the tens part of a number between 20 and 99.
    * 
    * @param number an integer between 20 and 99
    * @return the name of the tens part of the number ("twenty" ... "ninety")
    */
   public static String tensName(int number)
   {   
      if (number >= 90) { return "ninety"; }
      if (number >= 80) { return "eighty"; }
      if (number >= 70) { return "seventy"; }
      if (number >= 60) { return "sixty"; }
      if (number >= 50) { return "fifty"; }
      if (number >= 40) { return "forty"; }
      if (number >= 30) { return "thirty"; }
      if (number >= 20) { return "twenty"; }
      return "";
   }
}
