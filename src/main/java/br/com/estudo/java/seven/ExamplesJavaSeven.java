package br.com.estudo.java.seven;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ExamplesJavaSeven {

	public ExamplesJavaSeven() {
		System.out.println("======= start example java 7 =======\n");
		
		this.separatorNumber();
		this.literalBinary();
		this.stringOnSwitch();
		this.diamondAnotation();
		this.simpleVarargs();
		this.multiCatch();
		
		System.out.println("======= end example java 7 =======");
	}

	public void separatorNumber() {
		System.out.println("******* start separator number *****");
		
		byte b = 1_2_7;
		int v1 = 999_999;
		int v2 = 100_000 - 1_000;
		Integer i1 = new Integer(12_12_12_1); // deprecate in java 9
		Integer i2 = new Integer(1_2_1_2_1_2_1); // deprecate in java 9
		double f = 123_456.3_4_1;

		System.out.printf("O valor de b e': %d\n", b);
		System.out.printf("O valor de v1 e': %d\n", v1);
		System.out.printf("O valor de v2 e': %d\n", v2);
		System.out.printf("i1 e i2 são iguais?: %b\n", i1.equals(i2));
		System.out.printf("O valor de f e': %.4f\n", f);
		System.out.println("******* end separator number *****\n");

	}

	public void literalBinary() {
		System.out.println("******* start literal binary *****");
		
		final int notReady = 0b00;
		final int off = 0b01;
		final int on = 0b10;
		final int alarm = 0b11;
		final String[] messages = { "não disponível", "desligado", "ligado", "alarme" };

		System.out.printf("Os estados possíveis são: %s(%d) %s(%d), %s(%d), %s(%d)\n\n", messages[notReady], notReady,
				messages[off], off, messages[on], on, messages[alarm], alarm);

		int st = ready();
		while (st != notReady) {
			System.out.printf("O estado do sensor é: %s\n", messages[st]);
			st = ready();
		}
		
		System.out.println("******* end literal binary *****\n");
	}

	public void stringOnSwitch() {
		System.out.println("******* start string on switch *****");
		
		final String dayWeek = "saturday";

		switch (dayWeek) {
		case "Monday":
		case "Tuesday":
		case "Wednesday":
		case "Thursday":
		case "Friday":
			System.out.printf("%s is a util day.\n", dayWeek);
			break;
		case "saturday":
		case "sunday":
			System.out.printf("%s is a util day.\n", dayWeek);
			break;
		default:
			System.out.printf("%s is a invalid day.\n", dayWeek);
			break;
		}
		
		System.out.println("******* end start string on switch *****\n");
	}

	public void diamondAnotation() {
		System.out.println("******* start diamond anotation *****");
		System.out.println("create a collection more simple in java 7");

		Map<String, Object> example1 = new HashMap<>();
		example1.put("key", new Object());

		Map<String, Set<Integer>> example2 = new HashMap<>();
		example2.put("key", new HashSet<>());
		
		System.out.println("******* end diamond anotation *****\n");
	}

	public void simpleVarargs() {
		System.out.println("******* start simple varargs *****\n");
		System.out.println("create a list more simple in java 7");
		
		Integer aInteger = new Integer(1); // deprecate in java 9
		List<Integer> listOfInteger = Arrays.asList(aInteger);
		System.out.printf("%s is a list of integer \n" ,listOfInteger.toString());
		
		Set<String> aSet = new HashSet<>(); 
		
		List<Set<String>> listOfStrSets = Arrays.asList(aSet);
		System.out.printf("%s is a list of outher collection. \n" ,listOfStrSets.toString());
				
		List<Set<Long>> listOfLongSets = Arrays.asList(new Set[]{aSet});
		System.out.printf("%s is a list of outher array of list. \n" ,listOfLongSets.toString());
		
		System.out.println("******* end simple varargs *****\n");
	}
	
	public void multiCatch() {
		System.out.println("******* start multi Catch ******");
		try {
			BufferedReader br = new BufferedReader(new FileReader("example.txt"));
			Class<?> clazz = Class.forName("anyClass"); 
		} catch (ClassNotFoundException | FileNotFoundException e) {
			System.out.println("this is example two or more exceptions");
			System.out.printf("exception message %s:", e.getMessage());
		}
		System.out.println("******* end simple varargs ******\n");
	}

	private int ready() {
		return (int) (Math.random() * 0b100);
	}

}
