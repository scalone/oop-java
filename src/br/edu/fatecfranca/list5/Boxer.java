package br.edu.fatecfranca.list5;

public class Boxer extends Dog {
	@Override
	public void walk() {
		this.setSteps(this.getSteps() + 2);
	}
}

