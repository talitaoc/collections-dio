package br.com.bootcampdio.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemplosList {

	public static void main(String[] args) {
		
		System.out.println("Crie uma lista e adicione as sete notas ");
		
		
		List<Double> notas = new ArrayList<>();
	
		List<Double> notas3 = List.of(7d, 8.5, 9.3, 5d, 8d, 3.6); //lista imutável
		
		notas.add(7d);
		notas.add(8.5);
		notas.add(9.3);
		notas.add(5d);
		notas.add(8d);
		notas.add(3.6);
		notas.add(0.0);
		
		System.out.println(notas);
		System.out.println(notas.toString());
		
		
		System.out.println("\n\nExiba a posição da nota 5.0: ");
		
		System.out.println(notas.indexOf(5d));
		
		System.out.println("\n\nAdicione na lista a nota 8.8 na posição 4: ");
		notas.add(4,8.8);
		System.out.println(notas);
		
		System.out.println("\n\nSubstitua a nota 5.0 pela nota 6.0");
		notas.set(notas.indexOf(5d), 6.0);
		System.out.println(notas);
		
		System.out.println("\n\nConfira se a nota 5.0 está na lista ");
		System.out.println(notas.contains(5d));
		
		System.out.println("\n\nExiba todas as notas na ordem que foram informadas: ");
		for(Double nota: notas) {
			System.out.println(nota);
		}
		
		System.out.println("\n\n Exiba a terceira nota adicionada: " + notas.get(2));
	
	
		System.out.println(notas.toString());
		
		System.out.println("\n\nExiba a menor nota: " + Collections.min(notas));
	
		System.out.println("\n\nExiba a maior nota: " + Collections.max(notas));
		
		System.out.println("\n\nExiba a soma dos valores: ");
		
		Iterator<Double> iterator = notas.iterator();
		
		Double soma = 0d;
		
		while(iterator.hasNext()) {
			
			Double next = iterator.next();
			soma += next;
		}
		
		System.out.println(soma);
		
		System.out.println("\n\nExiba a média das notas: " + soma/notas.size());
	
		System.out.println("\n\nRemova a nota 0: ");
		notas.remove(0d);
		System.out.println(notas.toString());
		
		System.out.println("\n\nRemova a nota da posição 0: ");
		notas.remove(0);
		System.out.println(notas.toString());
		
		System.out.println("\n\nRemova as notas menores que 7 e exiba a lista: ");
		
		Iterator<Double> iterator1 = notas.iterator();
		while(iterator1.hasNext()) {
			Double next = iterator1.next();
			if(next < 7 ) {
				iterator1.remove();
			}
		}
		System.out.println(notas.toString());
		
		System.out.println("\n\nApague toda a lista: ");
		notas.clear();
		System.out.println(notas.toString());
		
		System.out.println("\n\nConfira se a lista está vazia: " + notas.isEmpty());
	
	
		System.out.println("\n\n\nCrie uma lista chamada notas2 e coloquei todos os elementos da lista arraylist nessa nova lista");
		System.out.println("\nMostre a primeira nota da nova lista sem removê-lo:");
		System.out.println("Mostra a primeira nota da nova lista removendo-a: ");
	
	
		List<Double> notas2 = new ArrayList<>();
		notas2.add(2.0);
		notas2.add(0.0);
		notas2.add(5d);
		notas2.add(9.8);
		notas2.add(10.0);
		notas2.add(7d);
		
		System.out.println("\n\nNotas: " + notas2.toString());
		System.out.println("\nPrimeira nota: " + notas2.get(0));
		System.out.println("\nRemovendo a primeira nota: "+ notas2.remove(0));
		System.out.println("Notas: " + notas2.toString());
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
