
package br.edu.fatecfranca.list1;

public class Student {
	public int number;
	public String name;
	public int age;
	public float p1;
	public float p2;

	public Student(int number, String name, int age, float p1, float p2) {
		this.number = number;
		this.name   = name;
		this.age    = age;
		this.p1     = p1;
		this.p2     = p2;
	}

	public Student() {
		this(1, "Name", 20, 7, 7);
	}

	public float finalScore() {
		return ((this.p1 + this.p2) / 2);
	}

	public String show() {
		return this.number + " - " + this.name + " - " + this.age;
	}

	public boolean isApproved() {
		if (this.finalScore() >= 6) {
			return true;
		}
		return false;
	}
}

