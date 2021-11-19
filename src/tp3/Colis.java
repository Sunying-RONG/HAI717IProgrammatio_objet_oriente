package tp3;

public class Colis extends ObjetPostal {
	//attributs
	private String contenu;
	private double valeur;
	
	//constructeur
	public Colis(String origine, String destination, String codePostal, double poids, double volume, int taux,
			String contenu, double valeur) {
		super(origine, destination, codePostal, poids, volume, taux);
		this.contenu = contenu;
		this.valeur = valeur;
	}
	
	// getter et setter
	public String getContenu() {
		return contenu;
	}

	public void setContenu(String contenu) {
		this.contenu = contenu;
	}

	public double getValeur() {
		return valeur;
	}

	public void setValeur(double valeur) {
		this.valeur = valeur;
	}

	//methods
	@Override
	public String toString() {
		return "Colis [contenu=" + contenu + ", valeur=" + valeur + ", toString()=" + super.toString() + "]";
	}

	@Override
	public double tarifBase() {
		return 2;
	}

	@Override
	public double tarifSuppl() {
		if (this.getVolume() > 1/8) {
			return 3;
		} else {
			return 0;
		}
	}


	
}
