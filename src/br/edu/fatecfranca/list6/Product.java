
package br.edu.fatecfranca.list6;
import java.util.Random;

public class Product {
	private int serial;
	private int volume;
	private int chance=90;
	private String state="Not Tested";

	public Product(int serial, int volume) {
		this.serial = serial;
		this.volume = volume;
	}

	public Product() {
		this(1, 5);
	}

	private boolean doTest() {
		Random rn = new Random();
		int number = rn.nextInt(100) + 1;
		if (number <= chance) {
			return true;
		} else {
			return false;
		}
	}

	private void setState(String state) {
		this.state = state;
	}

	public String toString() {
		String value = "Product Serial: " +
			this.serial + " Volume: " +
			this.volume + " Test: ";

		if (this.state.equals("Approved")) {
			return value + "Ok";
		} else {
			return value + "Not Ok";
		}
	}

	public boolean testUnit() throws Exception {
		if (this.state.equals("Not Tested")) {
			if (doTest()) {
				this.setState("Approved");
				return true;
			} else {
				this.setState("Not Approved");
				return false;
			}
		} else {
			throw new Exception("Already Tested");
		}
	}

	public void setChance(int chance) {
		this.chance = chance;
	}

	public int getChance(int chance) {
		return this.chance;
	}

	public int getSerial() {
		return this.serial;
	}

	public String getState() {
		return this.state;
	}

	public int getVolume() {
		return this.volume;
	}
}

