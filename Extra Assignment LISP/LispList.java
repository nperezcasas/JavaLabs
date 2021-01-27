/**
 * COMS 104
 * Nuria Perez Casas
 * Extra Credit Lisp List (P 16.15, 16.16, 16.18)
 */
public interface LispList
{
    /**
     * Checks if the list is empty
     * @return true if the list is empty, false if it is not. 
     */
    boolean empty();

    /**
     * @return the head of the list
     */
    Object head();

    /**
     * @return the tail of the list
     */
    LispList tail();

    /**
     * Gets the elements of the list and returns it, if it is empty, it 
     * returns an empty string. 
     * @return elements of the list
     */
    String toString();

    /**
     * @return the lenghts of the list
     */
    int length();


    /**
     * Check if the list contains a certain object.
     * @return true if the list does, and false if it doesn't
     */
    boolean contains(Object obj);
}