
package br.edu.fatecfranca.list4.e2;

public class Bus {
	private int passengerQuantity;
	private String number;

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
}

