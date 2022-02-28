import java.util.Scanner;

public class Prima {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("inserisci i nomi");
		String nome = scanner.nextLine();
		System.out.println("inserisci i nomi");
		String nome1 = scanner.nextLine();
		System.out.println("inserisci i nomi");
		String nome2 = scanner.nextLine();
		System.out.println("inserisci i nomi");
		String nome3 = scanner.nextLine();
	
	    String[] nomi = {nome , nome1, nome2, nome3};
		String[] a = { "Alex", "Michele", "Francesco", "Luca" };
		String[] b = { "Silvio", "Giovanni", "Simone", "Alex" };

		for (int i = 0; i < nomi.length; i++) {
			String string = a[i];
			String string1 = b[i];
			String string2= nomi[i];
			System.out.println(string);
			System.out.println(string1);
			System.out.println(string2);
			
			if (string == string1) {
				System.out.println("Ci sono nomi uguali");
				break;
			}else if (string2== string){
				System.out.println("Ci sono nomi uguali");
				break;
				
			}else if ( string1 == string2){
				System.out.println("Ci sono nomi uguali");
				break;
				
			}else {
				System.out.println("Non ci sono nomi simili");
				
			}
		}
	}
}