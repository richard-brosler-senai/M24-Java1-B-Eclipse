package br.com.senaisp.bauru.richard.licao05;

public class Forca {
	private String palavraSecreta;
	private int erros;
	private String visualizacao;
	//Constructor
	public Forca() {
		palavraSecreta = "java";
		erros = 0;
		visualizacao = "";
		// Carregar os traços na visualização
		int i = 0;
		while(i<palavraSecreta.length()) {
			visualizacao += "-";
			i++;
		}
	}
	
	public void mostrarForca() {
		String linSup = ( erros == 0 ? "   " : 
			              erros == 1 ? " 0 " :
			              erros == 2 ? "\\0 " :
			              erros > 2 ? "\\0/" : "  " );
		String linBod = erros >= 4 ? " |" : " ";
		String linInf = erros == 5 ? "/  " :
			            erros >= 6 ? "/ \\" : "  "; 
		System.out.println(" +-----+");
		System.out.println(" |    " + linSup);
		System.out.println(" |    " + linBod);
		System.out.println(" |    " + linInf);
		System.out.println(" |");
		System.out.println(" +==========");
		System.out.println();
		System.out.println(" " + visualizacao);
	}
	
	public boolean verificaLetra(char letra) {
		boolean ret = false;
		if (palavraSecreta.indexOf(letra)>-1) {
			int i = 0;
			String apoio = "";
			while (i<palavraSecreta.length()) {
				if (palavraSecreta.charAt(i)==letra) {
					apoio += ""+letra;
				} else {
					apoio += ""+visualizacao.charAt(i);
				}
				i++;
			}
			visualizacao = apoio;
			ret = true;
		} else {
			erros++;
		}
		return ret;
	}
}
