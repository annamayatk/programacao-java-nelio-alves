package estrutura_sequencial;

import java.util.Scanner;

public class Uri1012Geometria {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		
		double areaTri = (A * C) / 2;
		double areaCirc = 3.14159 * (Math.pow(C, 2.0));
		double areaTra = ((A + B) * C) / 2.0;
		double areaQuad = B * B;
		double areaRet = A * B;
		
		
		System.out.printf("TRIANGULO: %.3f%n", areaTri);
		System.out.printf("CIRCULO: %.3f%n", areaCirc);
		System.out.printf("TRAPEZIO: %.3f%n", areaTra);
		System.out.printf("QUADRADO: %.3f%n", areaQuad);
		System.out.printf("RETANGULO: %.3f%n", areaRet);
		sc.close();
	}

}
