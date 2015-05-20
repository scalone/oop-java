package br.edu.fatecfranca.list5;

public class Beagle extends Dog {
	@Override
	public void walk() {
		this.setSteps(this.getSteps() + 4);
	}
}
