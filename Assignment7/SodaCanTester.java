import java.util.ArrayList;

/**
 * This program tests our SodaCan class.
 */
public class SodaCanTester
{
    /**
     * Method that calculates and returns the average area of the soda can array list.
     * @param sodaCanArray
     * @return average surface area
     */
    private static double averageArea(ArrayList<int,int> sodaCans)
    {
        double totalArea = 0;
        for (int n : sodaCans)
        {
            totalArea += n.getMeasure();
        }
        return totalArea / sodaCanArray.length;
    }
    public static void main(String[] args)
    {
        ArrayList<int, int> sodaCans = new ArrayList<int, int>();
        sodaCans.add(4,2);
        SodaCans.add(2,3);
        sodaCans.add(3,4);
        sodaCans.add(1,10);
        sodaCans.addSodaCan(0,3);

        System.out.println("Average area: " + averageArea(sodaCans));
    }
}