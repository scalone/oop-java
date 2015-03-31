
package br.edu.fatecfranca.list4.e1;

public class Reserve {
	private int id, flight_id;

	public Reserve(int id, int flight_id) {
		this.id        = id;
		this.flight_id = flight_id;
	}

	public Reserve() {
		this(1, 1);
	}

	public int getId() {
		return this.id;
	}

	public int getFlightId() {
		return this.flight_id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setFlightId(int flight_id) {
		this.flight_id = flight_id;
	}

	public String show() {
		return "Reserve Id: " + this.id +
			" Flight Id: " + this.flight_id;
	}
}
