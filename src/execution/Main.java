package execution;

import dessin.ClasseDessin;
import dessin.ElementDeDessin;
import general.Type;
import general.impl.JavaClass;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Test de creation d'un diagramme");
		System.out.println("Creation d'une classe vide");
	
		Type classe = new JavaClass();
		ElementDeDessin d = new ClasseDessin(classe);
		
		d.dessiner();
		
	}
	
}
