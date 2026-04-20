package estrutura_repeticao;

import java.util.Locale;
import java.util.Scanner;

public class Uri1134 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int tipoCombustivel = sc.nextInt();
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;

		while (tipoCombustivel != 4) {
			tipoCombustivel = sc.nextInt();
			switch (tipoCombustivel) {

			case 1:
				alcool = alcool + 1;
				break;
			case 2:
				gasolina = gasolina + 1;
				break;
			case 3:
				diesel = diesel + 1;
				break;
			case 4:
				break;
			}

		}

		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		sc.close();

	}

}
