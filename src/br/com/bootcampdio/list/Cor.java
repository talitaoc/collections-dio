package br.com.bootcampdio.list;

import java.util.Objects;

public class Cor implements Comparable<Cor> {

	private String cor;
	
	public Cor(String cor) {
		this.cor = cor;
	}
	
	public String getCor() {
		return cor;
	}

	@Override
	public String toString() {
		return "[" + cor + "]";
	}

	@Override
	public int compareTo(Cor cor) {
		return this.getCor().compareToIgnoreCase(cor.getCor());
	}

	@Override
	public int hashCode() {
		return Objects.hash(cor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cor other = (Cor) obj;
		return Objects.equals(cor, other.cor);
	}



}
