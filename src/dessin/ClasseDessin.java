package dessin;

import general.Type;

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
