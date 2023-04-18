package aula04;

//Crie um programa que  armazene 10 notas em um array e mostre a maior nota, a menor nota, e a média

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {

		double[] notas = new double[10];

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < notas.length; i++) {
			System.out.print("Digite a nota " + (i + 1) + ": ");
			notas[i] = sc.nextDouble();
		}

		double maior = notas[0];
		double menor = notas[0];
		double soma = 0;
		for (double nota : notas) {
			if (nota > maior) {
				maior = nota;
			}
			if (nota < menor) {
				menor = nota;
			}
			soma += nota;
		}
		double media = soma / notas.length;

		System.out.println("Maior nota: " + maior);
		System.out.println("Menor nota: " + menor);
		System.out.println("Média: " + media);
	}
}