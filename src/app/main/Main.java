package app.main;

import app.visiteur.ClassRepresentation;
import app.visiteur.IVisiteur;
import app.visiteur.InterfaceRepresentation;
import app.visiteur.Visiteur;

public class Main {

	public static void main(String[] args) {

		ClassRepresentation maClasse = new ClassRepresentation(InterfaceRepresentation.class);
		IVisiteur visiteur = new Visiteur();
		
		maClasse.accept(visiteur);
		System.out.println(visiteur.visit(maClasse).toString());
	}

}
