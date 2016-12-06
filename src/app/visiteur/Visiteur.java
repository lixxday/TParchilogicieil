package app.visiteur;

public class Visiteur implements IVisiteur {

	@Override
	public void visit(IVisitable o) {
		System.out.println("Ceci n'est pas implémenté");
	}

	@Override
	public void visit(ClassRepresentation c) {
		
		Class<?> classe = c.getMyClass();
		
		String nom = classe.getName();
		
		//return new Rectangle(nom, contenu, dependances);
		
	}

}
