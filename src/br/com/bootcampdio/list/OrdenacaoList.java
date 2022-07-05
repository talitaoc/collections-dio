package br.com.bootcampdio.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoList {

	public static void main(String[] args) {
		
		List<Cat> myCats = new ArrayList<>() {{
			
			add(new Cat("Lince", 12, "branco e preto"));
			add(new Cat("Preta", 15, "preta"));
			add(new Cat("Lola", 15, "escaminha"));
			add(new Cat("Sophia", 13, "tigrado"));
		}};
		
		System.out.println(myCats);
		System.out.println("\n---Ordem de inserção---");
		System.out.println(myCats);
		
		System.out.println("\n---Ordem de aleatoria---");
		Collections.shuffle(myCats);
		System.out.println(myCats);
		
		System.out.println("\n---Ordem natural (Name)---");
		Collections.sort(myCats);
		System.out.println(myCats);
		
		System.out.println("\n---Ordem natural (Year)---");
		//Collections.sort(myCats, new ComparatorYear());
		myCats.sort(new ComparatorYear());
		System.out.println(myCats);
		
		System.out.println("\n---Ordem natural (Color)---");
		//Collections.sort(myCats, new ComparatorColor());
		myCats.sort(new ComparatorColor());
		System.out.println(myCats);
		
		System.out.println("\n ---Ordem Nome/Cor/Idade---");
		//Collections.sort(myCats, new ComparatorNameColorYear());
		myCats.sort(new ComparatorNameColorYear());
		System.out.println(myCats);
		
		
		
		
	}

	
}




