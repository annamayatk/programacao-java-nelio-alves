package estrutura_sequencial;

import java.util.Scanner;

public class Uri1014 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		sc.nextLine();
		double Y = sc.nextDouble();
		
		double consumo = X / Y;
		
		System.out.printf("%.3f km/l", consumo);
		sc.close();
	}

}
