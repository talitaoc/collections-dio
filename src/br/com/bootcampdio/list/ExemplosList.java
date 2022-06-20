package br.com.bootcampdio.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExemplosList {

	public static void main(String[] args) {
		
		System.out.println("Crie uma lista e adicione as sete notas ");
		
		
		List<Double> notas = new ArrayList<>();
		
		List<Double> nota2 = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 8d, 3.6));
	
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
	}
}
