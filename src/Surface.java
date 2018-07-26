
public class Surface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PostIt papier = new PostIt();
		PostIt papier2 = new PostIt();
		
		
		papier.couleur = "vert ";
		papier.collant = false;
		papier.forme = "coeur ";
		papier.tailleCm = 10 ;
		papier.cont.natureContenu = "dessin";
		papier.setCouleur("orange ");
		
		System.out.println("Un PostIt " + papier.couleur + "en forme de "+ papier.forme + "de " + papier.tailleCm + "cm pour du " + papier.cont.natureContenu);
		System.out.println(papier.couleur);
		
		papier2.setCouleur("vert ");
		papier2.cont.pencil.setGenrePen("stylographe ");
		papier2.setForme("triangle ");
		papier2.setTailleCm(25);
		papier2.cont.setNatureContenu("notes personnelles ");
		
		
		
		System.out.println("Un PostIt " + papier2.getCouleur() + "en forme de " + papier2.getForme() + "de " + papier2.getTailleCm() 
		+ "cm pour du " + papier.cont.getNatureContenu() + " avec un " + papier2.cont.pencil.getGenrePen());
	}

}
