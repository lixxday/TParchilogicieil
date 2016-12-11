# TParchilogicieil
TP Architecture logiciel en trinome : Florian, Yang et Corentin

	1 - Lancer des tests, creer un diagramme
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

	2 - Ajouter un type (exemple : enum)
On utilise le patron visiteur:

Prenons un exemple : on souhaite ajouter les Enum.

On commence par créer une representation de Enum
Dans app.visiteur, on ajoute une classe EnumRepresentation qui implement IVisitable.

Dans IVisiteur, on ajoute la methode 'Rectangle visit(EnumRepresentation o);
Dans Visiteur, on implemente la methode declaree dans IVisiteur pour qu'elle retourne un Rectangle
   Rectangle(nom de l'enum, contenu=liste des enum, dependances)

	3 - Ajouter une représentation (jpeg)

