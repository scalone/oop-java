
package br.edu.fatecfranca.list4.e1;

public class Passenger {
	private String name;
	private Reserve reserve;

	public Passenger(Reserve reserve, String name) {
		this.reserve = reserve;
		this.name    = name;
	}

	public Passenger() {
		this(new Reserve(), "Daniel");
	}

	public String getName() {
		return this.name;
	}

	public Reserve getReserve() {
		return this.reserve;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setReserve(Reserve reserve) {
		this.reserve = reserve;
	}

	public String show() {
		return "Passenger Name: " + this.name +
			" Reserve Id: " + this.reserve.getId();
	}
}

