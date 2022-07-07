package br.com.bootcampdio.list;

public class Pergunta {

	
	private String frase;
	private boolean resposta;	

	public Pergunta() {
		
	}
	public Pergunta(String frase, boolean resposta) {
		this.frase = frase;
		this.resposta = resposta;
	}
	
	public String getFrase() {
		return frase;
	}
	public boolean getResposta() {
		return resposta;
	}
	public void setFrase(String frase) {
		this.frase = frase;
	}
	public void setResposta(boolean resposta) {
		this.resposta = resposta;
	}

}
