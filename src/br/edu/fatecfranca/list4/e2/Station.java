
package br.edu.fatecfranca.list4.e2;
import java.util.ArrayList;

public class Station {
	private int busQuantity;
	private String name;
	private String city;
	private ArrayList<Bus> buses;

	public Station(int busQuantity, String name, String city) {
		this.busQuantity = busQuantity;
		this.name        = name;
		this.city        = city;
		this.buses       = new ArrayList<Bus> ();
	}

	public Station() {
		this(0, "Principal Station", "Washington/DC");
	}

	public int getBusQuantity() {
		return this.busQuantity;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public ArrayList<Bus> getBuses() {
		return this.buses;
	}

	public Bus getBus(String number) {
		for(Bus bus: this.buses) {
			if(bus.getNumber().equals(number)) {
				return bus;
			}
		}
		return null;
	}

	public void addBus(Bus bus) {
		this.busQuantity += 1;
		this.buses.add(bus);
	}

	public void createBus(int passengerQuantity, String number) {
		Bus bus = new Bus(passengerQuantity, number);
		addBus(bus);
	}

	public String emitBuses() {
		String list = "";
		for(Bus bus: buses) {
			list = list.concat(bus.show() + "\n");
		}
		return list;
	}
}
