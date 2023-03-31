package aula02;

import java.util.Scanner;

// Crie um programa que receba 2 números e um operador (+, -. *, /) e faça a respectiva operação.

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner tela = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		double n1 = tela.nextDouble();
		
		System.out.println("Digite o segundo valor: ");
		double n2 = tela.nextDouble();
		
		System.out.println("Escolha o operador: +, -, * ou /");
		char operador = tela.next().charAt(0);
		
		double resultado;
		
		switch (operador) {
		case '+':
			resultado = n1 + n2;
			System.out.printf("%s + %s = %.2f", n1, n2, resultado);
			break;
		case '-':
			resultado = n1 - n2;
			System.out.printf("%s - %s = %.2f", n1, n2, resultado);
			break;
		case '*':
			resultado = n1 * n2;
			System.out.printf("%s * %s = %.2f", n1, n2, resultado);
			break;
		case '/':
			resultado = n1 / n2;
			System.out.printf("%s / %s = %.2f", n1, n2, resultado);
			break;
		default:
			System.out.printf("ERRO!!!");
		}
		tela.close();
	}
}
