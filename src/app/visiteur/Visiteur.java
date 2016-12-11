package app.visiteur;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;

import app.base.Rectangle;

public class Visiteur implements IVisiteur {
	// Methode Visit par defaut
	@Override
	public void visit(IVisitable o) {
		System.out.println("Ceci n'est pas implemente");
	}

	// Methode Visit pour des classes
	@Override
	public Rectangle visit(ClassRepresentation c) {

		// Get the class
		Class<?> classe = c.getMyClass();

		// Get the specifications
		String nom = "Classe " + classe.getSimpleName();
		Constructor<?>[] constructeurs = classe.getDeclaredConstructors();
		Method[] methods = classe.getDeclaredMethods();
		Type[] interfaces = classe.getGenericInterfaces();
		Type superclasse = classe.getGenericSuperclass();

		// Remplir le contenu
		ArrayList<String> contenu = new ArrayList<String>();

		ArrayList<String> constrs = new ArrayList<String>();
		for (int i = 0; i < constructeurs.length; i++) {
			String paramTypes = "";
			if (constructeurs[i].getParameterCount() > 0) {
				Class<?>[] typesParam = constructeurs[i].getParameterTypes();
				for (int j = 0; j < typesParam.length; j++)
					if (j == typesParam.length-1){
						paramTypes += typesParam[j].getSimpleName() + "";						
					}else {
						paramTypes += typesParam[j].getSimpleName() + ", ";
					}				}
			constrs.add("Constructeur No." + (i + 1) + " : " + nom + "("
					+ paramTypes + ")");
		}

		ArrayList<String> meths = new ArrayList<String>();
		for (int i = 0; i < methods.length; i++) {
			String paramTypes = "";
			if (methods[i].getParameterCount() > 0) {
				Class<?>[] typesParam = methods[i].getParameterTypes();
				for (int j = 0; j < typesParam.length; j++) {
					if (j == typesParam.length-1){
						paramTypes += typesParam[j].getSimpleName() + "";						
					}else {
						paramTypes += typesParam[j].getSimpleName() + ", ";
					}				}
			}
			meths.add("Methode : " + methods[i].getName() + "(" + paramTypes + ")");
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

	// Methode Visit pour des interfaces
	@Override
	public Rectangle visit(InterfaceRepresentation i) {

		Class<?> monInterface = i.getMyInterface();

		// Recuperer le nom de l'interface
		String nomI = "Interface " +  monInterface.getName();

		// Recuperer la liste de methodes dans l'interface
		ArrayList<String> methodesI = new ArrayList<String>();
		Method[] listMethodesI = monInterface.getMethods();
		for (int j = 0; j < listMethodesI.length; j++) {
			String paramTypes = "";
			if (listMethodesI[j].getParameterCount() > 0) {
				Class<?>[] typesParam = listMethodesI[j].getParameterTypes();
				for (int n = 0; n < typesParam.length; n++) {
					if (n == typesParam.length-1){
						paramTypes += typesParam[n].getSimpleName() + "";						
					}else {
						paramTypes += typesParam[n].getSimpleName() + ", ";
					}
				}
			}
			methodesI.add("Methode : " + listMethodesI[j].getName() + "(" + paramTypes + ")");
		}

		// Recuperer la liste des interfaces qu'implemente l'interface
		ArrayList<String> relationsSupI = new ArrayList<String>();
		Type[] listRelationsSupI = monInterface.getGenericInterfaces();
		for (int j = 0; j < listRelationsSupI.length; j++) {
			relationsSupI.add(listRelationsSupI[j].getTypeName());
		}


		//Retourner un Rectangle avec toutes les infos sur l'interface
		return new Rectangle(nomI, methodesI, relationsSupI);
			}

}
