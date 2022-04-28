
public class ClientTren {

	public static void main(String[] args) {

		Vagon v1 = new CalatoriA();
		Vagon v2 = new CalatoriB();
		Vagon v3 = new Marfa();
		Vagon v4 = new Marfa();

		Vagon[] vagoane = { v1, v2, v3 };

		Tren t1 = new Tren(vagoane);

		Tren t2 = new Tren(new Vagon[] { v1, v2, v3 });

		t1.afisareTipVagoane();

		System.out.println(v1.getCapacitateColete() + " " + ((CalatoriA) v1).getCapacitatePasageri());

		if (t1.equals(t2)) {
			System.out.println("Egale");
		} else {
			System.out.println("Nu sunt egale");
		}

	}

}
