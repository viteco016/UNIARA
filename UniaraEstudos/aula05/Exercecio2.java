package aula05;

public class Exercecio2 {

public static void main(String[] args) {
	Pessoa[] pessoas = new  [10];
	
	pessoas[0] = new Pessoa(1, "João", 2000);
	pessoas[1] = new Pessoa(2, "Maria", 2500);
	pessoas[2] = new Pessoa(3, "Pedro", 1800);
	pessoas[3] = new Pessoa(4, "Julia", 3000);
	pessoas[4] = new Pessoa(5, "Lucas", 2200);
	pessoas[5] = new Pessoa(6, "Gabriel", 2800);
	pessoas[6] = new Pessoa(7, "Ana", 1900);
	pessoas[7] = new Pessoa(8, "Carlos", 2600);
	pessoas[8] = new Pessoa(9, "Mariana", 2300);
	pessoas[9] = new Pessoa(10, "Rodrigo", 3200);

	System.out.println("Nome: " + pessoas[2].getNome() + ", Salário: " + pessoas[2].getSalario());
	}
}