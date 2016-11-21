package dessin;

import general.Description;
import general.Type;

public class ClasseDessin implements ElementDeDessin{

	private Type classe;
	
	public ClasseDessin(Type classe) {
		this.classe = classe;
	}
	
	@Override
	public void dessiner() {
		// TODO dessiner en vrai
		System.out.println("Classe " + classe.getNom());
		
		Description description = classe.getDescription();
	}

	
}
