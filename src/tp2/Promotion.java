package tp2;

import java.util.ArrayList;

public class Promotion {
	// attribut
	private ArrayList<Etudiant> listEtudiant;
	private int annee;
	
	// constructeur 
	public Promotion() {
		this.annee = 0;
		this.listEtudiant = new ArrayList<Etudiant>();
	}
	
	public Promotion(int annee) {
		this.setAnnee(annee);
		this.listEtudiant = new ArrayList<Etudiant>();
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
		if (this.listEtudiant.size() > 0) {
			StringBuffer s = new StringBuffer();
			for (Etudiant etud : listEtudiant) {
				s.append(etud.toString()+"\n");
			}
			return s.toString();
		}
		return "pas d'étudiant";
	}
	
	public Etudiant getEtudiant(int i) {
		return this.listEtudiant.get(i);
	}
	
}
