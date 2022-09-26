
public class TestStagiaire {

	public static void main(String[] args) {
		Stagiaire st1 = new Stagiaire("Karami", "Loubna", "TDI");
		Stagiaire st2 = new Stagiaire("Karami", "Loubna", "TDI");
		Stagiaire st3 = new Stagiaire("Karami", "Loubna", "TDI", 12, 13, 15);
		Stagiaire st6 = new Stagiaire("Karami", "Loubna", "TDI", 12, 13, 15);
		Stagiaire st4 = new Stagiaire();
		
	
		
		System.out.println(st1.affiche());
		System.out.println(st2.affiche());
		System.out.println(st3.affiche());
		System.out.println(st4.affiche());
		System.out.println(st3.CALCUL(20, 10, 14));
	}

}
