/**
 * Circle.java
 * @author cjohns25
 *
 * Starter class for Chapter 1 array of objects coding assignment
 *
 */

public class Circle
{
    private double radius;

    public Circle()
    {
    }

    public Circle(double radius)
    {
        this.radius = radius;
    }

    /** Return radius */
    public double getRadius()
    {
        return radius;
    }

    /** Set a new radius */
    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    public double getArea()
    {
        return radius * radius * Math.PI;
    }

    /** Return diameter */
    public double getDiameter()
    {
        return 2 * radius;
    }

    public double getPerimeter()
    {
        return 2 * radius * Math.PI;
    }

    /* Print the circle info */
    public void printCircle()
    {
        System.out.println("The circle radius is " + radius);
    }
}
