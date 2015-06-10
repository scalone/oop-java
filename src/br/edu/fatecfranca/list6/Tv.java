
package br.edu.fatecfranca.list6;

public class Tv extends Product {
	private String channel="5";

	public String watch() {
		return this.channel;
	}

	public void changeChannel(String channel) {
		this.channel = channel;
	}

	public String toString() {
		return super.toString() + " Channel: " + this.watch();
	}
}

