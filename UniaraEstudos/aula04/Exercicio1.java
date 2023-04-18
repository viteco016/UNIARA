package aula04;

//Crie um programa que  armazene 5 nomes no array e os mostre em seguida

public class Exercicio1 {
	public static void main(String[] args) {

		String[] nomes = { "Victor", "Natalia", "Deise", "Natan", "Gabriel" };

		for (String nome : nomes) {
			System.out.println(nome);
		}
	}
}