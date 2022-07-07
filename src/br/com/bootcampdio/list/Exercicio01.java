package br.com.bootcampdio.list;

import java.time.Month;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
	
		Double media = 0d;
		Double var;
		List<Double> temperatura = new ArrayList<>();
		
		Calendar calendar = Calendar.getInstance();
		Locale localeBR = new Locale("pt", "BR");

		
		for (int i = 1; i <= 6; i++) {
			
			System.out.println("\n----Insira a media da temperatura do mes 0" + i +  ":  ");
			 var = scan.nextDouble(); 
			
			temperatura.add(var);
			media = media + var;
			
		}
		
		System.out.println("\n----Medias mensais: " + temperatura);
		
		System.out.println("\n----Media semestral das temperaturas: " + media/6);
		System.out.println();
	
		
		for (int i = 0; i < 6; i++) {
			
			calendar.set(Calendar.MONTH, i);
			System.out.println(i+1 + " - " + calendar.getDisplayName(Calendar.MONTH, Calendar.LONG, localeBR) + " - " + temperatura.get(i));
		}	

		scan.close();
		
	}
	

}
