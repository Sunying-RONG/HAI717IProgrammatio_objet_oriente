package tp3;

public class Lettre extends ObjetPostal {
	//attributs
	private Priorite urgOrd;

	//constructeur
	public Lettre(String origine, String destination, String codePostal, double poids, double volume, int taux,
			Priorite urgOrd) {
		super(origine, destination, codePostal, poids, volume, taux);
		this.setUrgOrd(urgOrd);
	}

	//setter et getter
	public Priorite getUrgOrd() {
		return urgOrd;
	}

	public void setUrgOrd(Priorite urgOrd) {
		this.urgOrd = urgOrd;
	}

	//methods
	@Override
	public String toString() {
		return "Lettre [urgOrd=" + urgOrd + ", toString()=" + super.toString() + "]";
	}

	@Override
	public double tarifBase() {
		return 0.5;
	}

	@Override
	public double tarifSuppl() {
		if (this.urgOrd == Priorite.urgente) {
			return 0.3;
		} else {
			return 0;
		}
	}

	
	
	
}
