
package br.edu.fatecfranca.list4.e2;

public class Passenger {
	private int place;
	private String name;

	public Passenger(int place, String name) {
		this.place = place;
		this.name  = name;
	}

	public Passenger() {
		this(10, "Daniel");
	}

	public int getPlace() {
		return this.place;
	}

	public void setPlace(int place) {
		this.place = place;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String show() {
		return "Place: " + this.place + "; Name: " + this.name;
	}
}

