package chifoumi;

public class JeuUnTour {
	private Joueur joueur1, joueur2;
	
	public JeuUnTour(String nom1, String nom2) {
		this.joueur1 = new Joueur(nom1);
		this.joueur2 = new Joueur(nom2);
		jouer();
	}
	
	public void jouer() {
		tour();
		joueur1.ecrireScore();
		joueur2.ecrireScore();
		conclure();
	}
	
	public void tour() {
		Choix choix1 = joueur1.choisir();
		Choix choix2 = joueur2.choisir();
		
		if (choix1 != choix2 ) {
			if(choix1 == Choix.CAILLOU) {
				if(choix2 == Choix.CISEAUX) {
					joueur1.crediter();
				}
				else if (choix2 == Choix.PAPIER) {
					joueur2.crediter();
				}
			}
			else if(choix1 == Choix.CISEAUX) {
				if(choix2 == Choix.PAPIER) {
					joueur1.crediter();
				}
				else if (choix2 == Choix.CAILLOU) {
					joueur2.crediter();
				}
			}
			else if(choix1 == Choix.PAPIER) {
				if(choix2 == Choix.CAILLOU) {
					joueur1.crediter();
				}
				else if (choix2 == Choix.CISEAUX) {
					joueur2.crediter();
				}
			}
		}	
	}
	
	public void conclure() {
		if (joueur1.getScore() > joueur2.getScore()) {
			System.out.println("Joueur 1 est le gagnant! BRAVO :D");
		}else if(joueur2.getScore() > joueur1.getScore()) {
			System.out.println("Joueur 2 est le gagnant! BRAVO :D");
		}else {
			System.out.println("Egalite !");
		}
		
	}

}
