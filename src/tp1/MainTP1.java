package tp1;

import java.util.Scanner;

public class MainTP1 {
	
	// Cette méthode main est la méthode principale
	// Le programme commence à s'exécuter à partir de là
	// et appelle des sous-programmes
	
	public static void main(String[] args) {

		// On crée un Scanner pour tout le programme
		// Il représente le flux de ce qui est saisi au clavier
		
		 Scanner sc = new Scanner(System.in);
		 
		 // -----------------
		 // Test de la conversion Celsius vers Farenheit
		 
		 System.out.println("**** Test de la conversion Celsius vers Farenheit ****");
		 
		 // Cas 1 : valeur de température ordinaire en été à Montpellier
		 
		 System.out.println("En été à Montpellier : 35 degrés celsius valent "+
				 celsius2Farenheit(35)+" en degrés Farenheit");
		
		 // Cas 2 : valeur du point de congélation de l'eau
		 
		 System.out.println("Congélation de l'eau : 0 degrés celsius valent "+
				 celsius2Farenheit(0)+" en degrés Farenheit");
		 	
		 // Cas 3 : on demande à l'utilisateur d'entrer une valeur au clavier
		 
		 System.out.println("Veuillez entrer un nombre réel représentant une température en degrés Celsius");
		 
		 double tempCelsius = sc.nextDouble();
		 
		 System.out.println(tempCelsius+" degrés celsius valent "+
				 celsius2Farenheit(tempCelsius)+" en degrés Farenheit");
		 
		 // Alternativement, pour mieux structurer
		 // appel du sous-programme de test
		 // en passant en paramètre le Scanner
		 
		 testConversionCelsius2Farenheit(sc);
		 
		 // Ici appel des sous-programmes de test des autres sous-programmes
		 
		 // Conversion secondes vers chaîne formattée
		
		 testConversionSecondes2ChaineHMnSec(sc);
		 
		 // Moyenne
		 
		 testMoyenne(sc);
		 
		 // Moyenne pondérée
		 
		 testMoyennePonderee(sc);
		 
		 // SNCF
		 testCarteVermeil(sc);
		 
		 // Infinitif
		 		 
		 testConjugueFuturPremierGroupe(sc);
	}

	// Sous-programme réalisant une conversion degrés Celsius vers degrés Farenheit
	// Entrée : un nombre réel tempC passé en paramètre
	//          tempC représente une temperature exprimée en degrés Celsius
	// Résultat : un nombre réel résultat de la conversion en degrés Farenheit
	// Méthode : calcul de tempC * 1,8 + 32.

	public static double celsius2Farenheit(double tempC) {
		return tempC * 1.8 + 32;	
	}
	
	// Sous-programme de test de la conversion, équivalent aux instructions du programme
	// "main" lignes 18 à 51 mais ce sous-programme doit y être appelé (voir lignes 53-57)
	
	public static void testConversionCelsius2Farenheit(Scanner sc) {

		System.out.println("**** Test de la conversion Celsius vers Farenheit ****");
		 
		 // Cas 1 : valeur de température ordinaire en été à Montpellier
		 
		 System.out.println("En été à Montpellier : 35 degrés celsius valent "+
				 celsius2Farenheit(35)+" en degrés Farenheit");
		
		 // Cas 2 : valeur du point de congélation de l'eau
		 
		 System.out.println("Congélation de l'eau : 0 degrés celsius valent "+
				 celsius2Farenheit(0)+" en degrés Farenheit");
		 	
		 // Cas 3 : on demande à l'utilisateur d'entrer une valeur au clavier
		 
		 System.out.println("Veuillez entrer un nombre réel représentant une température en degrés Celsius");
		 
		 double tempCelsius = sc.nextDouble();
		 
		 System.out.println(tempCelsius+" degrés celsius valent "+
				 celsius2Farenheit(tempCelsius)+" en degrés Farenheit");	
		 
		 // Cas 4 : valeur du point d'ébullition de l'eau
		 
		 System.out.println("Ebullition de l'eau : 100 degrés celsius valent "+
				 celsius2Farenheit(100)+" en degrés Farenheit");

		 // Cas 5 : valeur référence des degrés Farenheit (Température la plus basse que Gabriel Fahrenheit 
		 //         a pu mesurer en laboratoire)
		 
		 System.out.println("Point de référence de Farenheit : –17,778 degrés celsius valent "+
				 celsius2Farenheit(-17.77777777777778)+" en degrés Farenheit");
	 
	}
	
	// Sous-programme réalisant la conversion d'une durée en secondes en une chaîne
	// de caractères sous la forme ..H ..Mn ..Sec
	// Entrée : un nombre entier sec passé en paramètre
	//          sec représente un nombre de secondes
	// Résultat : une chaîne de caractères sous la forme ..H ..Mn ..Sec
	// Méthode : (... à compléter ...)

	
	public static String secondes2ChaineHMnSec(int sec) {
		int H = sec / 3600;
		int reste = sec % 3600;
		int Mn = reste / 60;
		int Sec = reste % 60;
		return (H+" H "+Mn+" Mn "+Sec+" Sec");		
	}
	
	// Sous-programme réalisant le test de la conversion d'une durée en secondes en une chaîne
	// de caractères sous la forme ..H ..Mn ..Sec
	
	public static void testConversionSecondes2ChaineHMnSec(Scanner sc) {
		
		 System.out.println("\n**** Test de la conversion Secondes vers ..H ..Mn ..Sec ****");
		 
		 // Cas 1 : valeur de 7384
		 
		 System.out.println("7384 = "+secondes2ChaineHMnSec(7384));
		 
		// Ici les 6 autres cas de test

		 // Cas 2 : valeur de 0
		 
		 System.out.println("0 = "+secondes2ChaineHMnSec(0));

		 // Cas 3 : valeur de 7200
		 
		 System.out.println("7200 = "+secondes2ChaineHMnSec(7200));

		 // Cas 4 : valeur de 180
		 
		 System.out.println("180 = "+secondes2ChaineHMnSec(180));

		 // Cas 5 : valeur de 4
	 
		 System.out.println("4 = "+secondes2ChaineHMnSec(4));
		 
		 // Cas 6 : valeur de -128
		 
		 System.out.println("-128 = "+secondes2ChaineHMnSec(-128));
		 
		 // Cas 7 : entrée d'une valeur au clavier
		 
		 System.out.println("Veuillez entrer un nombre entier représentant un nombre de secondes");
		 int secondes = sc.nextInt();
		 System.out.println(secondes+"  = "+secondes2ChaineHMnSec(secondes));
	 
	}
	
	// Ici les autres sous-programmes et les programmes de test associés

	//  

	
	// Sous-programme qui, à partir de trois notes d'un étudiant, 
	//                     calculer sa moyenne
	// Entrée : trois réels n1, n2, n2 passés en paramètre
	//          ces réels représente les trois notes (sur 20)
	// Résultat : un réel représentant la moyenne de ces trois notes
	// Méthode : calculer et retourner (n1+n2+n3)/3

	public static double moyenne(int n1, int n2, int n3) {
		return (n1+n2+n3)/3;		
	}
	
	// Sous-programme réalisant le test de moyenne
	  
	public static void testMoyenne(Scanner sc) {
		System.out.println("**** Test de la moyenne ****");
		
		// cas 1 : moyenne de 0, 0, 0
		System.out.println("moyenne de "+0+", "+0+", "+0+" = " +moyenne(0,0,0));
		
		// cas 2 : moyenne de 10, 10, 10
		System.out.println("moyenne de "+10+", "+10+", "+10+" = "+moyenne(10,10,10));
		
		// cas 3 : moyenne de 20, 20, 20
		System.out.println("moyenne de "+20+", "+20+", "+20+" = "+moyenne(20,20,20));

		// cas 4 : moyenne de 12, 14, 16
		System.out.println("moyenne de "+12+", "+14+", "+16+" = "+moyenne(12,14,16));

		// cas 5 : moyenne de 7, 12, 8
		System.out.println("moyenne de "+7+", "+12+", "+8+" = "+moyenne(7,12,8));

		// cas 6 : valeurs saisies au clavier
		System.out.println("Veuillez entrer 3 notes sur 20");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		System.out.println("moyenne de "+n1+", "+n2+", "+n3+" = "+moyenne(n1,n2,n3));
	}

	// Sous-programme qui, à partir de trois notes d'un étudiant, 
	//                     calculer sa moyenne
	// Entrée : six réels n1, n2, n3, c1, c2, c3 passés en paramètre
	//          n1, n2, n3 représentent les trois notes (sur 20)
	//          c1, c2, c3 représentent leurs coefficients respectifs
				
	// Résultat : un réel représentant la moyenne pondereede ces trois notes
	// Méthode : calculer et retourner (n1*c1+n2*c2+n3*c3)/c1+c2+c3

	public static double moyennePonderee(int n1, int n2, int n3,
										int c1, int c2, int c3) {
		return (n1*c1+n2*c2+n3*c3)/(c1+c2+c3);		
	}

	// Sous-programme réalisant le test de moyenne
	
	// on introduit un sous-programme auxiliaire pour simplifier le code
	// de la méthode de test - cette technique pourrait être appliquée
	// sur la méthode de test précédente, elle évite des duplications
	// de code et permet de centraliser les modifications ou les corrections
	
	public static void testCasMoyennePonderee(int n1, int n2, int n3,
									int c1, int c2, int c3) {
		System.out.println("moyenne ponderee de "+n1+"(coeff. "+c1+"), "
									+n2+"(coeff. "+c2+"), "
									+n3+"(coeff. "+c3+")"
				+ "\n= " +moyennePonderee(n1,n2,n3,c1,c2,c3));

	}
		  
	public static void testMoyennePonderee(Scanner sc) {
		System.out.println("**** Test de la moyenne ponderee ****");
		
		// cas 1 : moyenne de 0, 0, 0 avec 20, 20, 60
		testCasMoyennePonderee(0, 0, 0, 20, 20, 60);
		
		// cas 2 : moyenne de 10, 10, 10 avec 20, 20, 60
		testCasMoyennePonderee(10, 10, 10, 20, 20, 60);
		
		// cas 3 : moyenne de 20, 20, 20 avec 20, 20, 60
		testCasMoyennePonderee(20, 20, 20, 20, 20, 60);
		
		// cas 4 : moyenne de 12, 14, 16 avec 20, 20, 60
		testCasMoyennePonderee(12, 14, 16, 20, 20, 60);
		
		// cas 5 : moyenne de 12, 14, 16 avec 30, 30, 20
		testCasMoyennePonderee(12, 14, 16, 30, 30, 20);
		
		// cas 6 : moyenne de 7, 12, 8 avec 20, 20, 60
		testCasMoyennePonderee(7, 12, 8, 20, 20, 60);			
		
		// cas 7 : valeurs saisies au clavier
		System.out.println("Veuillez entrer 3 notes sur 20");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		System.out.println("Veuillez entrer 3 coefficients (somme égale à 100)");
		int c1 = sc.nextInt();
		int c2 = sc.nextInt();
		int c3 = sc.nextInt();
		testCasMoyennePonderee(n1,n2,n3,c1,c2,c3);			
	}

	// Sous-programme qui, à partir de l'âge et du genre (caractère 'M' ou 'F') 
	// d'une personne, détermine si la personne a droit ou non à la carte vermeil S.N.C.F 
	// (sans utiliser d'instruction conditionnelle, en construisant une expression 
	// booléenne).  L'âge requis est 60 ans pour les femmes, 65 ans pour les hommes.
	// Entrée : un entier a et un caractère g passés en paramètre
	//          a représente l'âge
	//          g représentent le genre						
	// Résultat : un booléen, la valeur est vrai si la personne a droit à la carte
	//            et faux sinon
	// Méthode : calculer et retourner l'expression booléenne
	//           ((a >= 65) || (a >=60 && g == 'f'))

	
	public static boolean carteVermeil(int a, char g)
	{
		return ((a >= 65) || (a >=60 && g == 'f'));
	}
	
	// Sous-programme réalisant le test de carteVermeil

	public static void testCarteVermeil(Scanner sc) {
		
		System.out.println("**** Test de .... ****");

		// Cas 1 : femme de 40 ans
		System.out.println("femme de 40 ans , droit ="+carteVermeil(40,'f'));
		
		// Cas 2 : homme de 40 ans
		System.out.println("homme de 40 ans , droit ="+carteVermeil(40,'h'));
		
		// Cas 3 : femme de 60 ans
		System.out.println("femme de 60 ans , droit ="+carteVermeil(60,'f'));
		
		// Cas 4 : homme de 60 ans	
		System.out.println("homme de 60 ans , droit ="+carteVermeil(60,'h'));		
		
		// Cas 5 : femme de 61 ans
		System.out.println("femme de 61 ans , droit ="+carteVermeil(61,'f'));
		
		// Cas 6 : homme de 61 ans
		System.out.println("homme de 61 ans , droit ="+carteVermeil(61,'h'));		
				
		// Cas 7 : femme de 65 ans
		System.out.println("femme de 65 ans , droit ="+carteVermeil(65,'f'));
		
		// Cas 8 : homme de 65 ans
		System.out.println("homme de 65 ans , droit ="+carteVermeil(65,'h'));		
		
		// Cas 9 : femme de 67 ans
		System.out.println("femme de 67 ans , droit ="+carteVermeil(67,'f'));
		
		// Cas 10 : homme de 67 ans
		System.out.println("homme de 67 ans , droit ="+carteVermeil(67,'h'));		
					
		// Cas avec entrée des informations au clavier
		System.out.println("Veuillez entrer un âge");
		int a = sc.nextInt();
		System.out.println("Veuillez entrer un genre (h ou f)");
		char g = sc.next().charAt(0);
		System.out.println("droit ="+carteVermeil(a,g));		
	}
	
	
	// Sous-programme qui, à partir de l'infinitif d'un verbe du premier groupe 
	// calcule une chaîne de caractères contenant la conjugaison du verbe 
	// au futur de l'indicatif.
	// Entrée : une chaîne de caractères passée en paramètre
	//          qui représente un verbe du premier groupe à l'infinitif					
	// Résultat : une chaîne de caractères contenant la conjugaison du verbe 
	//            au futur de l'indicatif
	// Méthode : attacher successivement pour chaque personne :
	//           le pronom, le verbe à l'infinitf, la terminaison 
	//           puis retourner la chaîne
	
	public static String conjugueFuturPremierGroupe(String inf) {
		String conjug = " je "+inf+"ai"
				+"\n tu "+inf+"as"
				+"\n elle/il "+inf+"a"
				+"\n nous "+inf+"ons"
				+"\n vous "+inf+"ez"
				+"\n elles/ils "+inf+"ont";
		return conjug;		
	}
	
	// Sous-programme réalisant le test de la conjugaison

	public static void testConjugueFuturPremierGroupe(Scanner sc) {
		System.out.println("**** Test de conjugueFuturPremierGroupe ****");	
		
		// Cas 1 : chanter
		System.out.println("chanter"+conjugueFuturPremierGroupe("chanter"));

		// Cas 2 : travailler
		System.out.println("travailler"+conjugueFuturPremierGroupe("travailler"));
		
		// Cas 3 : infinitif entré au clavier
		System.out.println("\nVeuillez entrer un verbe du premier groupe à l'infinitif");
		String inf = sc.next();
		System.out.println(conjugueFuturPremierGroupe(inf));		
		
	}
	
}