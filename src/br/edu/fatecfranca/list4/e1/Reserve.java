
package br.edu.fatecfranca.list4.e1;

public class Reserve {
	private int id;
	private	Flight flight;

	public Reserve(int id, Flight flight) {
		this.id     = id;
		this.flight = flight;
	}

	public Reserve() {
		this(1, new Flight());
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	public Flight getFlight() {
		return this.flight;
	}

	public String show() {
		return "Reserve Id: " + this.id +
			" Flight Id: " + this.flight.getId();
	}
}
