package estrutura_sequencial;

import java.util.Scanner;

public class Uri1002 {

	public static void main(String[] args) {
	double area;
	double n = 3.14159;
	Scanner sc = new Scanner(System.in);
	double raio = sc.nextDouble();
	area = (raio * raio) * n;
	
	System.out.printf("A=%.4f%n",area);
		
	}

}
