package br.com.generation.aula01;

import javax.swing.JOptionPane;

public class Exercicio3 {
	public static void main(String[] args) {
		int idade;
		
		idade = Integer.parseInt(JOptionPane.showInputDialog(null, "digite a sua idade: "));
		if(idade < 0) {
			JOptionPane.showMessageDialog(null, "Valor inv�lido!");
		}else if (idade < 10) {
			JOptionPane.showMessageDialog(null, "a idade � pequena demais para registro");
		}else if(idade >=10 && idade <=14) {
			JOptionPane.showMessageDialog(null, "Categoria: infantil");
		}else if(idade >=15 && idade <=17) {
			JOptionPane.showMessageDialog(null, "Categoria: juvenil");
		}else if(idade >=18 && idade <=25) {
			JOptionPane.showMessageDialog(null, "Categoria: adulto");
		}else {
			JOptionPane.showMessageDialog(null, "a idade � grande demais para o registro");
		}
	}


}
