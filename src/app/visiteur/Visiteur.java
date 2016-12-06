package app.visiteur;

import app.base.Rectangle;

public class Visiteur implements IVisiteur {

	@Override
	public void visit(IVisitable o) {
		System.out.println("Ceci n'est pas implemente");
	}

	@Override
	public void visit(ClassRepresentation c) {
		
		Class<?> classe = c.getMyClass();
		
		String nom = classe.getName();
		
		//return new Rectangle(nom, contenu, dependances);
		
	}

	@Override
	public void visit(InterfaceRepresentation i) {
		
		Class<?> monInterface = i.getMyInterface();
		
		String nom = monInterface.getName();
	}

}