package br.com.bootcampdio.list;

import java.util.Comparator;

public class ComparatorColor implements Comparator<Cat> {

	@Override
	public int compare(Cat c1, Cat c2) {
		
		return c1.getColor().compareToIgnoreCase(c2.getColor());
	}

}
