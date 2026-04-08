package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Uri1047 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int hora1 = sc.nextInt();
		int min1 = sc.nextInt();
		int hora2 = sc.nextInt();
		int min2 = sc.nextInt();
		
		int momentoInicial = (hora1 * 60) + min1;
		int momentoFinal = (hora2 * 60) + min2;
		int duracao = Math.abs(momentoFinal - momentoInicial);
		
		if (momentoInicial > momentoFinal) {
			duracao = (24 * 60) - duracao;
		}
		int horasDuracao = 0;
		int minutosDuracao = 0;

		if (duracao >= 60) {
			horasDuracao = duracao / 60;
			minutosDuracao = duracao % 60;
		} else if (duracao == 0){
			horasDuracao = 24;
		} else {
			minutosDuracao = duracao;
		}

		System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n", horasDuracao, minutosDuracao);

		sc.close();

	}

}

