package app.main;

import app.base.Graphique;
import app.representation.Dessineur;
import app.representation.RetourConsole;
import app.test.maClasse1;
import app.test.maClasse2;
import app.test.monInterface1;
import app.visiteur.ClassRepresentation;
import app.visiteur.IVisiteur;
import app.visiteur.InterfaceRepresentation;
import app.visiteur.Visiteur;

public class Main {

	public static void main(String[] args) {
		IVisiteur visiteur = new Visiteur();
		Graphique graph = new Graphique();
		Dessineur dessineur = new Dessineur(graph);
		RetourConsole retour = new RetourConsole();
		
		
		ClassRepresentation maClasse1 = new ClassRepresentation(maClasse1.class);
		graph.addGraphique(visiteur.visit(maClasse1));
		
		ClassRepresentation maClasse2 = new ClassRepresentation(maClasse2.class);
		graph.addGraphique(visiteur.visit(maClasse2));
		
		InterfaceRepresentation monInterface1 = new InterfaceRepresentation(monInterface1.class);
		graph.addGraphique(visiteur.visit(monInterface1));
		
		
		dessineur.visit(retour);
	}

}
