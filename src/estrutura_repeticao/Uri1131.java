package estrutura_repeticao;

import java.util.Locale;
import java.util.Scanner;

public class Uri1131 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int novoGrenal = 1;
		int contador = 0;
		int vitoriaInter = 0;
		int vitoriaGremio = 0;
		int empate = 0;

		while (novoGrenal == 1) {

			int golsInter = sc.nextInt();
			int golsGremio = sc.nextInt();

			if (golsInter > golsGremio)
				vitoriaInter += 1;
			else if (golsInter < golsGremio)
				vitoriaGremio += 1;
			else if (golsInter == golsGremio)
				empate += 1;

			System.out.println("Novo grenal (1-sim 2-nao)");
			novoGrenal = sc.nextInt();
			contador += 1;
		}

		System.out.printf("%d grenais%n", contador);
		System.out.printf("Inter:%d%n", vitoriaInter);
		System.out.printf("Gremio:%d%n", vitoriaGremio);
		System.out.printf("Empates:%d%n", empate);

		if (vitoriaInter > vitoriaGremio)
			System.out.println("Inter venceu mais");
		else if (vitoriaInter < vitoriaGremio)
			sc.close();
	}

}
