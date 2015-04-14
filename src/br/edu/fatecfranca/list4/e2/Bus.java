
package br.edu.fatecfranca.list4.e2;
import java.util.ArrayList;

public class Bus {
	private int passengerQuantity;
	private String number;
	private ArrayList<Passenger> passengers;
	private static ArrayList<Bus> buses = new ArrayList<Bus>();

	public Bus(int passengerQuantity, String number) {
		this.passengerQuantity = passengerQuantity;
		this.number            = number;
		this.passengers = new ArrayList<Passenger>();

		Bus.addBus(this);
	}

	public Bus() {
		this(0, "1020-10");
	}

	public static void addBus(Bus bus) {
		buses.add(bus);
	}

	public static ArrayList<Bus> getBuses() {
		return buses;
	}

	public static Bus getBus(int number) {
		return getBuses().get(number);
	}

	public int getPassengerQuantity() {
		return this.passengerQuantity;
	}

	public String getNumber() {
		return this.number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public ArrayList<Passenger> getPassengers() {
		return this.passengers;
	}

	public void createPassenger(int place, String name) {
		Passenger passenger = new Passenger(place, name);
		addPassenger(passenger);
	}

	public void addPassenger(Passenger passenger) {
		this.passengerQuantity += 1;
		this.passengers.add(passenger);
	}

	public String emitPassengers() {
		String list = "";
		for(Passenger passenger: this.passengers) {
			list = list.concat(passenger.show() + "\n");
		}

		return list;
	}

	public String show() {
		return "Bus Number: " + this.getNumber() + "; Quantity of Passengers: " + this.getPassengerQuantity();
	}
}

