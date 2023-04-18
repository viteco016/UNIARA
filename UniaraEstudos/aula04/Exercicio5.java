package aula04;

//Crie um programa que peça um número e gere automaticamente a sua tabuada deve multiplicar do 1 ao 10 !  A taboada deve ser guardada na Matriz: NUMERO DIGITADO, NUMERO BASE, RESULTADO.
import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um número para gerar a tabuada: ");
		int num = sc.nextInt();

		int[][] tabuada = new int[10][3];

		for (int i = 0; i < 10; i++) {
			tabuada[i][0] = num;
			tabuada[i][1] = i + 1;
			tabuada[i][2] = num * (i + 1);
		}

		for (int i = 0; i < tabuada.length; i++) {
			for (int j = 0; j < tabuada[0].length; j++) {
				System.out.print(tabuada[i][j] + " ");
			}
			System.out.println();
		}
	}
}