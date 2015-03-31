
package br.edu.fatecfranca.list4.e1;

public class Flight {
	private int id;
	private String destination;

	public Flight(int id, String destination) {
		this.id          = id;
		this.destination = destination;
	}

	public Flight() {
		this(1, "France/Paris");
	}

	public String getDestination() {
		return this.destination;
	}

	public int getId() {
		return this.id;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String show() {
		return "Flight Id: " + this.id +
			" Destination: " + this.destination;
	}
}
