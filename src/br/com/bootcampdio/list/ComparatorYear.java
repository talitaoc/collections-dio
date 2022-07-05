package br.com.bootcampdio.list;

import java.util.Comparator;

public class ComparatorYear implements Comparator<Cat> {

	@Override
	public int compare(Cat c1, Cat c2) {
		
		return Integer.compare(c1.getYear(), c2.getYear());
	}

	
}
