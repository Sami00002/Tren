
public class CalatoriB extends VagonCalatori {

	public CalatoriB() {
		super();
		this.capacitatePasageri = 50;
		this.capacitateColete = 400;
	}

	public void blocareaGeamuri() {
		System.out.println("Geamurile s-au blocat");
	}

	public String tipVagon() {
		return "Vagon de tip calatoriB";
	}
}
