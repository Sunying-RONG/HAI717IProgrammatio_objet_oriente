package tp2;

public class Inscription {
	// attribut
	private int codeInscription;
	private int codePays;
	
	// constructeur
	public Inscription(int codeInscription, int codePays) {
		this.setCodeInscription(codeInscription);
		this.setCodePays(codePays);
	}
	
	// accesseurs
	public void setCodeInscription(int codeInscription) {
		if (codeInscription == 1 || codeInscription == 2) {
			this.codeInscription = codeInscription;
		} else {
			System.out.println("Code d'inscription doit être 1 ou 2 !");
		}
		
	}
	
	public int getCodeInscripiton() {
		return this.codeInscription;
	}
	
	public void setCodePays(int codePays) {
		if (codePays == 1 || codePays == 2 || codePays == 3) {
			this.codePays = codePays;
		} else {
			System.out.println("Code pays doit être 1 ou 2 ou 3 !");
		}
	}
	
	public int getCodePays() {
		return this.codePays;
	}
	
	// methods
	public String nationalite() {
		String nationalite = "";
		if (this.codePays == 1) {
			nationalite = "étudiant est français";
		} else if (this.codePays == 2) {
			nationalite = "étudiant est étranger francophone";
		} else if (this.codePays == 3) {
			nationalite = "étudiant est étranger non francophone";
		}
		return nationalite;
	}
	
	public String typeInscription() {
		String typeIns = "";
		if (this.codeInscription == 1) {
			typeIns = "c'est une première inscription";
		} else if (this.codeInscription == 2) {
			typeIns = "c'est une réinscription";
		}
		return typeIns;
	}
	
	public String toString() {
		return this.nationalite() + ", " + this.typeInscription();
	}

}
