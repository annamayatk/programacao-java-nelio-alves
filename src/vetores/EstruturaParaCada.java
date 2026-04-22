package vetores;

import java.util.Scanner;

public class EstruturaParaCada {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] nomes = new String[n];

		for (int i = 0; i < n; i++) {
			nomes[i] = sc.next(); // usa ".next()" pois está considerando apenas 1 nome, sem espaço
		}
		System.out.println("Nomes lidos:");

		for (String s : nomes) {
			System.out.println(s);
		}
		
		
		
		
		sc.close();
	}

}
