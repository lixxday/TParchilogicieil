package general;

import java.util.ArrayList;

public interface Type {
	
	public String getNom();
	public String getPackage();
	/**
	 * 
	 * @return le type java (Class, Interface ou Enum)
	 */
	public String getJavaType();
	/**
	 * 
	 * @return la description du type
	 */
	public Description getDescription();
	/**
	 * 
	 * @param paquet ou est deplace le Type
	 */
	public void setPosition(String paquet);

	public ArrayList<Relation> getRelations();
	public void setDescription(ArrayList<Constructeur> constructeurs, ArrayList<Attribut> attributs,
			ArrayList<Methode> methodes, ArrayList<Relation> relations);
	public void setPackage(String paquet);
	
}
