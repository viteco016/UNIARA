package aula03;

import java.util.Scanner;

public class Exercicio3 {
	    public static void main(String[] args) {
	        Scanner entrada = new Scanner(System.in);
	        int soma = 0;

	        System.out.println("Digite 10 números para somar:");
	        for (int i = 1; i <= 10; i++) {
	            System.out.print("Número " + i + ": ");
	            int numero = entrada.nextInt();
	            soma += numero;
	        }

	        System.out.println("A soma dos números digitados é: " + soma);
	    }
	}