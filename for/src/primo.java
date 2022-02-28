import java.util.Scanner;

public class primo {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Premi un numero da 1 a 4");

		int caso = scanner.nextInt();
		scanner.nextLine();
		int n = 10;
		
		

		for (int i = 1; i <= n; i++) {

			switch (caso) {
			case 1:
				int numero1 = 1 * i;
				System.out.println(numero1);

				break;
			case 2:
				int numero2 = 2*i;
				System.out.println(numero2);

				break;
			case 3:
				int numero3 = 3 * i;
				System.out.println(numero3);
		

				break;
			case 4:
				int numero4 = 3*i;
				System.out.println(numero4);

				break;

			default:
				break;
			}

		}
	}

}
