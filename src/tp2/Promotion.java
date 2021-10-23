package tp2;

import java.util.ArrayList;

public class Promotion {
	// attribut
	private ArrayList<Etudiant> listEtudiant = new ArrayList<>();
	private int annee;
	
	// constructeur 
	public Promotion() {
		this.annee = 0;
	}
	
	public Promotion(int annee) {
		this.setAnnee(annee);
	}
	
	// accesseurs
	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		if (annee >= 0) {
			this.annee = annee;
		} else {
			System.out.println("année n'existe pas !");
		}
		
	}
	
	// methodes
	public void inscrire(Etudiant etud) {
		if (!listEtudiant.contains(etud)) {
			listEtudiant.add(etud);
		} else {
			System.out.println("Etudiant existe !");
		}
	}
	
	public int nbEtudiants() {
		return this.listEtudiant.size();
	}
	
	public String afficheEtudiants() {
		if (this.nbEtudiants() > 0) {
			StringBuffer s = new StringBuffer();
			for (Etudiant etud : listEtudiant) {
				s.append(etud.toString()+"\n");
			}
			return s.toString();
		}
		return "pas d'étudiant";
	}
	
	public Etudiant getEtudiant(int i) {
		if (i >= 0 && i < nbEtudiants()) {
			return this.listEtudiant.get(i);
		} else {
			return null;
		}
		
	}
	
	public double moyenneGenerale() {
		double moyCalcul = 0;
		if (this.nbEtudiants() > 0) {
			for (Etudiant etud : listEtudiant) {
				moyCalcul += etud.moyenne();
			}
			return moyCalcul/this.nbEtudiants();
		} else {
			return 0;
		}
	}
	
	public void afficheResultats() {
		if (this.nbEtudiants() > 0) {
			for (Etudiant etud : listEtudiant) {
				System.out.println(etud.ligneResultat());
			}
		} else {
			System.out.println("pas d'étudiant");
		}	
	}
	
	public boolean recherche(String nom) {
		int i = 0;
		boolean trouve = false;
		while (i < this.nbEtudiants() && !trouve) {
			if (this.getEtudiant(i).getNom().equals(nom)) {
				trouve = true;
			}
			i++;
		}
		return trouve;
	}
	
}
