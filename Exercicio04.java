package br.com.generation.aula01;


import javax.swing.JOptionPane;

public class Exercicio04 {
	public static void main(String[] args) {
		int numero;
		double total;
		numero = Integer.parseInt(JOptionPane.showInputDialog(null, "digite o valor do número"));
		if(numero % 2 == 0) {
			total = Math.sqrt(numero);
			JOptionPane.showMessageDialog(null, "O número " + numero + 
					" é par.\nSua raiz quadrada é: " +total);
		}else {
			total = numero * numero;
			JOptionPane.showMessageDialog(null, "O número " + numero + 
					" é ímpar.\nSua raiz quadrada é: " +total);
		}
	}

}
