
package br.edu.fatecfranca.list5;

public class Animal {
	private String name;

	public Animal(String name) {
		this.name = name;
	}

	public Animal() {
		this.name = "Whale";
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public String speak() {
		return "I don't speak";
	}

	public String info() {
		return "Class: " + this.getClass().getName() + ", Name: " + this.name;
	}
}
