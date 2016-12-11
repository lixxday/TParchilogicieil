package app.main;

import app.base.Graphique;
import app.representation.Dessineur;
import app.representation.IDessineur;
import app.representation.RetourSVG;
import app.test.MaClasse1;
import app.test.MaClasse2;
import app.test.MonInterface1;
import app.visiteur.ClassRepresentation;
import app.visiteur.IVisiteur;
import app.visiteur.InterfaceRepresentation;
import app.visiteur.Visiteur;

public class Main {

	public static void main(String[] args) {

		ClassRepresentation maClasse1 = new ClassRepresentation(MaClasse1.class);
		ClassRepresentation maClasse2 = new ClassRepresentation(MaClasse2.class);
		InterfaceRepresentation monInterface1 = new InterfaceRepresentation(MonInterface1.class);
		IVisiteur visiteur = new Visiteur();
		Graphique graph = new Graphique();
		IDessineur dessineur = new Dessineur(graph);
		RetourSVG retour = new RetourSVG();
		
		graph.addGraphique(visiteur.visit(maClasse1));		
		graph.addGraphique(visiteur.visit(maClasse2));
		graph.addGraphique(visiteur.visit(monInterface1));
		
		dessineur.visit(retour);
	}

}
