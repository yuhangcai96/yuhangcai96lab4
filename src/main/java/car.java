/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Danny
 */
public class car {
 private int yearModel;
	private String make;
	private int speed;
	
	public car(int year, String mk){
		yearModel = year;
		make = mk;
		speed = 0;
	}
	
	public static void main(String[] args) {
		car bat = new car(1965, "Bat Mobile");
		bat.accellerate();
		System.out.println(bat.getSpeed());
		bat.accellerate();
		System.out.println(bat.getSpeed());
		bat.accellerate();
		System.out.println(bat.getSpeed());
		bat.accellerate();
		System.out.println(bat.getSpeed());
		bat.accellerate();
		System.out.println(bat.getSpeed());
		bat.brake();
		System.out.println(bat.getSpeed());
		bat.brake();
		System.out.println(bat.getSpeed());
		bat.brake();
		System.out.println(bat.getSpeed());
		bat.brake();
		System.out.println(bat.getSpeed());
		bat.brake();
		System.out.println(bat.getSpeed());
		
	}

	public int getYearModel() {
		return yearModel;
	}

	public void setYearModel(int yearModel) {
		this.yearModel = yearModel;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void accellerate(){
		speed += 5;
		
	}
	
	public void brake(){
		speed -= 5;
		if (speed < 0) speed = 0;
        }
}

	