package general;

import java.util.ArrayList;

public interface Description {

	public ArrayList<Constructeur> getConstructeurs();
	public ArrayList<Attribut> getAttributs();
	public ArrayList<Methode> getMethodes();
	public ArrayList<Relation> getRelations();
	
}