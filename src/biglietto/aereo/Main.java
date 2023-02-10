package biglietto.aereo;

public class Main {

	public static void main(String[] args) {
		
		BigliettoAereo ba1 = new BigliettoPrimaClasse(20, "Trolley più Stiva", 250.50, "Limousine", "Moet", "Ventesima persona ad entrare");
		BigliettoAereo ba2 = new BigliettoSecondaClasse(120, "Trolley", 120.43, "Noccioline", "CocaCola");
	
		Hostess h = new Hostess();
		
		h.individuaTipoBiglietto(ba1);
		System.out.println("------------------------------------------");
		
		h.individuaTipoBiglietto(ba2);
	
	}

}
