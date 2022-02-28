package Principale;

import Classi.uno;
import modelli.Importi;

public class home {

	public static void main(String[] args) {

		uno uno = new uno();
		uno.modificaVar1();
		uno.m1();
		uno.m4("Salvatore");
		String as = uno.ottieniNome();
		System.out.println(as);
		
		
		Importi importo = new Importi();
		Importi importo2 = new Importi();

		
		
		importo.setNome("Alex Alessandria");
		importo.setValore(123);
		System.out.println(importo.getNome()+ " " + importo.getValore());
	
		importo2.setNome("Arianna Alessandria");
		importo2.setValore(124);
		System.out.println(importo2.getNome()+ " " + importo2.getValore());
	
		operazioni operazione = new operazioni();
		operazione.vediImporti(importo2);
		
	}

}
