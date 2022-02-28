import java.util.Scanner;

public class secondo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		String [] studenti = {"Alex", "Giovanni", "Mirko","Luca","Marzia","Arianna"};
		int [] matricola = {100,102,103,104,105,106};
		
		System.out.println("cerca lo studente");
	    String cerca= scanner.nextLine();
	     
		boolean trovato = false;
		int pos = 0;
		
		for (int xy = 0; xy<studenti.length; xy++) {
			if (studenti[xy].equals(cerca)) {
				trovato=true;
				pos=xy;
				break;
				
			}
			
			if(trovato == true) {
				System.out.println(studenti[pos]+ "matricola" + matricola[pos]);
			}else {
				System.out.println("Lo studente " + cerca + " non esiste!!!");
			}
				
			
		}
		
		
	}

}
