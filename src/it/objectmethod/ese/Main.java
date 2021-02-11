package it.objectmethod.ese;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		String answer = "s";
		while (!answer.equals("n")) {
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Inserisci il primo numero: ");
			int firstNumber = scanner.nextInt();
	
			System.out.println("Inserisci il secondo numero: ");
			int secondNumber = scanner.nextInt();
	
			int result = firstNumber + secondNumber;
	
			System.out.println("Somma: " + result);
			
			System.out.println("Vuoi fare altre operazioni? y/n");
			answer = scanner.next();	
			
			scanner.close();
		}
		
		/*
		Scanner scanner = new Scanner(System.in);
		System.out.println("Scrivi una frase: ");
		String answer = scanner.nextLine();
		System.out.println(answer.substring(0, answer.indexOf(" ")));
		
		scanner.close();
		*/
		
	}
}
