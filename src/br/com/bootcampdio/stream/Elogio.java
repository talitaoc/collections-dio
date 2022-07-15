package br.com.bootcampdio.stream;

public interface Elogio {

	String elogiar(String palavra); //todo metodo de interface é abstrato
	
	default String xingar(String palavra) {
		return null;
	};
	
	default String falar(String palavra) {
		return null;
	};
	
}

/*
 * A interface elogio possui 1 unico método abstrato, por isso podemos utilizar
 * como interface funcional e atribuir ao lambda dentro do main. 
 * Classe anonima pode ter vários métodos e implementar qlqr um no main através da classe
 * 
 */
