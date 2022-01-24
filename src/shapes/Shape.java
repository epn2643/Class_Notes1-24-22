package shapes;

/**
 * This interface defines two methods for any Shape:  area()
 * and perimeter().
 *
 * If any class implements this interface but does not provide
 * an implementation for both area() and perimeter(), that class
 * is abstract.
 *
 * Notice the syntax for the methods below.
 *
 * @author      Trudy Howles tmh@cs.rit.edu
 *
 */
public interface Shape {

   /**
      * Calculate the area of this shape 
      *
      * @return the calculated area
      */
   
    public double area();


    /**
      * Calculate the perimeter of this shape 
      *
      * @return the calculated perimeter
      */

    public double perimeter();
}

