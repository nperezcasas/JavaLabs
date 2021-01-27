

private boolean equal (Object obj, Node currentNode)
{
    /**
     * Use if else statement to compare two nodes and then return
     * Boolean value accordingly.
     */
    if(currentNode.data.equals(obj))
    return true;
    else 
    return false;
}

/**
 * This is a boolean function that will see if the given object is 
 * inside the linked list. If yes it will return true and otherwise
 * it will return false. 
 */

 public boolean contain(Object obj)
 {
     Node Hopper = first;
     while (Hopper.next ! =null)
     {
         if (equal(obj, Hopper))
         {
             return true;
         }
         else 
         {
             Hopper = Hopper.next;
         }
     }
     return false;
 }
