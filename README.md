# TParchilogicieil
TP Architecture logiciel en trinome : Florian, Yang et Corentin

	- Lancer des tests, creer un diagramme
Pour créer un diagramme à partir d'un projet existant  :

- Créer un visiteur
- Créer un graphique vide
- Pour chaque classe/interface, référencer l'interface et l'ajouter au graphique
- Créer un dessineur du graphique
- choisir le type de retour et l'instancier (ex: retour SVG)
- appeler la méthode visit sur le dessineur

Exemple : 

public static void Main(String[] args) {
	
   IVisiteur visiteur = new Visiteur();
   Graphique graph = new Graphique();
   
   // Reference des classes/interfaces :
   ClassRepresentation maClasse1 = new ClassRepresentation(maClasse1.class);
   graph.addGraphique(visiteur.visit(maClasse1));
   
   InterfaceRepresentation monInterface1 = new InterfaceRepresentation(monInterface1.class);
   graph.addGraphique(visiteur.visit(monInterface1));
   // Fin de référenciation
   
   Dessineur dessineur = new Dessineur(graph);
   RetourConsole retour = new RetourConsole();
   
   dessineur.visit(retour);
	
}

	

