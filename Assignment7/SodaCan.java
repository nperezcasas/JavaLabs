/**
 * COMS 104
 * Nuria Perez Casas
 * Assingment #7
 * 
 * Class tha implements the Measurable inerface. 
 * Gets the volume and the surface area of a soda can with any measures.  
 */
public class SodaCan implements Measurable
{
    private double height;
    private double radius;

    /**
     * Constructor that sets up the instance variables with two parameters.
     * @param height
     * @param radius
     */
    public SodaCan(double height, double radius)
    {
        this.height = height;
        this.radius = radius;
    }
    /**
     * Calculates and gets the surface area of the soda can. 
     * @return the surface area
     */
    public double getSurfaceArea()
    {
        double surface = 2 * Math.PI * radius * (radius + height);
        return surface;
    }
    /**
     * Calculates and gets the volume of the soda can. 
     * @return the volume
     */
    public double getVolume()
    {
        double volume = Math.PI * radius * radius * height;
        return volume;
    }
    /**
     * Returns the area of the soda can. 
     * @return the area of the soda can
     */
    public double getMeasure()
    {
        return getSurfaceArea();
    }
}