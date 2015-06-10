
package br.edu.fatecfranca.list6;

public class Radio extends Product {
	private String station="94.9";
	private String band="FM";

	public String listen() {
		return this.station + " " + this.band;
	}

	public void changeStation(String station) {
		this.station = station;
	}

	public void changeBand(String band) {
		this.band = band;
	}

	public String toString() {
		return super.toString() + " Listen: " + this.listen();
	}
}

