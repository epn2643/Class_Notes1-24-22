package shapes;

/**
 * This class defines a rectangle which implements
 * the Shape interface to ensure an implementation of area()
 * and perimeter().
 *
 * @author      Trudy Howles tmh@cs.rit.edu
 * @author    T.J. Borrelli    tjb@cs.rit.edu
 *
 */
public class Rectangle implements Shape {

    static final int SIDES = 2;        //  # of equal sides
    private int length;            // length in inches
    private int width;            // width in inchese

    /**
      * Constructor for Rectangle objects.
      *
      * @param len     the length of the rectangle
      * @param wid    the width of the rectangle
      *
      */

    public Rectangle(int len, int wid) {
        width = wid;
        length = len;
    }


    /**
      * Calculate the area of this rectangle 
      *
      * @return the calculated area
      */

    public double area() {
        return length * width;
    }


    /**
      * Calculate the perimeter of this rectangle 
      *
      * @return the calculated perimeter
      */

    public double perimeter() {
        return (SIDES * length) + (SIDES * width);
    }
}


