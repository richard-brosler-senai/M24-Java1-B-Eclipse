package br.com.senaisp.bauru.richard.licao07;

public class Gato extends Mamifero {
	private boolean quadrupede;
	//Getters e Setters
	public boolean isQuadrupede() {
		return quadrupede;
	}

	public void setQuadrupede(boolean quadrupede) {
		this.quadrupede = quadrupede;
	}
	//Métodos
	@Override
	public void falar() {
		System.out.println("Miau Miau");
	}
}
