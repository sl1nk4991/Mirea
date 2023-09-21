package ru.mirea.work4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ShapeTest {
    @Test
    void testShape() {
        Shape s1 = new Circle(5.5, "RED", false);
        callMethods(s1);
        /*System.out.println(s1.getRadius());
            Can't call this method due to Shape class doesn't contain such method
         */
        Circle c1 = (Circle)s1;
        callMethods(c1);
        System.out.println(c1.getRadius());
        /*Shape s2 = new Shape();
            Shape is abstract class
            Can't create object of abstract class
         */
        Shape s3 = new Rectangle(1.0, 2.0, "RED", false);
        callMethods(s3);
        Rectangle r1 = (Rectangle)s3;
        System.out.println(r1.getLength());
        Shape s4 = new Square(6.6);
        /*System.out.println(s4.getSide());
            Same as getRadius method
         */
        Rectangle r2 = (Rectangle)s4;
        /*System.out.println(r2.getSide);
            Watch above commentary
         */
        Square sq1 = (Square)r2;
        System.out.println(sq1.getSide());
    }
    void callMethods(Shape obj) {
        System.out.println(obj);
        System.out.println(obj.getArea());
        System.out.println(obj.getPerimeter());
        System.out.println(obj.getColor());
        System.out.println(obj.isFilled());
    }
}
