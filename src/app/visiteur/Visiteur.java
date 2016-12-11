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
			constrs.add(constructeurs[i].getName());
		}
		
		ArrayList<String> meths = new ArrayList<String>();
		for (int i = 0; i < methods.length; i++) {
			meths.add(methods[i].getName());
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
		
		return new Rectangle(nom, contenu, dependances);
		
	}

	@Override
	public void visit(InterfaceRepresentation i) {
		
		Class<?> monInterface = i.getMyInterface();
		
		String nom = monInterface.getName();
	}

}
