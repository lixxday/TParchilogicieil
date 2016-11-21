package dessin;

import general.Attribut;
import general.Description;
import general.Type;
import general.impl.AttributImpl;

public class ClasseDessin implements ElementDeDessin{

	private Type classe;
	
	public ClasseDessin(Type classe) {
		this.classe = classe;
	}
	
	@Override
	public void dessiner() {
		// TODO dessiner en vrai
		
		// Head
		System.out.println("Classe " + classe.getNom());
		
		
		//Description
		System.out.println("---------------------------");
		if (classe.getDescription() != null) {
			System.out.println(classe.getDescription().toString());
			
		}
		
	}

	
}
