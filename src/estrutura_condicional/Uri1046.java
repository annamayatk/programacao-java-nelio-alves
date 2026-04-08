package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Uri1046 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// 24h - 16 + 2 = 10 h
		// if y > x == mesmo dia
		// if x > y == outro dia
		// if x == y == 24h
		
		int x = sc.nextInt();		
		int y = sc.nextInt();
		int duracao = 24;
		
		if (y > x)
			duracao = y - x;
		else if (x > y)
			duracao = (duracao - x) + y;
			
		System.out.printf("O JOGO DUROU %d HORA(S)%n", duracao);
		
		sc.close();
	}

}
