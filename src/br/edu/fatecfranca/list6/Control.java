package br.edu.fatecfranca.list6;

public class Control {
	private Product product;

	public Control(Product product) {
		this.product = product;
	}

	public void perform() throws Exception {
		System.out.println(this.product.toString());
		this.product.testUnit();
		System.out.println("Status: " + this.product.getState());
	}
}

	
