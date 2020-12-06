package oppgave3;

public class Videoarkiv {
	private Video[] vTab;
	private int antal;

	public Videoarkiv(int maksAntal) {
		this.vTab = new Video[maksAntal];
		this.antal = 0;
	}

	public void leggTil(Video v) {
		if (antal == vTab.length) {
			System.out.println("Tabelen er full");
		} else {
			vTab[antal] = v;
			antal++;
		}

	}

	public int finnTotalTid() {
		int totalTid = 0;
		for (int i = 0; i < antal; i++) {
			totalTid += vTab[i].getSekund();
		}

		return totalTid;

	}

}
