package estrutura_repeticao;

import java.util.Scanner;

public class Uri1074 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = 0;

		for (int i = 0; i < n; i++) {
			x = sc.nextInt();
			if (x == 0) {
				System.out.println("NULL");
			} else if (x % 2 == 0) {
				System.out.print("EVEN ");
			} else if (x % 2 != 0) {
				System.out.print("ODD ");
			} 
			
			if (x > 0) {
				System.out.println("POSITIVE");
			} else if (x < 0) {
				System.out.println("NEGATIVE");
			}
		}

		sc.close();
	}

}
