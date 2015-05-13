
package br.edu.fatecfranca.list5;

public class Parrot extends Bird {
	private String vocabulary = "I love cookies";

	public void setVocabulary(String vocabulary) {
		this.vocabulary = vocabulary;
	}

	@Override
	public String speak() {
		return vocabulary;
	}
}

