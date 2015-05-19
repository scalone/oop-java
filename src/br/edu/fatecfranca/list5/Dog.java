package br.edu.fatecfranca.list5;

public class Dog extends Mammal {
	private String vocabulary = "au au";

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
}

