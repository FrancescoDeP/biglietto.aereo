package biglietto.aereo;

public class Hostess {
	
	public void individuaTipoBiglietto(BigliettoAereo ba) {
		if(ba instanceof BigliettoPrimaClasse) {
			System.out.println("L'hostess accompagna il passeggero in prima classe." + "\n" + "Informazioni biglietto: " + "\n" + ba.toString());
		}else {
			System.out.println("L'hostess accompagna il passeggero in seconda classe." + "\n" + "Informazioni biglietto: " + "\n" + ba.toString());
		}
	}

}
