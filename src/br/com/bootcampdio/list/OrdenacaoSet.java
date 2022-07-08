package br.com.bootcampdio.list;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class OrdenacaoSet {

	public static void main(String[] args) {
		
		System.out.println("----Ordem Aleatoria----");
		
		Set<Series> minhasSeries = new HashSet<>() {{
			add(new Series("Stranger things", "ficcao", 60));
			add(new Series("Dark", "drama", 60));
			add(new Series("How I meet your mother", "comedia", 25));
			
		}};
		
		for (Series series : minhasSeries) {
			System.out.println(series.getNome() + " - " +
								series.getGenero() + " - " +
								series.getTempoEpisodio());
		}
		
		
		System.out.println();
		
		Set<Series> minhasSeries1 = new LinkedHashSet<>() {{
			add(new Series("Stranger things", "ficcao", 60));
			add(new Series("Dark", "drama", 60));
			add(new Series("How I meet your mother", "comedia", 25));
			
		}};
		
		for (Series series : minhasSeries) {
			System.out.println(series.getNome() + " - " +
								series.getGenero() + " - " +
								series.getTempoEpisodio());
		}
		
		System.out.println("\n\n----Ordem natural----");
		
		Set<Series> minhasSeries2 = new TreeSet<>(minhasSeries1);
		
		for (Series series : minhasSeries2) {
			System.out.println(series.getNome() + " - " +
								series.getGenero() + " - " +
								series.getTempoEpisodio());
		}
		
		
		System.out.println("\n\n----Ordem nome/genero/tempoEpisodio----");
		
		Set<Series> minhasSeries3 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
		
		minhasSeries3.addAll(minhasSeries);
		
		for (Series series : minhasSeries3) {
			System.out.println(series.getNome() + " - " +
								series.getGenero() + " - " +
								series.getTempoEpisodio());
		}
		
		
		
		
	}
	
	
		
}
class ComparatorNomeGeneroTempoEpisodio implements Comparator<Series>{

	@Override
	public int compare(Series s1, Series s2) {
		int nome = s1.getNome().compareTo(s2.getNome());
		
		if(nome != 0) return nome;
		
		int genero = s1.getGenero().compareTo(s2.getGenero());
		
		if(genero != 0) return genero;
		
		return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());

	}	
}
	
