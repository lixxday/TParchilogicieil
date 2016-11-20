package general.impl;

import general.Etiquette;

public class EtiquetteImpl implements Etiquette {
	
	String contenu;
	
	public EtiquetteImpl(String contenu) {
		this.contenu = contenu;
	}

	@Override
	public String getContenu() {
		return this.contenu;
	}

	public void setContenu(String contenu) {
		this.contenu = contenu;
		
	}

}
