package dessin;

import general.Etiquette;
import general.impl.EtiquetteImpl;

public class EtiquetteEntreprise implements ElementDeDessin {

	@Override
	public void dessiner() {
		// TODO Dessiner en vrai
		Etiquette ett = new EtiquetteImpl("Commentaire");
		
		System.out.println(ett.getContenu());
	}

}
