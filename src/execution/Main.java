package execution;

import java.util.ArrayList;

import dessin.ClasseDessin;
import dessin.ElementDeDessin;
import dessin.EtiquetteDessin;
<<<<<<< HEAD
import dessin.RelationDessin;
=======
import general.Attribut;
>>>>>>> master
import general.Etiquette;
import general.Relation;
import general.RelationImpl;
import general.Type;
import general.impl.AttributImpl;
import general.impl.EtiquetteImpl;
import general.impl.JavaClass;
import general.impl.JavaInterface;

public class Main {

	public static void main(String[] args) {
		
<<<<<<< HEAD
		System.out.println("Test de creation d'un diagramme");
		System.out.println("---------------------------");
		System.out.println("Creation d'une classe vide");
		System.out.println("---------------------------");
	
		Type classe = new JavaClass();
		Type classeParent = new JavaInterface("ClasseParent");
		ElementDeDessin d = new ClasseDessin(classe);
		Relation relation1 = new RelationImpl(classe, "implements",classeParent);
=======
		System.out.println("Test de creation d'un diagramme : ");
		System.out.println("Creation d'une classe vide...");
	
		Type classe = new JavaClass();
		ElementDeDessin c = new ClasseDessin(classe);
		
		c.dessiner();
		
		System.out.println("");
		System.out.println("Creation d'une classe avec un attribut");
		
		Attribut attr = new AttributImpl("attribut", "Integer");
		ArrayList<Attribut> l = new ArrayList<Attribut>();
		l.add(attr);
		classe.setDescription(null, l, null, null);
		
		ElementDeDessin classe2 = new ClasseDessin(classe);
		classe2.dessiner();
>>>>>>> master
		
		
		System.out.println("");
		System.out.println("Creation d'une etiquette...");
		Etiquette etiquette = new EtiquetteImpl("Coucou");
		ElementDeDessin ett = new EtiquetteDessin(etiquette);
		
		RelationDessin relationDessin = new RelationDessin(relation1);
		relationDessin.dessiner();
		
		ett.dessiner();
		
	}

}
