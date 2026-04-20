package estrutura_repeticao;

import java.util.Locale;
import java.util.Scanner;

public class Uri1017 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double nota1 = sc.nextDouble();
		double nota2 = 0.0;
		double media = 0.0;

		while (nota1 <= 0.0 || nota1 > 10.0) {
			System.out.println("nota invalida");
			nota1 = sc.nextDouble();
		}
		
		nota2 = sc.nextDouble();
		
		while (nota2 <= 0.0 || nota2 > 10.0) {
			System.out.println("nota invalida");
			nota2 = sc.nextDouble();
		}


		if ((nota1 > 0.0 && nota1 <= 10.0) && (nota2 > 0.0 && nota2 <= 10.0)) {
			media = (nota1 + nota2) / 2;
			System.out.printf("media = %.2f%n", media);
		}

		sc.close();
	}

}
