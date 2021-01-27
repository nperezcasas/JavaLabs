/**
 * COMS 104
 * Nuria Perez Casas
 * Extra Credit Lisp List (P 16.15, 16.16, 16.18)
 */
public class EmptyList implements LispList
{
    public EmptyList() 
    {}

    /**
     * Since the list is empty we will return true to the function empty(),
     * and null to the head and tail. 
     */
    public boolean empty()
    {
        return true;
    }
    public Object head()
    {
        return null;
    }
    public LispList tail()
    {
        return null;
    }

    public String toString()
    {
        return "";
    }

    // Since the list is empty the length is 0 
    public int length()
    {
        return 0;
    }

    // Since the list is empty it doesn't contain the object we were looking
    // for. 
    public boolean contains(Object obj)
    {
        return false;
    }
}