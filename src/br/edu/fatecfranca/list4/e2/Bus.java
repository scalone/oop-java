
package br.edu.fatecfranca.list4.e2;
import java.util.ArrayList;

public class Bus {
	private int passengerQuantity;
	private String number;
	private ArrayList<Passenger> passengers = new ArrayList<Passenger>();

	public Bus(int passengerQuantity, String number) {
		this.passengerQuantity = passengerQuantity;
		this.number            = number;
	}

	public Bus() {
		this(0, "1020-10");
	}

	public int getPassengerQuantity() {
		return this.passengerQuantity;
	}

	public void setPassengerQuantity(int passengerQuantity) {
		this.passengerQuantity = passengerQuantity;
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
		this.passengers.add(passenger);
	}
}

