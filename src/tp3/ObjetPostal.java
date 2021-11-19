package tp3;

public abstract class ObjetPostal {
	// attributs
	private String origine;
	private String destination;
	private String codePostal;
	private double poids;
	private double volume;
	private int taux;
	
	// constructeur
	public ObjetPostal(String origine, String destination, String codePostal, double poids, double volume, int taux) {
		super();
		this.origine = origine;
		this.destination = destination;
		this.codePostal = codePostal;
		this.poids = poids;
		this.volume = volume;
		this.taux = taux;
	}
	
	// setter et getter
	public String getOrigine() {
		return origine;
	}
	public void setOrigine(String origine) {
		this.origine = origine;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}
	public double getPoids() {
		return poids;
	}
	public void setPoids(double poids) {
		this.poids = poids;
	}
	public double getVolume() {
		return volume;
	}
	public void setVolume(double volume) {
		this.volume = volume;
	}
	public int getTaux() {
		return taux;
	}
	public void setTaux(int taux) {
		this.taux = taux;
	}

	// methods
	@Override
	public String toString() {
		return "ObjetPostal [origine=" + origine + ", destination=" + destination + ", codePostal=" + codePostal
				+ ", poids=" + poids + ", volume=" + volume + ", taux=" + taux + "]";
	}
	
	public abstract double tarifBase();
	
	public abstract double tarifSuppl();
	
	public double tarifAffranchissement() {
		if (this.taux == 1) {
			return this.tarifBase() + 0.5 + this.tarifSuppl();
		} else if (this.taux == 2) {
			return this.tarifBase() + 1.5 + this.tarifSuppl();
		} else {
			return this.tarifBase() + this.tarifSuppl();
		}
	}
	
	
}
