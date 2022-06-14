package application.modele;

import application.modele.objet.Inventaire;
import application.modele.objet.Objet;

public class Joueur extends Personnage {

	private static Environnement env;
	private Inventaire inventaire;
	private Objet enMain;

	public Joueur() {
		super(env, 12);
		this.setX(100);
		this.setY(310);
		this.inventaire = new Inventaire();
		this.enMain = null;
	}

	@Override
	public void attaque(Personnage perso) {
		perso.perdreVie(4);
	}

	public void prendreEnMain(Objet objet){
		this.enMain = objet;
	}

	public Inventaire getInventaire(){
		return inventaire;
	}

	public Object getEnMain(){
		return enMain;
	}

	public void setEnMain(Objet objet){
		enMain = objet;
	}
}
