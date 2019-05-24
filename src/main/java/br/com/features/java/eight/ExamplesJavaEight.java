package br.com.features.java.eight;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ExamplesJavaEight implements IntefaceJavaEight {

	public ExamplesJavaEight() {
		System.out.println("======= start example java 8 =======\n");
		
		orderInList();
		useDefaultMethod();
		examplesLambda();
		
		System.out.println("======= end example java 8 =======");
	}
	
	private void orderInList(){
		System.out.println("******* start order in list *****");
		List<String> words = Arrays.asList("rodrigo", "paulo", "caelum");
		System.out.printf("list before sort: %s \n",words);
		
		Comparator<String> comparator = new Comparator<String>() {
		    public int compare(String s1, String s2) {
		        return Integer.compare(s1.length(), s2.length());
		    }
		};
		words.sort(comparator); //OLD - Collections.sort(palavras, comparator);
		System.out.printf("list before sort: %s \n",words);
		
		System.out.println("******* end order in list *****\n");
	}
	
	private void useDefaultMethod(){
		System.out.println("******* start default method *****");
		System.out.println(isMethodDefault());
		System.out.println("******* end default method *****\n");
	}
	
	
	private void examplesLambda(){
		System.out.println("******* start example lambda with the same syntax  *****");
		List<String> words = Arrays.asList("rodrigo", "paulo", "caelum");
		
		System.out.println(" fist exemplo lambda long");
		Comparator<String> c1 = (s1, s2) -> {
	        return Integer.compare(s1.length(), s2.length());
		};
		words.sort(c1); 
		words.forEach(s -> {
			System.out.println(s);
		});
		
		System.out.println("\n secund exemplo lambda middle");
		Comparator<String> c2 = (s1, s2) -> Integer.compare(s1.length(), s2.length());
		words.sort(c2);   
		words.forEach(s -> System.out.println(s));
		
		System.out.println("\n third exemplo lambda small");
		words.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		words.forEach(System.out::println);
		
		System.out.println("\n for exemplo lambda short");
		words.sort(Comparator.comparing(s -> s.length()));
		words.forEach(System.out::println);
		
		System.out.println("\n five exemplo lambda more short");
		words.sort(Comparator.comparing(String::length));
		words.forEach(System.out::println);
		
		System.out.println("******* end example lambda with the same syntax *****");
	}
	
	public void examplesLambda2(){
		
	}
	
}
