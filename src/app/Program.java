package app;

import java.util.Locale;
import java.util.Scanner;


public class Program {

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite a primeira nota ");
		
		int nota1 = sc.nextInt();
		
		System.out.println("digite a segunda nota ");
		
		int nota2 = sc.nextInt();
		
		Nota notas = new Nota(nota1,nota2);
		
		
		

	}

}
