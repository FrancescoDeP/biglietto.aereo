package biglietto.aereo;

public class BigliettoSecondaClasse extends BigliettoAereo{

	private String snack;
	private String bibita;
	
	public BigliettoSecondaClasse() {
		
	}
	
	public BigliettoSecondaClasse(int posto, String bagaglio, double prezzo, String snack, String bibita) {
		super(posto, bagaglio, prezzo);
		this.snack = snack;
		this.bibita = bibita;
	}
	
	public String getSnack() {
		return snack;
	}

	public void setSnack(String snack) {
		this.snack = snack;
	}

	public String getBibita() {
		return bibita;
	}

	public void setBibita(String bibita) {
		this.bibita = bibita;
	}

	@Override
	public String toString() {
		return super.toString() + "\n"
				+ "Snack: " + snack + "\n"
				+ "Bibita: " + bibita;
	}
}
