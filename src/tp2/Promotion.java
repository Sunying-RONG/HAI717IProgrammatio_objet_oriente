package tp2;

import java.util.ArrayList;

public class Promotion {
	// attribut
	private ArrayList<Etudiant> listEtudiant = new ArrayList<>();
	private int annee;
	private ArrayList<Etudiant> listeAdmis = new ArrayList<>();
	
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
	
	public ArrayList<Etudiant> listeAdmis() {
		for (Etudiant etud : listEtudiant) {
			if (etud.moyenne() >= 10) {
				this.listeAdmis.add(etud);
			}
		}
		return listeAdmis;
	}
	
	public String major() {
		String majorNom = null;
		double majorNote = 0;
		ArrayList<Etudiant> list;
		if (listeAdmis.size() > 0) {
			list = this.listeAdmis;
		} else {
			list = this.listEtudiant;
		}
		for (Etudiant etud : list) {
			if (etud.moyenne() > majorNote) {
				majorNote = etud.moyenne();
				majorNom = etud.getNom();
			}
		}
		return majorNom;
	}
	
	public double majorNote() {
		double majorNote = 0;
		ArrayList<Etudiant> list = listeAdmis.size() > 0 ? this.listeAdmis : this.listEtudiant;
		for (Etudiant etud : list) {
			if (etud.moyenne() > majorNote) {
				majorNote = etud.moyenne();
			}
		}
		return majorNote;
	}
	
	public ArrayList<Etudiant> majors() {
		ArrayList<Etudiant> majors = new ArrayList<>();
		double majorNote = this.majorNote();
		ArrayList<Etudiant> list = listeAdmis.size() > 0 ? this.listeAdmis : this.listEtudiant;
		for (Etudiant etud : list) {
			if (etud.moyenne() == majorNote) {
				majors.add(etud);
			}
		}
		return majors;
	}
	
	public ArrayList<Etudiant> nouveauxInscritsNonFrancophones() {
		ArrayList<Etudiant> nouveauxInscritsNonFrancophones = new ArrayList<>();
		for (Etudiant etud : this.listEtudiant) {
			System.out.println(etud.toString());
			Inscription insc = etud.getInscription();
			if (insc != null && insc.getCodePays() == 3 && insc.getCodeInscripiton() == 1) {
				nouveauxInscritsNonFrancophones.add(etud);
			}
		}
		return nouveauxInscritsNonFrancophones;
	}
}
