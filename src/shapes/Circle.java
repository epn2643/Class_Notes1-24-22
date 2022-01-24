package shapes;

/**
 * This class defines a circle which implements
 * the Shape interface to ensure an implementation of area()
 * and perimeter().
 *
 * @author      Trudy Howles tmh@cs.rit.edu
 * @author    T.J. Borrelli tjb@cs.rit.edu     
 *
 **/

public class Circle implements Shape {

    private int radius;        // radius of this circle object

    /**
      * Constructor for Circle objects.
      *
      * @param radius   the radius of this circle.
      *
      */

    public Circle(int radius) {
        this.radius = radius;
    }

    /**
      * Calculate the area of this circle
      *
      * @return the calculated area
      */

    public double area() {
        return Math.PI *  radius * radius;
    }

    /**
      * Calculate the perimeter of this circle
      *
      * @return the calculated perimeter
      */

    public double perimeter() {
        return Math.PI * 2 * radius;
    }

}


