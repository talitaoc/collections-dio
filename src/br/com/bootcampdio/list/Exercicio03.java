package br.com.bootcampdio.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Exercicio03 {

	public static void main(String[] args) {

		System.out.println("----Cores do Arco-Iris----");
		
		Set<Cor> arcoiris = new HashSet<>() {{
			add(new Cor("vermelho"));
			add(new Cor("laranja"));
			add(new Cor("amarelo"));
			add(new Cor("verde"));
			add(new Cor("azul"));
			add(new Cor("azul escuro"));
			add(new Cor("violeta"));
			
		}};
		System.out.println("--- Lista de cores do arcoiris ----");
		
		listaDeCores(arcoiris);
		
		System.out.println("\n\n--- Soma da quantidade de cores ----");
		System.out.println(arcoiris.size());
	
		
		System.out.println("\n\n--- Cores em ordem alfabetica ----");
		
		coresOrdemAlfabetica(arcoiris);
		
		System.out.println("\n\n--- Cores em ordem inversa ----");
		
		coresInversas(arcoiris);
		
		System.out.println("\n\n--- Cores que comecam com v ----");
		
		printarStartWithV(arcoiris);
		
		System.out.println();
		
		printarStarWithVWithStream(arcoiris);
		
		System.out.println("\n\n--- Cores que nao comecam com v ----");
		
		removerCoresQueNaoComecamComV(arcoiris);
		
		System.out.println("\n\n--- Limpar o conjunto ----");
		
		limparOConjunto(arcoiris);
		
		System.out.println(arcoiris);
		
		System.out.println("\n\n--- O conjunto esta vazio:  " + arcoiris.isEmpty());
				
	}
	
	public static void listaDeCores(Set<Cor> arcoiris) {
		
		for (Cor cor : arcoiris) {
			System.out.println(cor.getCor());
		}
	}
	
	public static void coresOrdemAlfabetica(Set<Cor> arcoiris) {
		
		Set<Cor> arcoiris2 = new TreeSet<>(arcoiris);
		for (Cor cor : arcoiris2) {
			System.out.println(cor.getCor());
		}
		
	}
	
	public static void coresInversas(Set<Cor> arcoiris) {
		
	Set<Cor> arcoiris2 = new TreeSet<>(new ComparatorCorReverso());
			
			arcoiris2.addAll(arcoiris);
			
			for (Cor cor : arcoiris2) {
				System.out.println(cor.getCor());
			}
		
	}

	public static void printarStartWithV(Set<Cor> arcoiris) {
		
		List<Cor> lista	= new ArrayList<>();
		
		for (Cor cor : arcoiris) {
			
			if(cor.getCor().startsWith("v")) {
				lista.add(cor);
			}
		}
		
		System.out.println(lista);
		
	}
	public static void printarStarWithVWithStream(Set<Cor> arcoiris) {
		
		arcoiris.stream().filter(cor -> cor.getCor().startsWith("v")).forEach(System.out::println);
		
	}
	
	public static void coresQueNaoComecamComV(Set<Cor> arcoiris) {
		
		//arcoiris.stream().filter(cor -> !cor.getCor().startsWith("v")).forEach(System.out::println);
		
		List<Cor> lista	= new ArrayList<>();
		
		for (Cor cor : arcoiris) {
			
			if(!cor.getCor().startsWith("v")) {
				lista.add(cor);
			}
		}
		
		System.out.println(lista);
		
	}
	public static void removerCoresQueNaoComecamComV(Set<Cor> arcoiris) {
		
		Set<Cor> arcoirisSemV = new TreeSet<>();
	
		for (Cor cor : arcoiris) {
			
			if(!cor.getCor().startsWith("v")) {
				arcoirisSemV.add(cor);
			}
		}
		
		System.out.println(arcoirisSemV);
		
	}
	
	public static void limparOConjunto(Set<Cor> arcoiris) {
			
			arcoiris.removeAll(arcoiris);
		}

}

class ComparatorCor implements Comparator<Cor>{

	@Override
	public int compare(Cor o1, Cor o2) {
		return o1.getCor().compareTo(o2.getCor());
	}

}
class ComparatorCorReverso implements Comparator<Cor>{

	@Override
	public int compare(Cor o1, Cor o2) {
		return -1 * (o1.getCor().compareTo(o2.getCor()));
	}

}
