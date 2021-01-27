import java.util.LinkedList;
/**
 * COMS 104
 * Nuria Perez Casas
 * Assignment 10
 * 
 * This class is the tester to see if the contains method works. 
 * After creating a linked list it checks if the given word is part
 * of the list and returns true or false
 */
public class LinkedListTester
{
    public static void main(String[] args)
    {
        // I Created a list with the best soft drinks. 
        LinkedList<String> soda = new LinkedList<String>();
        soda.add("Coke");
        soda.add("Pepsi");
        soda.add("Mountain Dew");
        soda.add("Fanta");
        soda.add("Sprite");

        System.out.println("We are going to test if Coke is on the list, response should be true");
        System.out.println(soda.contains("Coke"));

        System.out.println("We are going to test if Dr Peper is on the list, response should be false");
        System.out.println(soda.contains("Dr Pepepr"));


    }
}