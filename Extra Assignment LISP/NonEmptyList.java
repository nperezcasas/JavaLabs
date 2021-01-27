/**
 * COMS 104
 * Nuria Perez Casas
 * Extra Credit Lisp List (P 16.15, 16.16, 16.18)
 */
public class NonEmptyList implements LispList
{
    private Object head;
    private LispList tail;
 
    public NonEmptyList (Object h, LispList t)
    {
        head = h;
        tail = t;
    }

    /**
     * For our list we will return false to empty(), and then for head,
     * we will return the head (h), and for tail, we will return the tail(t).
     */
    public boolean empty()
    {
        return false;
    }
    public Object head()
    {
        return head;
    }
    public LispList tail()
    {
        return tail;
    }

    /**
     * To transform the list into a string, it will return the 
     * head and tail of the lisp list with a space transforming it 
     * into a string using the built in method .toString. 
     */
    public String toString()
    {
        return head() + " " + tail().toString();
    }

    /**
     * We will split the to string method by the spaces and count the
     * lenght using the .length built in method.
     * @return the length of the list 
     */
    public int length()
    {
        return toString().split(" ").length;
    }


    /**
     * Recursive function that will check if the element is on the list. 
     */
    public boolean contains(Object obj)
    {
        if (head().toString() == obj.toString()) // First it checks the heads. 
        {
            return true; 
        }
        else if (!tail.empty()) // Then it checks the tail if the tail isn't empty
        {
            return tail().contains(obj); // Function calls itself.
        }
        else 
        {
            return false; //Finally if it is not here it returns false. 
        }
    }
}