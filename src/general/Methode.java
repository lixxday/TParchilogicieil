package general;

import java.util.ArrayList;

public interface Methode {
	/**
	 * 
	 * @return nom de la methode
	 */
	public String getNom();
	/**
	 * 
	 * @return Type des parametres eventuels
	 */
	public ArrayList<String> getTypeParam();
	/**
	 * 
	 * @return Type de retour
	 */
	public String getTypeRetour();
	
}
