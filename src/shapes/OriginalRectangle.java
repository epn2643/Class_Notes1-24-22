package shapes;

/**
 * This class defines a rectangle.
 * @author James Heliotis
 * January 2022
 */
public class OriginalRectangle {

    private double length;
    private double width;

    /**
     * Constructor for Rectangle objects.
     *
     * @param len the length of the rectangle
     * @param wid the width of the rectangle
     */
    public OriginalRectangle( double len, double wid ) {
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
        return ( 2 * length ) + ( 2 * width );
    }

    /**
     * Test program for OriginalRectangles
     *
     * @param args unused
     **/
    public static void main( String args[] ) {

        OriginalRectangle[] items = {
                new OriginalRectangle( 1, 1 ),
                new OriginalRectangle( 2, 30 ),
                new OriginalRectangle( 10, 3 )
        };

        //  Print out some of the shapes.

        System.out.println( "1st rectangle Area is " + items[ 0 ].area() );
        System.out.println(
                "1st rectangle Perimeter is " + items[ 0 ].perimeter() );
        System.out.println( "3rd rectangle Area is " + items[ 2 ].area() );

        System.out.println();
        double areaSum = 0;
        double perimiterSum = 0;
        for ( OriginalRectangle rect : items ) {
            areaSum += rect.area();
            perimiterSum += rect.perimeter();
        }
        System.out.println( "Area of all is: " + areaSum );
        System.out.println( "Perimeter of all is: " + perimiterSum );
    }

}


