package estrutura_sequencial;

import java.util.Scanner;

public class Uri1017 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int horas = sc.nextInt();
		int velocidadeMedia = sc.nextInt();
		//joao faz 12km/l
		double distancia = velocidadeMedia * horas;
		double combustivel = distancia / 12;
		
		System.out.printf("%.3f%n", combustivel);
		
		sc.close();
	}
}
