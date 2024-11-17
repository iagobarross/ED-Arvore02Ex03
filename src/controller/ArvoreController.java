package controller;

import br.edu.fateczl.ArvoreChar.ArvoreChar;

public class ArvoreController {
	
	public ArvoreChar insereElementos(char[] vetor) {
		ArvoreChar arvore = new ArvoreChar();
		for(char valor:vetor) {
			arvore.insert(valor);
		}
		return arvore;
	}
	
	public void printElementos(ArvoreChar arvore) {
		try {
			System.out.print("Prefix: ");
			arvore.prefixSearch();
			System.out.println();
			System.out.print("Infix: ");
			arvore.infixSearch();
			System.out.println();
			System.out.print("Postfix: ");
			arvore.postfixSearch();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
}
