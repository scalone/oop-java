
package br.edu.fatecfranca.vehicle;

import javax.swing.JOptionPane;

public class Vehicle {
	public static String ownerName;
	public int wheels;
	public String color;
	public int year;
	public String type;

	public Vehicle(int wheels, String color, int year, String type) {
		this.wheels = wheels;
		this.color  = color;
		this.year   = year;
		this.type   = type;
	}

	public Vehicle() {
		this(4, "blank", 2004, "hat");
	}

	public static void setName(String ownerName) {
		ownerName = ownerName;
	}

	public static String getName() {
		return ownerName;
	}

	public static String isWheelsOdd(int wheels) {
		if ((wheels % 2) == 0) {
			return "pair";
		} else {
			return "odd";
		}
	}

	public static Vehicle merge(Vehicle vehicle1, Vehicle vehicle2) {
		Vehicle vehicle3 = new Vehicle();
		vehicle3.type    = vehicle1.type;
		vehicle3.wheels  = vehicle1.wheels + vehicle2.wheels;
		vehicle3.color   = vehicle2.color;
		if (vehicle1.year >= vehicle2.year) {
			vehicle3.year  = vehicle1.year;
		} else {
			vehicle3.year  = vehicle2.year;
		}

		return vehicle3;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String show() {
		return "\nType: " + this.type         +
		"\nColor: "       + this.color        +
		"\nYear: "        + this.year         +
		"\nWheels: "      + this.wheels       +
		"\nOwner: "       + Vehicle.ownerName;
	}
}
