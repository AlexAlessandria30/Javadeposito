package matematica;

public class Calcoli {
	
	//polimorfismo per meted sovraccarico di metodi in defaul classe pizza
	
    String nome = "PIPPO S.R.l "; // variabile di classe
	
	public void calcoloUno(int x) {
		System.out.println(nome);
		int somma = x +12;
		System.out.println(somma);
	}

	public String calcoloUno(int x, int y) {	
		int somma = x + y;
		return somma+ " " + nome;
		
	}

}
