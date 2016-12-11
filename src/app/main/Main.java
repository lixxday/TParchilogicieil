package app.main;

import app.base.Graphique;
import app.representation.Dessineur;
import app.representation.RetourConsole;
import app.representation.RetourSVG;
import app.test.maClasse1;
import app.test.maClasse2;
import app.test.monInterface1;
import app.visiteur.ClassRepresentation;
import app.visiteur.IVisiteur;
import app.visiteur.InterfaceRepresentation;
import app.visiteur.Visiteur;

public class Main {

	public static void main(String[] args) {

		ClassRepresentation maClasse1 = new ClassRepresentation(maClasse1.class);
		ClassRepresentation maClasse2 = new ClassRepresentation(maClasse2.class);
		InterfaceRepresentation monInterface1 = new InterfaceRepresentation(monInterface1.class);
		
		IVisiteur visiteur = new Visiteur();
		
		Graphique graph = new Graphique();
		graph.addGraphique(visiteur.visit(maClasse1));
		graph.addGraphique(visiteur.visit(monInterface1));
		graph.addGraphique(visiteur.visit(maClasse2));
		
		Dessineur dessineur = new Dessineur(graph);
		RetourSVG retour = new RetourSVG();
		
		dessineur.visit(retour);
	}

}
