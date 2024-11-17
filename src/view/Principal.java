package view;

import br.edu.fateczl.ArvoreChar.ArvoreChar;
import controller.ArvoreController;

public class Principal {

	public static void main(String[] args) {
		ArvoreController arvCont = new ArvoreController();
		char[] vetor = { 'k', 'd', 'm', 'b', 'f', 'l', 't', 'c', 'p', 'z', 'r' };
		
		ArvoreChar arvore = arvCont.insereElementos(vetor);
		
		try {
			arvore.remove('m');
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		arvCont.printElementos(arvore);
		System.out.println();
		arvore.search('r');
	}

}
