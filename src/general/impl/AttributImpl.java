package general.impl;

import javax.swing.Icon;

import general.Attribut;

public class AttributImpl implements Attribut {
	private String nom;
	private String type;
	private Icon icone;
	
	public AttributImpl(String nom, String type){
		this.type = type;
		this.nom = nom;
	}

	@Override
	public String getNom() {
		return this.nom;
	}

	@Override
	public String getType() {
		return this.type;
	}
	
	public String toString() {
		String str = this.nom + " : " + this.type;
		return str;
	}

}
