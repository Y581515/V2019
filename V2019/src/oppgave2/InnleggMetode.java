package oppgave2;

import java.util.Scanner;

public class InnleggMetode {

	public static void main(String[] args) {
		Innlegg innlegg = null;
		Scanner tast = new Scanner(System.in);
		System.out.println("Enlkel forklaring");
		System.out.println("Bruker? ");
		String bruker = tast.nextLine();
		System.out.println("Dato? ");
		String dato = tast.nextLine();
		System.out.println("1: Bilde \n2:Tekst \nValg? ");
		int valg = tast.nextInt();
		
		switch (valg) {
		case 1: {
			System.out.print("Url? ");
			String url = tast.nextLine();
			innlegg = new Bilde(bruker, dato, url);
			break;
		}
		case 2: {
			System.out.print("tekst? ");
			String tekst = tast.nextLine();
			innlegg = new Tekst(bruker, dato, tekst);
			break;
		}
		default: {
			System.out.println("Feilmelding");
			break;
		}
		}
		if(innlegg != null) {
			innlegg.SkriveUt();
		}
		

	}

}
