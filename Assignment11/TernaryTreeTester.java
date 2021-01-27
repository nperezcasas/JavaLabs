/**
 * COMS 104 
 * Nuria Perez Casas
 * Assignment 11
 */

public class TernaryTreeTester
{
    public static void main(String[] args)
    {
        // Make a big tree full of data and nodes that
        // we can do something useful with.
        TernaryTree root = createBigTree();

        // I'm creating an inner class to implement visitor and find the 
        // largest element
        class LargestElement implements Visitor
        {
            public int largest = 0;

            /**
             * Visits the data given and checks if it is larger than the 
             * existing integer
             * @param data the data 
             */
            public void visit (int data)
            {
                if(largest < data)
                {
                    largest = data;
                }
            }
        }
        //We create an instance class for the largest element. 
        LargestElement s = new LargestElement();
        // We pass along the instance class to the preorder method 
        // Created in the TernaryTree class.
        root.preorder(s);

        //Finally after the tree has checked each of its nodes by
        // using the visitor preorder pattern it prints it out. 
        System.out.println("Largest element of the tree: " + s.largest);

    }

    /**
     * Helper method to create a big tree full of stuff.
     */
    public static TernaryTree createBigTree()
    {
        TernaryTree root = new TernaryTree(99);
        TernaryTree a = new TernaryTree(31);
        TernaryTree b = new TernaryTree(21);
        TernaryTree c = new TernaryTree(123);
        TernaryTree d = new TernaryTree(4123);
        TernaryTree e = new TernaryTree(512);
        TernaryTree f = new TernaryTree(6321);
        TernaryTree g = new TernaryTree(721);
        TernaryTree h = new TernaryTree(833);
        TernaryTree i = new TernaryTree(912);
        TernaryTree j = new TernaryTree(1120);
        TernaryTree k = new TernaryTree(131);
        TernaryTree l = new TernaryTree(1212);
        TernaryTree m = new TernaryTree(112343);
        TernaryTree n = new TernaryTree(11234);
        TernaryTree o = new TernaryTree(14325);
        TernaryTree p = new TernaryTree(12346);
        TernaryTree q = new TernaryTree(45217);
        TernaryTree r = new TernaryTree(185);
        TernaryTree s = new TernaryTree(191);
        TernaryTree t = new TernaryTree(2230);
        TernaryTree u = new TernaryTree(22341);
        TernaryTree v = new TernaryTree(23452);
        TernaryTree w = new TernaryTree(23423);
        TernaryTree x = new TernaryTree(2574);
        TernaryTree y = new TernaryTree(285);
        TernaryTree z = new TernaryTree(25536);

        d.setLeftSubtree(a);
        d.setMiddleSubtree(b);
        d.setRightSubtree(c);
        root.setLeftSubtree(d);

        f.setLeftSubtree(e);
        i.setLeftSubtree(f);
        i.setMiddleSubtree(g);
        i.setRightSubtree(h);
        root.setMiddleSubtree(i);

        m.setMiddleSubtree(j);
        m.setRightSubtree(k);
        n.setLeftSubtree(l);
        p.setLeftSubtree(m);
        p.setMiddleSubtree(n);
        p.setRightSubtree(o);

        s.setLeftSubtree(q);
        s.setRightSubtree(r);
        u.setLeftSubtree(t);
        w.setLeftSubtree(s);
        w.setMiddleSubtree(u);
        w.setRightSubtree(v);
        
        y.setLeftSubtree(x);

        z.setLeftSubtree(p);
        z.setMiddleSubtree(w);
        z.setRightSubtree(y);

        root.setRightSubtree(z);

        return root;
    }
}