package oppgave2;

public class Tekst extends Innlegg{
	private String tekst;

	public Tekst(String bruker, String dato,String tekst) {
		super(bruker, dato);
		this.tekst=tekst;
	}
	
	@Override
	public void SkriveUt() {
		super.SkriveUt();
		System.out.println(tekst);
	}


}
