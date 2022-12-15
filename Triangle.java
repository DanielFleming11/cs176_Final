package part1;

/**
 * Your name: Daniel Fleming
 * 
 * Defines the Triangle class, which consists of 3 Point class objects
 * 
 * Complete Constructor #1 below.
 */
public class Triangle
{
    // Instance variables:
    private Point p1;
    private Point p2;
    private Point p3;

    /**
     * Constructor #1
     */
    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3)
    {
        // Complete this Triangle constructor.
        // 1 - Construct Points p1, p2, and p3 from the 6 input parameters (x1, y1, x2, y2, x3, y3).
        //     See the Point class.
    	
    	Point p1 = new Point(x1,y1);
    	Point p2 = new Point(x2,y2);
    	Point p3 = new Point(x3,y3);

    }

}
