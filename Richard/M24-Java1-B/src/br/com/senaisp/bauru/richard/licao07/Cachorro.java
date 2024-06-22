package br.com.senaisp.bauru.richard.licao07;

public class Cachorro extends Mamifero{
	//Campos/Fields
	private boolean quadrupede;
	//Constructor
	//Getters e Setters
	public boolean isQuadrupede() {
		return quadrupede;
	}

	public void setQuadrupede(boolean quadrupede) {
		this.quadrupede = quadrupede;
	}
	//Métodos
	public void falar() {
		System.out.println("Au Au Au!");
	}
	@Override
	public String toString() {
		return super.toString()+
				"Quadrupede: " + quadrupede+ "\n";
	}
}
