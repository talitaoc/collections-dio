package br.com.bootcampdio.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio02 {
	

	public static void main(String[] args) {
		
		
		System.out.println("---Responda SIM ou NAO para as seguintes perguntas---");
		

		List<Pergunta> lista = new ArrayList<>();
		
		lista = listaDePerguntas();
		
		loopPerguntas(lista);
		
		resultado(contarRespostas(lista));
		
		
	}
	
	public static List<Pergunta> listaDePerguntas() {
		
		
		List<Pergunta> perguntas = new ArrayList<>();
		perguntas.add(new Pergunta("1 - Telefonou para a vitima?",false));
		perguntas.add(new Pergunta("2 - Esteve no local do crime?", false));
		perguntas.add(new Pergunta("3 - Mora perto da vitima?", false));
		perguntas.add(new Pergunta("4 - Devia para a vitima?", false));
		perguntas.add(new Pergunta("5 - Já trabalhou com a vitima?", false));	
		
		return perguntas;
		
	}
	
	public static void loopPerguntas(List<Pergunta> perguntas) {
		
		Scanner scan = new Scanner(System.in);
		String resposta;
		
		for (Pergunta pergunta : perguntas) {
			
			System.out.println(pergunta.getFrase());
			
			resposta = scan.nextLine();
			
			pergunta.setResposta("sim".equalsIgnoreCase(resposta));
			
		}
		
		scan.close();
		
	}
	
	public static Long contarRespostas(List<Pergunta> listaRespondida) {
		
		return listaRespondida.stream().filter(resposta -> resposta.getResposta()).count();
	
		
	}
	
	public static void resultado(Long resultado) {
		
		
		if(resultado >= 0 && resultado < 2) {
			
			System.out.println("Inocente");
			
		}else if(resultado == 2) {
			
			System.out.println("Suspeito");
			
		}else if(resultado > 2 && resultado < 5) {
			
			System.out.println("Cumplice");
			
		}else {
			
			System.out.println("Assassino!!!!");
		}
	}
	
}
