package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Uri1045 {
	//função para resolver bug de igualdade entre doubles
	public static boolean igual(double a, double b) {
	    return Math.abs(a - b) < 0.0001;
	}

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();

		double A2 = Math.max(Math.max(A, B), Math.max(A, C));
		double C2 = Math.min(Math.min(A, B), Math.min(A, C));
		double B2 = (A + B + C) - (A2 + C2);

		
		
		if (A2 > 0 && B2 > 0 && C2 > 0) {
			if (A2 >= B2 + C2) {
				System.out.println("NAO FORMA TRIANGULO");
			} 
			else { 
				//forma triangulo
				if (igual(Math.pow(A2, 2), Math.pow(B2, 2) + Math.pow(C2, 2))) {
					System.out.println("TRIANGULO RETANGULO");
				} else if (Math.pow(A2, 2) > (Math.pow(B2, 2) + Math.pow(C2, 2))) {
					System.out.println("TRIANGULO OBTUSANGULO");
				} else if (Math.pow(A2, 2) < (Math.pow(B2, 2) + Math.pow(C2, 2))) {
					System.out.println("TRIANGULO ACUTANGULO");
				}
				//lados
				if (igual(A2, B2) && igual(B2, C2)) {
					System.out.println("TRIANGULO EQUILATERO");
				} else if (igual(A2, B2)|| igual(A2, C2) || igual(B2, C2)) {
					System.out.println("TRIANGULO ISOSCELES");
				}
			}
		}
		sc.close();

	}

}
