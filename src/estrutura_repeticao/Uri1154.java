package estrutura_repeticao;

import java.util.Locale;
import java.util.Scanner;

public class Uri1154 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int idade = sc.nextInt();
		double soma = 0.0;
		int cont = 0;
		
		while (idade >= 0) {
			soma += idade;
			cont += 1;
			idade = sc.nextInt();
		}
		
		double media = (double) (soma / cont);
		System.out.printf("%.2f%n", media);
		
		sc.close();
	}

}
