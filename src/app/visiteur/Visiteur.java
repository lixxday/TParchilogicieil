package app.visiteur;

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

		Class<?> classe = c.getMyClass();

		String nom = classe.getName();
		return null;

		// return new Rectangle(nom, contenu, dependances);

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
