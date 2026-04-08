package curso_programacao;
import java.util.Scanner;

public class ExercicioAula27 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name1 = sc.next();
		int age1 = sc.nextInt();
		String name2 = sc.next();
		int age2 = sc.nextInt();
		double media = (double) (age1 + age2) / 2;
		System.out.printf("A idade média de %s e %s é de %.1f", name1, name2, media);
		sc.close();
	}

}
