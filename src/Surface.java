
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
		
		papier2.cont.pencil.genrePen = "stylographe ";
		papier2.cont.pencil.setGenrePen("crayon ");
		
		
		
		System.out.println("Un PostIt " + papier.couleur + "en forme de "+
		papier.forme + "de " + papier.tailleCm + "cm " + "pour du " + 
		papier.cont.natureContenu);
		
		System.out.println(papier.couleur);
		System.out.println(papier2.cont.pencil.genrePen);
	}

}
