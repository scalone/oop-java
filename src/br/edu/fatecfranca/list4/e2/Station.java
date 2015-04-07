
package br.edu.fatecfranca.list4.e2;

public class Station {
	private int busQuantity;
	private String name;
	private String city;

	public Station(int busQuantity, String name, String city) {
		this.busQuantity = busQuantity;
		this.name        = name;
		this.city        = city;
	}

	public Station() {
		this(0, "Principal Station", "Washington/DC");
	}

	public int getBusQuantity() {
		return this.busQuantity;
	}

	public void setBusQuantity(int busQuantity) {
		this.busQuantity = busQuantity;
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
}
