package aula02;

import javax.swing.JOptionPane;

// Crie um programa que  receba uma nota e partir desta nota ele apresente aprovado se nota maior que 5 e reprovado se nota menor que 5.

public class Exercicio1 {

	public static void main(String[] args) {
		String nota = JOptionPane.showInputDialog("Digite a nota do aluno: ");
		double n1 = Double.parseDouble(nota);
		
		if (n1 >= 5) {
			JOptionPane.showMessageDialog(null, "Aluno aprovado!".toUpperCase());
		
		} else {
			JOptionPane.showMessageDialog(null, "Aluno reprovado!".toUpperCase());		
		}
	}
}
