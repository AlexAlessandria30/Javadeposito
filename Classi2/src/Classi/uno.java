package Classi;

import java.util.Scanner;

public class uno {
	
	private int var1;
	private int var2 ;
	private String nome;
	Scanner in = new Scanner (System.in);
	
	public void m1() {
		System.out.println("Ciao " + var1);
	}
	
	public void m2() {
		System.out.println("Ciao " + var2);
	}
	
	public void modificaVar1() {
		System.out.println("Inserisci var1");
		var1 = in.nextInt();
	}
	
	public void m4 (String nome) {
		this.nome = nome ;
		System.out.println("Ciao sono " + nome);
	}
	
	public String ottieniNome() {
		return nome;
	}

}
