package utils;

import java.util.Scanner;

import geometry.Circle;
import geometry.Rectangle;

public class Calculator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Welcome print 
		System.out.println("Welcome to Calculator class that calculates area of circle and rectangle using Circle and Rectangle class:  ");
		//Take User Input - Radius, Length & Breadth 
		System.out.print("Enter radius for Circle: ");
		double radius = input.nextDouble();
		System.out.print("Enter Length of rectangle: ");
		int rect_l = input.nextInt();
		System.out.print("Enter breadth of rectangle: ");
		int rect_b = input.nextInt();
		
		//Class object 
		Circle cir = new Circle(radius);
		Rectangle rect = new Rectangle(rect_l, rect_b);
		Calculator cal = new Calculator();
		System.out.println(cir.cir_Area(radius));
		System.out.print(rect.rect_Area(rect_l,rect_b));

	}
}
