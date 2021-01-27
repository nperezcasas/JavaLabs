
/**
 * This is the porgram tester to show that the checkanswer is accurate to
 * 0.01 positions. 
 */
public class Tester
{
   public static void main(String[] args)
   {
       // I had to create two separate methods to check two different 
       // responses. 
       testingOne();
       testingTwo();
   }
   /**
    * This method checks a first value.
    */
   public static void testingOne()
   {
       NumericQuestion q = new NumericQuestion();
       q.setText("How much are the fries?");
       q.setAnswer(2.14); 

       System.out.print("Testing 2.10 , should be false: ");
       System.out.print(q.checkAnswer("2.10"));
       System.out.println();
   }
   /**
    * This method checks a second value.
    */
   public static void testingTwo()
   {
       NumericQuestion q = new NumericQuestion();
       q.setText("How much are the fries?");
       q.setAnswer(2.14);     

       System.out.print("Testing 2.15 , should be true: ");
       System.out.println(q.checkAnswer("2.15"));       
   }
}
