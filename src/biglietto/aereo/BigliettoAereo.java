package biglietto.aereo;

public class BigliettoAereo {
	
	private int posto;
	private String bagaglio;
	private double prezzo;

	public BigliettoAereo() {
		
	}

	public BigliettoAereo(int posto, String bagaglio, double prezzo) {
		this.posto = posto;
		this.bagaglio = bagaglio;
		this.prezzo = prezzo;
	}

	public int getPosto() {
		return posto;
	}

	public void setPosto(int posto) {
		this.posto = posto;
	}

	public String getBagaglio() {
		return bagaglio;
	}

	public void setBagaglio(String bagaglio) {
		this.bagaglio = bagaglio;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	
	@Override
	public String toString() {
		return "Posto a sedere: " + posto + "\n"
				+ "Bagagli: " + bagaglio + "\n"
				+ "Prezzo biglietto: " + prezzo;
	}
	
	
}
