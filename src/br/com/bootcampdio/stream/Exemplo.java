package br.com.bootcampdio.stream;

public class Exemplo {

	public static void main(String[] args) {
		
		
		
		Elogio elogio = new Elogio() {
			
			@Override
			public String elogiar(String palavra) {
				
				return palavra + " eh Legal! ";
			}
		};
		
		System.out.println(elogio.elogiar("Java"));

		
		Elogio elogio2 = palavra -> palavra + " eh interessante";
		
		System.out.println(elogio2.elogiar("Classe anonima"));
		
		Elogio elogio3 = melancia -> melancia + " eh estranho ";
		
		System.out.println(elogio3.elogiar("Lambda"));
	}

}

