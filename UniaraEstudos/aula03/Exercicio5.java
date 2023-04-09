package aula03;

import java.util.Scanner;

public class Exercicio5 {

	    public static void main(String[] args) {
	        Scanner entrada = new Scanner(System.in);
	        int valorSaida = 0; // valor de saída definido

	        while (true) {
	            System.out.print("Digite um valor (ou " + valorSaida + " para sair): ");
	            int valor = entrada.nextInt();

	            if (valor == valorSaida) {
	                System.out.println("Valor de saída digitado. Saindo...");
	                break;
	            }

	            System.out.println("Valor digitado: " + valor);
	        }
	    }
	}

