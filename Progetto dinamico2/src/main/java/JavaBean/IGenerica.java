package JavaBean;



public interface IGenerica {
	public String[] mostracolleghi();
	
	public void insertPersona(Persona Beanp);
	void insertPassword(Password persona1);
	void insertEsame(Esami persona);
	Persona BeanP(String nome, String cognome, String dataN, String citta, String matricola);

	
	
}
