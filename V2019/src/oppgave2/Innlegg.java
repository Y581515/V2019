package oppgave2;

public class Innlegg {
		private String bruker;
		private String dato;
		private int likes;
		
		public Innlegg(String bruker,String dato) {
			this.bruker=bruker;
			this.dato=dato;
			this.likes=0;
		}
		
		public String getBruker() {
			return bruker;
		}
		public void setBruker(String bruker) {
			this.bruker = bruker;
		}
		public String getDato() {
			return dato;
		}
		public void setDato(String dato) {
			this.dato = dato;
		}
		
		public void SkriveUt() {
			System.out.print(bruker+ "\n"+dato+"\nAntall likes: "+likes+"\n");
		}
		

}
