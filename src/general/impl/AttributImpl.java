package general.impl;

import general.Attribut;

public class AttributImpl implements Attribut {
	private String nom;
	private String type;
	
	public AttributImpl(String nom, String type){
		this.type = type;
		this.nom = nom;
	}

	@Override
	public String getNom() {
		// TODO Auto-generated method stub
		return this.nom;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return this.type;
	}

}
