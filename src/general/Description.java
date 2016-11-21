package general;

import java.util.ArrayList;

public interface Description {

	/**
	 * 
	 * Represente une description d'un Type (classe, interface ou enum)
	 */
	public ArrayList<Constructeur> getConstructeurs();
	public ArrayList<Attribut> getAttributs();
	public ArrayList<Methode> getMethodes();
	public ArrayList<Relation> getRelations();
	
	/**
	 * 
	 * @param attr attribut a ajouter
	 * @return true si effectue avec succes, false sinon
	 */
	public boolean addAttribut(Attribut attr);
	/**
	 * 
	 * @param constr a ajouter
	 * @return true si effectue avec succes, false sinon
	 */
	public boolean addConstructeur(Constructeur constr);
	/**
	 * 
	 * @param meth
	 * @return true si effectue avec succes, false sinon
	 */
	public boolean addMethode(Methode meth);
	/**
	 * 
	 * @param rel
	 * @return true si effectue avec succes, false sinon
	 */
	public boolean addRelation(Relation rel);
	
	
	/**
	 * 
	 * cf add
	 */
	public boolean removeAttribut(Attribut attr);
	public boolean removeConstructeur(Constructeur constr);
	public boolean removeMethode(Methode meth);
	public boolean removeRelation(Relation rel);
	
	
	public String toString();
	
}