package tp2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;
import java.util.Set;

public class MainEtudiant {

	public static void main(String[] args) throws IOException { 
		//Création d'un nouvel étudiant dont le nom est paul  
		Etudiant etud1 = new Etudiant("Paul");
		//En vous inspirant de l'exemple, écrire ci-dessous le code pour créer les autres étudiants  
		Etudiant etud2 = new Etudiant("Jean", 24, 1, 2);
		Etudiant etud3 = new Etudiant("Abdoulkhader", 23, 2, 2);
		Etudiant etud4 = new Etudiant("Astrid", 26, 1, 3);
		Etudiant etud5 = new Etudiant("Paolo", 27, 1, 3);
		Etudiant etud6 = new Etudiant("zoe", 26, 12, 14, 17, 1, 1);

		/* Affichage des informations grâce à l'accesseur get */
		//Affichage du nom de etud1
		System.out.println("Le nom de l'étudiant1 est: " +etud1.getNom());
		//Ecrire ci-dessous les informations des autres étudiants (toutes les informations connues par étudiant)
		System.out.println("Le nom de l'étudiant2 est: " +etud2.getNom() +
		  ". Il a: "+ etud2.getAge() + " ans.");
		System.out.println("Le nom de l'étudiant3 est: " +etud3.getNom() +
		  ". Il a: "+ etud3.getAge() + " ans.");
		System.out.println("Le nom de l'étudiant4 est: " +etud4.getNom() +
		  ". Il a: "+ etud4.getAge() + " ans.");
		System.out.println("Le nom de l'étudiant5 est: " +etud5.getNom() +
		  ". Il a: "+ etud5.getAge() + " ans.");
		System.out.println("Le nom de l'étudiant6 est: " +etud6.getNom() +
		  ". Il a: "+ etud6.getAge() + " ans. Il a eu pour notes: "+
		etud6.getNoteProg() + " en prog, " + etud6.getNoteStage() + " en stage, " +
		etud6.getNoteSyst()+ " en syteme.");

		/* Modification d'information grâce à l'accesseur set */
		// Modification du nom de etud1 
		etud1.setNom("Paul-Henri");

		// Ecrire ci-dessous le code pour modifier l'âge de Jean
		etud2.setAge(25);
		//Ecrire ci-dessous le code pour modifier la note de programmation de Zoe
		etud6.setNoteProg(15);
		// Ecrire ci-dessous le code pour ajouter les notes des autres étudiants
		
		etud1.setNoteProg(16);
		etud1.setNoteSyst(15);
		etud1.setNoteStage(14);
			
		etud2.setNoteProg(1);
		etud2.setNoteSyst(7);
		etud2.setNoteStage(11);	
//		etud2.setNoteProg(20);
//		etud2.setNoteSyst(20);
//		etud2.setNoteStage(20);	
			
//		etud3.setNoteProg(10);
//		etud3.setNoteSyst(14);
//		etud3.setNoteStage(11);
		etud3.setNoteProg(20);
		etud3.setNoteSyst(20);
		etud3.setNoteStage(19);
		
		etud4.setNoteProg(12);
		etud4.setNoteSyst(5);
		etud4.setNoteStage(18);
		
		etud5.setNoteProg(15);
		etud5.setNoteSyst(14);
		etud5.setNoteStage(17);

		/* Verification que les modifications ont bien été prises en compte */
		
		//Pour chaque étudiant modifié, écrire ci-dessous le code permettant d'afficher les nouvelles informations, grâce à l'accesseur get
	
		System.out.println("Le nom de l'étudiant est: " +etud1.getNom() + ". Il a: "+ etud1.getAge() +
				" ans. Il a eu pour notes: "+ etud1.getNoteProg() + " en prog, " + etud1.getNoteStage() + " en stage, " + etud1.getNoteSyst()+ " en syteme.");
				
		System.out.println("Le nom de l'étudiant est: " +etud2.getNom() + ". Il a: "+ etud2.getAge() +
				" ans. Il a eu pour notes: "+ etud2.getNoteProg() + " en prog, " + etud2.getNoteStage() + " en stage, " + etud2.getNoteSyst()+ " en syteme.");
		
		System.out.println("Le nom de l'étudiant est: " +etud3.getNom() + ". Il a: "+ etud3.getAge() +
				" ans. Il a eu pour notes: "+ etud3.getNoteProg() + " en prog, " + etud3.getNoteStage() + " en stage, " + etud3.getNoteSyst()+ " en syteme.");
		
		System.out.println("Le nom de l'étudiant est: " +etud4.getNom() + ". Il a: "+ etud4.getAge() +
				" ans. Il a eu pour notes: "+ etud4.getNoteProg() + " en prog, " + etud4.getNoteStage() + " en stage, " + etud4.getNoteSyst()+ " en syteme.");
		
		System.out.println("Le nom de l'étudiant est: " +etud5.getNom() + ". Il a: "+ etud5.getAge() +
				" ans. Il a eu pour notes: "+ etud5.getNoteProg() + " en prog, " + etud5.getNoteStage() + " en stage, " + etud5.getNoteSyst()+ " en syteme.");
		
		System.out.println("Le nom de l'étudiant est: " +etud6.getNom() + ". Il a: "+ etud6.getAge() +
				" ans. Il a eu pour notes: "+ etud6.getNoteProg() + " en prog, " + etud6.getNoteStage() + " en stage, " + etud6.getNoteSyst()+ " en syteme.");
			
		/* Utilisation de la méthode toString  */
			
		//Utilisation de la méthode toString pour afficher l'étudiant etud1
		System.out.println("Informations concernant l'étudiant 1: " + etud1);
		//Faire la même chose pour tous les étudiants et vérifier que les données sont correctes
		System.out.println("Informations concernant l'étudiant 2: " + etud2);
		System.out.println("Informations concernant l'étudiant 3: " + etud3);
		System.out.println("Informations concernant l'étudiant 4: " + etud4);
		System.out.println("Informations concernant l'étudiant 5: " + etud5);
		System.out.println("Informations concernant l'étudiant 6: " + etud6);
		
		/* Utilisation de la méthode saisie */
		// Créer un nouvel étudiant etud7 grace au constructeur vide
		Etudiant etud7 = new Etudiant();	
		// Ouvrir le scanner
		Scanner s = new Scanner(System.in);
		//Utiliser la méthode saisie définie dans la classe Etudiant sur l'étudiant etud7 (vous choisissez les valeurs)
//		etud7.saisie(s);
		//Vérifier grâce à la méthode toString que les informations concernant etud7 ont bien été initialisées
//		System.out.println(etud7);

		/* Utilisation de la méthode moyenne */
		// Calcul et affichage de la moyenne de Paul-Henri. A décommenter pour exemple
		System.out.println("la moyenne de "+ etud1.getNom()+" est: " + etud1.moyenne());
		//Ecrire ci dessous le code pour calculer et afficher la moyenne des autres étudiants
		System.out.println("la moyenne de "+ etud2.getNom()+ " est: " + etud2.moyenne());
		System.out.println("la moyenne de "+ etud3.getNom()+ "  est: " + etud3.moyenne());
		System.out.println("la moyenne de "+ etud4.getNom()+ "  est: " + etud4.moyenne());
		System.out.println("la moyenne de "+ etud5.getNom()+ "  est: " + etud5.moyenne());
		System.out.println("la moyenne de "+ etud6.getNom()+ "  est: " + etud6.moyenne());
		System.out.println("la moyenne de "+ etud7.getNom()+ "  est: " + etud7.moyenne());
			
		/* Utilisation de la méthode mention pour chaque étudiant. Code à écrire ci-dessous */	
		System.out.println("la mention de "+ etud2.getNom()+ " est: " + etud2.mention());
		System.out.println("la mention de "+ etud3.getNom()+ "  est: " + etud3.mention());
		System.out.println("la mention de "+ etud4.getNom()+ "  est: " + etud4.mention());
		System.out.println("la mention de "+ etud5.getNom()+ "  est: " + etud5.mention());
		System.out.println("la mention de "+ etud6.getNom()+ "  est: " + etud6.mention());
		System.out.println("la mention de "+ etud7.getNom()+ "  est: " + etud7.mention());
		
		/* Utilisation de la méthode ligneResultat pour chaque étudiant. Code à écrire ci-dessous */	
		System.out.println(etud1.ligneResultat());
		System.out.println(etud2.ligneResultat());
		System.out.println(etud3.ligneResultat());
		System.out.println(etud4.ligneResultat());
		System.out.println(etud5.ligneResultat());
		System.out.println(etud6.ligneResultat());
		System.out.println(etud7.ligneResultat());	
		
//		Etudiant etud8 = new Etudiant("Pierre", 24, 1, 2);
//		System.out.println(etud8.toString());
		
//		Etudiant etud9 = new Etudiant();
//		etud9.saisie(s);
//		System.out.println(etud9.toString());
		
		Promotion promo = new Promotion();
		promo.inscrire(etud1);
		promo.inscrire(etud2);
		System.out.println(promo.afficheEtudiants());
		System.out.println(promo.getEtudiant(0));
		
		Promotion promo2021 = new Promotion(2021);
		promo2021.inscrire(etud1);
		promo2021.inscrire(etud2);
		promo2021.inscrire(etud3);
		promo2021.inscrire(etud4);
		promo2021.inscrire(etud5);
		promo2021.inscrire(etud6);
		System.out.println("Liste des étudiants : \n"+promo2021.afficheEtudiants());
		System.out.println("Nombre d'étudiants de promotion 2021: \n"+promo2021.nbEtudiants());
		System.out.println("Le troisième étudiant inscrit dans la promotion 2021 : \n"+promo2021.getEtudiant(2));
		System.out.println("La moyenne générale de la promotion est : \n"+promo2021.moyenneGenerale());
		
		promo2021.afficheResultats();
		System.out.println("Recherche étudiant par nom : \n"+promo2021.recherche("Jean"));
		
		ArrayList<Etudiant> listeAdmis = promo2021.listeAdmis();
		if (listeAdmis.size() > 0) {
			for (Etudiant etud : listeAdmis) {
				System.out.println("Nom d'étudiant admis : " + etud.getNom() + ", sa note moyenne est : " + etud.moyenne());
			}
		}
		
		System.out.println("Nom de major de promo : " + promo2021.major());
		
		System.out.println("Les noms de majors et leur moyenne : ");
		ArrayList<Etudiant> majors = promo2021.majors();
		for (Etudiant etud : majors) {
			System.out.println(etud.getNom());
		}
		System.out.println(majors.get(0).moyenne());
		
		ArrayList<Etudiant> nouveauxInscritsNonFrancophones = promo2021.nouveauxInscritsNonFrancophones();
		System.out.println("Le nombre d'étudiant nouvellement inscrits et non francophoes : " + nouveauxInscritsNonFrancophones.size());
		for (Etudiant etud : nouveauxInscritsNonFrancophones) {
			System.out.println(etud.toString());
		}
	
		promo2021.histogramme();
	}
}
