package course.java.generics.HashCodeAndEquals.exer03.application;

import course.java.generics.HashCodeAndEquals.exer03.entities.Client;

public class Program {

	public static void main(String[] args) {
		
		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Maria", "maria@gmail.com");
		
		
		String s1 = "Test";// é dado um tratamento especial 
		String s2 = new String("Test"); //assim a objeto é instanciado da maneira tradicional 
		// Quando houver uma (==) igualdade com dois objetos instanciados como s1
		// O resultado será true.
		// Quando houver uma (==) igualdade com dois objetos instanciados como s2
		// O resultado será false.
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		System.out.println(c1 == c2);
		System.out.println(s1 == s2);
		

	}

}
