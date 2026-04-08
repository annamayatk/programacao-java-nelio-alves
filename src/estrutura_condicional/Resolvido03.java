package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Resolvido03 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		if (x < y && x < z) {
			System.out.printf("MENOR = %d%n", x);
		} else if (y < z) {
			System.out.printf("MENOR = %d%n", y);
		} else {
			System.out.printf("MENOR = %d%n", z);
		} 
		
		sc.close();
	}

}
