package br.com.generation.aula01;

import java.util.Scanner;



public class Exercicio01 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int maior = 0, numero1, numero2, numero3;
		
		System.out.println("insira o primeiro valor aqui: ");
		numero1 = leia.nextInt();
		if(numero1 > maior) {
			maior = numero1;
		}
		System.out.println("insira o segundo valor aqui: ");
		numero2 = leia.nextInt();
		if(numero2 > maior) {
			maior = numero2;
		}
		System.out.println("insira o terceiro e último valor aqui: ");
		numero3 = leia.nextInt();
		if(numero3 > maior) {
			maior = numero3;
		}
		leia.close();
		System.out.println("o maior número foi: " + maior);

	}

}
