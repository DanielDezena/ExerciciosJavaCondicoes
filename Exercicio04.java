package br.com.generation.aula01;


import javax.swing.JOptionPane;

public class Exercicio04 {
	public static void main(String[] args) {
		int numero;
		double total;
		numero = Integer.parseInt(JOptionPane.showInputDialog(null, "digite o valor do n�mero"));
		if(numero % 2 == 0) {
			total = Math.sqrt(numero);
			JOptionPane.showMessageDialog(null, "O n�mero " + numero + 
					" � par.\nSua raiz quadrada �: " +total);
		}else {
			total = numero * numero;
			JOptionPane.showMessageDialog(null, "O n�mero " + numero + 
					" � �mpar.\nSua raiz quadrada �: " +total);
		}
	}

}
