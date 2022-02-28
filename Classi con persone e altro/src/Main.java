

import matematica.Calcoli;

public class Main {

	public static void main(String[] args) {

		Persona persona1 = new Persona("Luca", "Rossi",21);
		Persona persona2 = new Persona("Giorgio", "Reed",19);
		Persona persona3 = new Persona("Alex", "IO", 20);
		
	
		
	   persona1.cercaNome("Rossi");
	  
	   
	   
	   Persone p1 = new Persone();
	   p1.setNome("Mario");
	   p1.setCognome("Rossi");
	   
	   Persone p2 = new Persone();
	   p2.setNome("Angela");
	   p2.setCognome("Sole");
	   
	   Persone p3 = new Persone();
	   p3.setNome("Salvatore");
	   p3.setCognome("Silk");
	   
	   
	   Ricerca ric = new Ricerca();
	   
	   String valore ="Mario";
	   boolean eccolo =  ric.cercoNome(p1, p2, p3, valore);
	   System.out.println(eccolo);
	   
	
	  
		

		//System.out.println(persona1);
		//System.out.println(persona2);

	//	persona1.saluta(persona2); // passiomo gli oggetti come parametri delle funzioni
	//	persona1.Giorno();

	//	Pizza pizza1 = new Pizza("integrale");
	//	Pizza pizza2 = new Pizza("Classico", "Sugo", "Mozzarella", "Piccante", "Salame");
	//	Pizza pizza3 = new Pizza("Normale", "Sugo", "Ananas");

		// classe studenti che estende la classe persona
		Studenti studente1 = new Studenti("Mario", "Rossi",15 ,"Matematica");
	//	studente1.Presentazione();
	//	studente1.Giorno();

		// classe astratta
		Macchina macchina = new Macchina();
		//macchina.frena();
		//macchina.muovi();

		Operazioni operazione = new Operazioni();

		int[] a = { 11, 111, 2222, 333, 44444, 999999999, 7777777, 999999998 };
		//operazione.maxArray(a);
		//operazione.sommaCost(23);
		//operazione.somma(23, 12);

		int sa = operazione.addizione(21, 320);
		//System.out.println(sa);

		// operazione.array(a);

		int[] ar = operazione.dammiArray();
		for (int i : ar) {
			if (i >= 10) {
				//System.out.println(i + " maggiore di 10");
			} else {
				//System.out.println(i + " minore di 10");
			}
			// System.out.print(i+ " ");
		}

		Calcoli calcolo = new Calcoli();
		String as = calcolo.calcoloUno(21, 12);
		//System.out.println(as);

	}

}
