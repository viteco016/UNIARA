package aula03;

import java.util.Scanner;

public class Exercicio4 {
	    public static void main(String[] args) {
	        Scanner entrada = new Scanner(System.in);

	        System.out.print("Digite um número: ");
	        int numero = entrada.nextInt();

	        System.out.println("Números de 0 até " + numero + ":");
	        for (int i = 0; i <= numero; i++) {
	            System.out.println(i);
	        }
	    }
	}