/*@author Diego Lins
 * @version 19/11
 */

public class Arvore {

	private No raiz;

	public Arvore() {
		raiz = null;
	}

	/*
	 * public String emOrdem(No n) { //ORDENA A ARVORE if (n != null) { return
	 * emOrdem(n.esquerda) + " " + n.elemento + " " + emOrdem(n.direita); } return
	 * ""; }
	 */
	public void adicionaElemento(int e) { // ADICIONA O ELEMENTO//
		No novo = new No(e);
		if (raiz == null)
			raiz = novo;
		else {
			No aux1 = raiz, aux2 = raiz;
			while (aux1 != null && e != aux2.elemento) {
				aux2 = aux1;
				if (e < aux1.elemento)
					aux1 = aux1.esquerda;
				else if (e > aux1.elemento)
					aux1 = aux1.direita;
			}
			if (e == aux2.elemento)
				System.out.println("Elemento já existe");
			else {
				if (e < aux2.elemento)
					aux2.esquerda = novo;
				else if (e > aux2.elemento)
					aux2.direita = novo;
				System.out.println("Elemento Incluído");
			}
		}
	}

	public void verifica(int e) {
		No aux = raiz; // VERIFICA SE O ELEMENTO JA EXISTE///
		while (aux != null) {
			if (e < aux.elemento)
				aux = aux.esquerda;
			else if (e > aux.elemento)
				aux = aux.direita;
			else
				System.out.println("Elemento Repetido");
		}
	}
	public void preOrdem(No n) {
		if(n!=null) {
			System.out.println("Elemento " + n.elemento);
			preOrdem(n.esquerda);
			preOrdem(n.direita);
		}
	}
	public void emOrdem(No n) {
		if(n!=null) {
			emOrdem(n.direita);
			System.out.println("Elemento " + n.elemento);
			emOrdem(n.esquerda);
		}
	}
	public void posOrdem(No n) {
		if(n!=null) {
			posOrdem(n.esquerda);
			posOrdem(n.direita);
			System.out.println("Elemento " + n.elemento);
		}
	}

	
	public No getRaiz() {
		return raiz;
	}
}
