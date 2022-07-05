package br.com.bootcampdio.list;

public class Cat implements Comparable<Cat>{

		
		private String name;
		private Integer year;
		private String color;
		
		public Cat(String name, Integer year, String color) {
			this.name = name;
			this.year = year;
			this.color = color;
		}
		
		public String getName() {
			return name;
		}

		public Integer getYear() {
			return year;
		}
		
		public String getColor() {
			return color;
		}
		
		public String toString() {
			return "{" +  "name='" + name + '\'' + "year='" + year + '\'' + "color='" + color + '\'' + '}';
		}

		@Override
		public int compareTo(Cat cat) {
			return this.getName().compareToIgnoreCase(cat.getName());
		}
		
	}

