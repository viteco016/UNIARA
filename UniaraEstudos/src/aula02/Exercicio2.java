package aula02;

import javax.swing.JOptionPane;

// Crie um programa que mostre se o número é par ou impar.

public class Exercicio2 {
	public static void main(String[] args) {
		
	String num = JOptionPane.showInputDialog("Digite um numero: ");
	double num1 = Double.parseDouble(num);
	
	if (num1 % 2 == 0) {
		JOptionPane.showMessageDialog(null, "O numero digitado eh PAR!");
	} else {
		JOptionPane.showMessageDialog(null, "O numero digitado eh IMPAR!");
	}
	}
}
