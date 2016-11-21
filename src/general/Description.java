package general;

import java.util.ArrayList;

public interface Description {

	public ArrayList<Constructeur> getConstructeurs();
	public ArrayList<Attribut> getAttributs();
	public ArrayList<Methode> getMethodes();
	public ArrayList<Relation> getRelations();
	
	public boolean addAttribut(Attribut attr);
	public boolean addConstructeur(Constructeur constr);
	public boolean addMethode(Methode meth);
	public boolean addRelation(Relation rel);
	
	public boolean removeAttribut(Attribut attr);
	public boolean removeConstructeur(Constructeur constr);
	public boolean removeMethode(Methode meth);
	public boolean removeRelation(Relation rel);
	
	
	public String toString();
	
}