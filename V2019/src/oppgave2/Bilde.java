package oppgave2;

public class Bilde extends Innlegg {
	private String url;

	public Bilde(String bruker, String dato,String URL) {
		super(bruker, dato);
		this.url=URL;
	}
	
	@Override
	public void SkriveUt() {
		super.SkriveUt();
		System.out.println(url);
	}

}
