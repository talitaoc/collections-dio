package br.com.bootcampdio.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class ExemploMap {

	public static void main(String[] args) {
		
		
	System.out.println("Crie um dicionario e relacione o modelo e seus respectivos consumos: ");
	
	Map<String, Double> carrosPopulares = new HashMap<>() {{
		
		put("gol", 14.4);
		put("up", 15d);
		put("uno", 15.5);
		put("mobi", 16.5);
		put("hb20", 16d);
		put("kwid", 15.6);
		
	}};
	
	System.out.println(carrosPopulares.toString());
		
	System.out.println("\n\nSubstitua o consumo do gol por 15,2 km/l: ");
	carrosPopulares.put("up", 16.5);
	System.out.println(carrosPopulares);
	
	System.out.println("\n\nConfira se o modelo tucson está no dicionario: " + carrosPopulares.containsKey("tucson"));

	System.out.println("\n\n confira se o modelo uno está no dicionario:  " + carrosPopulares.containsKey("uno"));
	
	System.out.println("\n\n Confira o consumo do uno: " + carrosPopulares.get("uno"));
	
	System.out.println("\n\n Exiba os modelos: " + carrosPopulares.keySet());
	
	System.out.println("\n\n Exiba os consumos: " + carrosPopulares.values());
	
	System.out.println("\n\n Exiba o modelo mais economico e seu consumo:");
	
	Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
	Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
	String modeloMaisEficiente = "";
	
	for (Map.Entry<String, Double> entry : entries) {
		
		if(entry.getValue().equals(consumoMaisEficiente)) {
			
			modeloMaisEficiente = entry.getKey();
			
			System.out.println("modelo mais eficiente: " 
						+ modeloMaisEficiente + " - " 
						+ consumoMaisEficiente);
		}
		
	}
	
	System.out.println("\n\nExiba o modelo menos economicos e seu consumo: ");
	
	Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
	String modeloMenosEficiente = "";
	
	for (Map.Entry<String, Double> entry : entries) {
		if(entry.getValue().equals(consumoMenosEficiente)){
			
			modeloMenosEficiente = entry.getKey();
		
		System.out.println("modelo menos eficiente: " 
					+ modeloMenosEficiente + " - "
					+ consumoMenosEficiente);
		}
	}
	
	Iterator<Double> iterator = carrosPopulares.values().iterator();
	Double soma = 0d;
	
	while(iterator.hasNext()) {
		soma += iterator.next();
	}
	
	System.out.println("\n\n Exiba a soma dos consumos: " + soma);
	
	System.out.println("\n\n Exiba a media dos consumos deste dicionario: " + soma/carrosPopulares.size());
	
	System.out.println("\n\n Remova os modelos com o consumo igual a 15.6 km/l: ");
	
	Iterator<Double> iterator1 = carrosPopulares.values().iterator();
	
	while(iterator1.hasNext()) {
		if(iterator1.next().equals(15.6)) iterator1.remove();
	}
	
	System.out.println(carrosPopulares);
	
	System.out.println("\n\n Exiba na ordem que foram informados: ");
	
	Map<String, Double> carros = new LinkedHashMap<>() {{
		
		put("gol", 14.4);
		put("up", 15d);
		put("uno", 15.5);
		put("mobi", 16.5);
		put("hb20", 16d);
		put("kwid", 15.6);
		
	}};
	System.out.println(carros.toString());
	
	
	System.out.println("\n\n Exiba o dicinario ordenado pelo modelo: ");
	
	Map<String, Double> carros2 = new TreeMap<>(carros);
	
	System.out.println(carros2.toString());
	
	System.out.println("\n\n Apague o dicionario ");
	carrosPopulares.clear();
	
	System.out.println("\n\n Confira se o dicionario esta vazio: " + carrosPopulares.isEmpty());
	}

}
