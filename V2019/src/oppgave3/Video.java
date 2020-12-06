package oppgave3;

public class Video {
	private String tittel;
	private String produsent;
	private int sekund;

	public Video(String t, String p, int s) {
		tittel = t;
		produsent = p;
		sekund = s;
	}

	public String getTittel() {
		return tittel;
	}

	public String getProdusent() {
		return produsent;
	}

	public int getSekund() {
		return sekund;
	}

	public void setTittel(String t) {
		tittel = t;
	}

	public void setProdusent(String p) {
		produsent = p;
	}

	public void setSekund(int s) {

		sekund = s;
	}

	public String toString() {
		int min = sekund / 60;
		int sek = sekund % 60;
		return String.format("Tittel: %s, Produsent: %s, Tid: %d.%02d", tittel, produsent, min, sek);
	}
}
