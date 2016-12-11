package app.visiteur;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;

import app.base.Rectangle;

public class Visiteur implements IVisiteur {

	@Override
	public void visit(IVisitable o) {
		System.out.println("Ceci n'est pas implemente");
	}

	@Override
	public Rectangle visit(ClassRepresentation c) {

		
		// Get the class
		Class<?> classe = c.getMyClass();
		
		// Get the specifications
		String nom = classe.getName();
		Constructor<?>[] constructeurs = classe.getConstructors();
		Method[] methods = classe.getMethods();
		
		Type[] interfaces = classe.getGenericInterfaces();
		Type superclasse = classe.getGenericSuperclass();
		
		// Remplir le contenu
		ArrayList<String> contenu = new ArrayList<String>();
		
		ArrayList<String> constrs = new ArrayList<String>();
		for (int i = 0; i < constructeurs.length; i++) {
			constrs.add("Constructeur : " + constructeurs[i].getName());
		}
		
		ArrayList<String> meths = new ArrayList<String>();
		for (int i = 0; i < methods.length; i++) {
			meths.add("Methode : " + methods[i].getName());
		}
		contenu.addAll(constrs);
		contenu.addAll(meths);
		
		// Recuperer les dependances
		ArrayList<String> dependances = new ArrayList<String>();
		
		ArrayList<String> mesInterfaces = new ArrayList<String>();
		for (int i = 0; i < interfaces.length; i++) {
			mesInterfaces.add(interfaces[i].getTypeName());
		}
		dependances.addAll(mesInterfaces);
		dependances.add(superclasse.getTypeName());
		
		return new Rectangle("Classe " + nom, contenu, dependances);
		
	}

	@Override
	public Rectangle visit(InterfaceRepresentation i) {

		Class<?> monInterface = i.getMyInterface();

		//Recuperer le nom de l'interface
		String nomI = monInterface.getName();

		//Recuperer la liste de methodes dans l'interface
		ArrayList<String> methodesI = new ArrayList<String>();
		Method[] listMethodesI = monInterface.getMethods();		
		for (int j = 0; j < listMethodesI.length; j++) {
			methodesI.add(listMethodesI[j].getName());
		}

		//Recuperer la liste des interfaces qu'implemente l'interface
		ArrayList<String> relationsSupI = new ArrayList<String>();
		Type[] listRelationsSupI = monInterface.getGenericInterfaces();
		for (int j = 0; j < listRelationsSupI.length; j++) {
			relationsSupI.add(listRelationsSupI[j].getTypeName());
		}

		//Retourner un Rectangle avec toutes les infos sur l'interface
		return new Rectangle(nomI, methodesI, relationsSupI);
		
	}

}
