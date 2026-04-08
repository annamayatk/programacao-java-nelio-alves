package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Resolvido02 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		
		double delta = Math.pow(B, 2.0) - (4 * A * C);
		
		double R1 = ((- B) + Math.sqrt(delta)) / (2 * A);
		double R2 = ((- B) - Math.sqrt(delta)) / (2 * A);
		
		// delta nao pode ser negativo
		// a nao pode ser zero
		
		if (delta < 0 || A == 0) {
			System.out.println("Impossivel calcular");
		} else {
			System.out.printf("R1 = %.5f%nR2 = %.5f%n", R1, R2);
		}
				
		sc.close();
	}
	
}
