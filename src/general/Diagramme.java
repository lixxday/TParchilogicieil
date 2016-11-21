package general;

import java.util.ArrayList;

public interface Diagramme {
	
	/**
	 * 
	 * @return liste des Types de l'ensemble du diagramme
	 */
	public ArrayList<Type> getTypes();
	
	/**
	 * 
	 * @return liste des etiquettes
	 */
	public ArrayList<Etiquette> getEtiquettes();
		

}
