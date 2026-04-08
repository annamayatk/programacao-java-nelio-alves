package estrutura_sequencial;

import java.util.Scanner;

public class Uri1011Casting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int raio = sc.nextInt();

		double volume = (4 / 3.0) * 3.14159 * (Math.pow(raio, 3));
		
		System.out.printf("VOLUME = %.3f%n", volume);
		sc.close();

	}

}
