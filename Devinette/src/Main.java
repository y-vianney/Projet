import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		int n = rd.nextInt(100) + 1;
		
		while (true) {
			System.out.println("Devinez le nombre généré");
			int userNumber = sc.nextInt();
			
			if (userNumber == n) {
				System.out.println("Bravo vous avez deviné le nombre !");
				break;
			} else {
				if (userNumber < n) {
					System.out.println("Le nombre est plus grand que ça ;)");
				} else {
					System.out.println("Vous le surévalué. Il est plus petit que ça");
				}
			}
		}
	}
}
