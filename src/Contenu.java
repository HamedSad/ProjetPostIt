
public class Contenu {
	
	String natureContenu;
	boolean vide;
	
	Pen pencil = new Pen ();

	boolean isVide() {
	return vide;
	}

	public String getNatureContenu() {
		return natureContenu;
	}

	public void setNatureContenu(String natureContenu) {
		this.natureContenu = natureContenu;
	}

	public Pen getPencil() {
		return pencil;
	}

	public void setPencil(Pen pencil) {
		this.pencil = pencil;
	}

	public void setVide(boolean vide) {
		this.vide = vide;
	}
}
