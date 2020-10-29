package org.l2x9.rectangle;

import java.util.Scanner;

public class Main {
    // Pretend this class is called Rectangle
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the length:");
        double length = input.nextDouble();
        System.out.print("Please enter the width:");
        double width = input.nextDouble();
        Rectangle rectangle = new Rectangle(length, width);
        System.out.println("The area of the rectangle is " + rectangle.getArea());
        rectangle.displayAreaFormula();
        System.out.println("The perimeter of the rectangle is " + rectangle.getPerimeter());
        System.out.println(rectangle);
        System.exit(69);
    }
}
