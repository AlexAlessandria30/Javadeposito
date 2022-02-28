public class Persona {

	String nome;
	String cognome;
	int eta;

	Persona(String nome, String cognome, int eta) {

		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;

	}

	void saluta(Persona personaDaSalutare) {
		System.out.println("Ciao  " + personaDaSalutare.nome + " sono " + nome);
	}

	void cammina() {
		System.out.println("Sto camminando .....");
	}

	void Giorno() {
		System.out.println("ciao");
	}

	public String toString() {
		String persona = "Ciao sono  " + this.nome + " " + this.cognome;

		return persona;
	}

	public void cercaNome( String valore) {

		this.nome=nome;
		this.cognome=cognome;
		
	
	
		if (nome == valore) {
			boolean a = true;
			System.out.println(valore + " corrispondenza con nome" );
		}else if(cognome == valore) {
			boolean a = true;
			System.out.println(valore + " corrispondenza con cognome" );
		} else {
			System.out.println(valore + " non corrisponde ne al nome ne al cognome");
		}

	}
	
	
	

}
