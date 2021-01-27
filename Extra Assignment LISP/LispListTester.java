/**
 * COMS 104
 * Nuria Perez Casas
 * Extra Credit Lisp List (P 16.15, 16.16, 16.18)
 */
public class LispListTester 
{
    public static void main(String[] args)
    {

        LispList list = new NonEmptyList("A", 
        new NonEmptyList("B", new NonEmptyList("C", 
        new EmptyList())));

        System.out.println("The list " + list.toString());
        System.out.println("The lenght of the list: ");
        System.out.print(list.length());
        System.out.println();

        System.out.println("Checks if B is on the list, answer should be true: " + list.contains("B"));
        System.out.println("Checks if D is on the list, answer should be false: " + list.contains("D"));
    }
}