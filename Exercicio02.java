package br.com.generation.aula01;

import java.util.Scanner;



public class Exercicio02 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double numero1, numero2, numero3;
		
		System.out.println("insira o primeiro n�mero");
		numero1 = leia.nextInt();
		System.out.println("insira o segundo n�mero");
		numero2 = leia.nextInt();
		System.out.println("insira o terceiro n�mero");
		numero3 = leia.nextInt();
		leia.close();
		
		if(numero1 <= numero2 && numero1 <= numero3) {
		     System.out.println("a ordem ser�: " + numero1 + " " + numero2 + " " + numero3); 
		}else if(numero1 <= numero3 && numero3<= numero2) {
			System.out.println("a ordem ser�: " + numero1 + " " + numero3 + " " + numero2);
		}else if(numero2 <= numero3 && numero3<= numero1) {
			System.out.println("a ordem ser�: " + numero2 + " " + numero3 + " " + numero1);
		}else if (numero2 <= numero1 && numero1<= numero3) {
			System.out.println("a ordem ser�: " + numero2 + " " + numero1 + " " + numero3);
		}else if (numero3 <= numero1 && numero1<= numero2) {
			System.out.println("a ordem ser�: " + numero3 + " " + numero1 + " " + numero2);
		}else if (numero3 <= numero2 && numero2<= numero1) {
			System.out.println("a ordem ser�: " + numero3 + " " + numero2 + " " + numero1);
		}
		
	}

}
