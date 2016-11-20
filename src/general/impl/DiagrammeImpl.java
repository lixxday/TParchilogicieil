package general.impl;

import java.util.ArrayList;
import general.Diagramme;
import general.Etiquette;
import general.Type;

public class DiagrammeImpl implements Diagramme {
	
	ArrayList<Type> types;
	ArrayList<Etiquette> etiquettes;
	
	public DiagrammeImpl(){
		this.types = new ArrayList<Type>();
		this.etiquettes = new ArrayList<Etiquette>();
	}

	public DiagrammeImpl(ArrayList<Type> types, ArrayList<Etiquette> etiquettes){
		this.types = types;
		this.etiquettes = etiquettes;
	}
	@Override
	public ArrayList<Type> getTypes() {
		return this.types;
	}

	@Override
	public ArrayList<Etiquette> getEtiquettes() {
		return this.etiquettes;
	
	}

	

}
