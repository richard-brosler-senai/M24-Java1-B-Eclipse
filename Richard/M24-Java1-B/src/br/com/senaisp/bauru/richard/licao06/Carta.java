package br.com.senaisp.bauru.richard.licao06;

public class Carta {
	public static final String[] NAIPES = {"♦","♠","♥","♣"};
	public static final String[] NUMEROS = {
		"A","2","3","4","5",
		"6","7","8","9","10",
		"J","Q","K"	
	};
	private String naipe;
	private String numero;
	//Constructor
	public Carta(int np, int vl) throws Exception {
		if (np<1 || np>4) {
			throw new Exception("Naipe Inválido!");
		}
		if (vl<1 || vl>13) {
			throw new Exception("Número da carta inválido!");
		}
		naipe = NAIPES[np-1];
		numero = NUMEROS[vl-1];
	}
	@Override
	public String toString() {
		            //1234567
		String txt = "┌─────┐\n"+ //1
					 "│##   │\n"+ //2
					 "│  §  │\n"+ //3
					 "│   ##│\n"+ //4
				     "└─────┘\n"; //5
		txt = txt.replaceFirst("##", numero + 
						( numero.equals("10") ? "" : " "));
		txt = txt.replace("§", naipe);
		txt = txt.replaceFirst("##", 
						( numero.equals("10") ? "" : " ") + 
							numero);
		return txt;
	}
}
