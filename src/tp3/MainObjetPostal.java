package tp3;

public class MainObjetPostal {

	public static void main(String[] args) {
//ObjetPostal(String origine, String destination, String codePostal, double poids, double volume, int taux) {

//		ObjetPostal objetPostal1 = new ObjetPostal("ori a", "des a", "111", 2.5, 0.5, 1);
//		ObjetPostal objetPostal2 = new ObjetPostal("ori b", "des b", "222", 1.5, 0.3, 2);
//		ObjetPostal objetPostal3 = new ObjetPostal("ori c", "des c", "333", 2.1, 0.2, 0);
		
//		System.out.print(objetPostal1.toString()+"\n");
//		System.out.print(objetPostal2.toString()+"\n");
//		System.out.print(objetPostal3.toString()+"\n");
		
		ObjetPostal lettre1 = new Lettre("origine aaa", "famille Kouk, igloo 2, banquise nord", "444", 2, 1, 1, Priorite.ordinaire);
		Lettre lettre2 = new Lettre("origine bbb", "chaman Sbouk, igloo 8, banquise nord", "555", 3, 4, 2, Priorite.urgente);
		System.out.print(lettre1.toString()+"\n");
		System.out.print(lettre2.toString()+"\n");
		
		Colis colis1 = new Colis("origine ccc", "famille Miko, igloo 2, banquise ouest", "666", 3, 2, 2, "food", 100);
		Colis colis2 = new Colis("origine ddd", "sculpteur Frodok, hanger 200, terres ouest", "777", 4, 3, 0, "paper", 20);
		System.out.print(colis1.toString()+"\n");
		System.out.print(colis2.toString()+"\n");
		
		System.out.print(lettre1.tarifAffranchissement()+"\n");
		System.out.print(lettre2.tarifAffranchissement()+"\n");
		
		System.out.print(colis1.tarifAffranchissement()+"\n");
		System.out.print(colis2.tarifAffranchissement()+"\n");
	}
	
}
