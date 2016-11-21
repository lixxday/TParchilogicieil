package execution;

import java.util.ArrayList;

import dessin.ClasseDessin;
import dessin.ElementDeDessin;
import dessin.EnumDessin;
import dessin.EtiquetteDessin;
import dessin.InterfaceDessin;
import dessin.RelationDessin;
import general.Attribut;
import general.Etiquette;
import general.Relation;
import general.RelationImpl;
import general.Type;
import general.impl.AttributImpl;
import general.impl.EtiquetteImpl;
import general.impl.JavaClass;
import general.impl.JavaEnum;
import general.impl.JavaInterface;

public class Main {

	public static void main(String[] args) {
		

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
		
		
		System.out.println("");
		System.out.println("Creation d'une etiquette...");
		Etiquette etiquette = new EtiquetteImpl("Coucou");
		ElementDeDessin ett = new EtiquetteDessin(etiquette);
		
		Relation relation1 = new RelationImpl(classe, null, classe);
		RelationDessin relationDessin = new RelationDessin(relation1);
		relationDessin.dessiner();
		
		ett.dessiner();
		
		System.out.println("Creation d'une interface");
	
		Type interfac = new JavaInterface();
		ElementDeDessin di = new InterfaceDessin(interfac);
		
		di.dessiner();
		
		System.out.println("Creation d'un enum");
		
		Type enu = new JavaEnum();
		ElementDeDessin de = new EnumDessin(enu);
		
		de.dessiner();
	}

}
