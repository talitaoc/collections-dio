package br.com.bootcampdio.ex;

public class PassagemPorValorEReferencia {

	public static void main(String[] args) {


		Integer idade = 10;
		
		recebeInteiro(idade);
		
		System.out.println(idade);
		
		Pessoa pessoa = new Pessoa("talita");
		
		recebeObjeto(pessoa);
		
		System.out.println(pessoa);
		

	}
	
	public static void recebeObjeto(Pessoa pessoa) {
		System.out.println(pessoa);
		pessoa.setNome("Kohdy");
	}
	
	public static void recebeInteiro(Integer numero) {
		System.out.println(numero);
		numero = 20;
	}

}
