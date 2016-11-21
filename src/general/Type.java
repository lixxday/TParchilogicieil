package general;

import java.util.ArrayList;

public interface Type {
	
	public String getNom();
	public String getPosition();
	public String getJavaType();
	
	public Description getDescription();
	public void setDescription(ArrayList<Constructeur> constructeurs, ArrayList<Attribut> attributs,
			ArrayList<Methode> methodes, ArrayList<Relation> relations);
	public void setPosition(String paquet);
	
}
