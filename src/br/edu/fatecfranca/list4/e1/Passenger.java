
package br.edu.fatecfranca.list4.e1;

public class Passenger {
	private String name;
	private int reserve_id;

	public Passenger(int reserve_id, String name) {
		this.reserve_id = reserve_id;
		this.name       = name;
	}

	public Passenger() {
		this(1, "Daniel");
	}

	public String getName() {
		return this.name;
	}

	public int getReserveId() {
		return this.reserve_id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setReserveId(int reserve_id) {
		this.reserve_id = reserve_id;
	}

	public String show() {
		return "Passenger Name: " + this.name +
			" Reserve Id: " + this.reserve_id;
	}
}

