package aula04;

import java.util.Scanner;

//Preencha e Mostre uma Matriz de inteiro 2x2.

public class Exercicio4 {
	public static void main(String[] args) {

		int[][] matriz = new int[2][2];

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.print("Digite o valor da posição [" + i + "][" + j + "]: ");
				matriz[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}
}