
public class PostIt {
	
	String couleur;
	String forme;
	int tailleCm;
	boolean collant;
	
	Contenu cont = new Contenu();
	
	boolean isCollant (){
	return collant;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public String getForme() {
		return forme;
	}

	public void setForme(String forme) {
		this.forme = forme;
	}

	public int getTailleCm() {
		return tailleCm;
	}

	public void setTailleCm(int tailleCm) {
		this.tailleCm = tailleCm;
	}

	public Contenu getCont() {
		return cont;
	}

	public void setCont(Contenu cont) {
		this.cont = cont;
	}

	public void setCollant(boolean collant) {
		this.collant = collant;
	}

}
