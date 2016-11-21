package execution;

import dessin.ClasseDessin;
import dessin.ElementDeDessin;
import dessin.EtiquetteDessin;
import dessin.RelationDessin;
import general.Etiquette;
import general.Relation;
import general.RelationImpl;
import general.Type;
import general.impl.EtiquetteImpl;
import general.impl.JavaClass;
import general.impl.JavaInterface;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Test de creation d'un diagramme");
		System.out.println("---------------------------");
		System.out.println("Creation d'une classe vide");
		System.out.println("---------------------------");
	
		Type classe = new JavaClass();
		Type classeParent = new JavaInterface("ClasseParent");
		ElementDeDessin d = new ClasseDessin(classe);
		Relation relation1 = new RelationImpl(classe, "implements",classeParent);
		
		d.dessiner();
		
		System.out.println("Creation d'une etiquette");
		Etiquette etiquette = new EtiquetteImpl("Coucou");
		ElementDeDessin ett = new EtiquetteDessin(etiquette);
		
		RelationDessin relationDessin = new RelationDessin(relation1);
		relationDessin.dessiner();
		
		ett.dessiner();
		
	}

}
