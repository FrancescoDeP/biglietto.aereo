package biglietto.aereo;

public class BigliettoPrimaClasse extends BigliettoAereo{
	
	private String autista;
	private String champagne;
	private String priority;
	
	public BigliettoPrimaClasse() {
		
	}
	
	public BigliettoPrimaClasse(int posto, String bagaglio, double prezzo, String autista, String champagne, String priority) {
		super(posto, bagaglio, prezzo);
		this.autista = autista;
		this.champagne = champagne;
		this.priority = priority;
	}

	public String getAutista() {
		return autista;
	}

	public void setAutista(String autista) {
		this.autista = autista;
	}

	public String getChampagne() {
		return champagne;
	}

	public void setChampagne(String champagne) {
		this.champagne = champagne;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n"
				+ "Autista: " + autista + "\n"
				+ "Champagne: " + champagne + "\n"
				+ "Tipo biglietto: " + priority;
	}

}
