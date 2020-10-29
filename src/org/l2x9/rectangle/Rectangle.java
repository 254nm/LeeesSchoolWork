package org.l2x9.rectangle;

import java.util.HashMap;

public class Rectangle {
	private final double length;
	private final double width;

	public Rectangle() {
		length = 5;
		width = 60;
	}

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	public double getArea() {
		return length * width;
	}

	public double getPerimeter() {
		return length * 2 + width * 2;
	}
	public double getLength() {
		return length;
	}

	public double getWidth() {
		return width;
	}

	public void displayAreaFormula() {
		System.out.println("The formula for the area of a rectangle is a=l*w");
	}

	@Override
	public String toString() {
		return "Area and Perimeter: " + getArea() + " " + getPerimeter();
	}
}
