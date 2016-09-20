package clase.entrada;

import java.util.Scanner;

public class Entrada {
	
	//SCANNER
	public static void main(String[] args) {
		int num1;
		int num2;
		String nombre;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("-----MINI CALCULADOR-----");
		System.out.println("-----INGRESE SU USUARIO-----");
		
		nombre = scan.next();
		
		System.out.println("-----INGRESE SU 1° NUMERO-----");
		
		num1 = scan.nextInt();
		
		System.out.println("-----INGRESE SU 2° NUMERO-----");
		
		num2 = scan.nextInt();
		
		System.out.println(nombre + " SU RESULTADO ES: "+ (num1+num2));
		
	}
}
