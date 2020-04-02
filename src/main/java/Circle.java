/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Danny
 */
public class Circle {
    double radius;
	final double PI = 3.1415926535897932384626433832795;
	
	
	public double getRadius()
	{
		return radius;
	}
	
	public double getArea(){
		return PI * radius * radius;
	}
	
	public double getDiameter(){
		return 2 * radius;
	}
	
	public double getCircumference(){
		return 2 * PI * radius;
	}
}

