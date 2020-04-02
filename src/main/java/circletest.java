
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Danny
 */
public class circletest {
    public static void main(String[] args) {
		Circle c = new Circle();
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a radius:");
		c.radius = scan.nextDouble();
		System.out.println("Radius:        " + c.radius);
		System.out.println("Area:          " + c.getArea());
		System.out.println("Diameter:      " + c.getDiameter());
		System.out.println("Circumference: " + c.getCircumference());
		scan.close();

	}

}

