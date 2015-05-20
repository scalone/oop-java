package br.edu.fatecfranca.list5;

public class Dog extends Mammal {
	private String vocabulary = "au au";
	private int steps         = 0;

	public void setVocabulary(String vocabulary) {
		this.vocabulary = vocabulary;
	}

	@Override
	public String speak() {
		return vocabulary;
	}

	public void setBarkHigh() {
		this.setVocabulary("AU AU");
	}

	public void setBarkLow() {
		this.setVocabulary("au au");
	}

	public void setSteps(int steps) {
		this.steps = steps;
	}

	public int getSteps() {
		return this.steps;
	}

	public void walk() {
		this.setSteps(this.steps + 1);
	}

	public String info() {
		return this.getClass().getSimpleName() + ": " + this.getName() + ", steps: " + this.getSteps();
	}
}

