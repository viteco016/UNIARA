package aula04;

//Crie um programa que  armazene 10 notas em um array e os mostre em seguida

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		
		double[] notas = new double[10];

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < notas.length; i++) {
			System.out.print("Digite a nota " + (i + 1) + ": ");
			notas[i] = sc.nextDouble();
		}

		for (double nota : notas) {
			System.out.println(nota);
		}
	}
}