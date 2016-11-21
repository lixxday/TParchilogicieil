package general.impl;

import java.util.ArrayList;

import general.Attribut;
import general.Constructeur;
import general.Description;
import general.Methode;
import general.Relation;

public class DescriptionImpl implements Description {
	
	public ArrayList<Constructeur> constructeurs;
	public ArrayList<Attribut> attributs;
	public ArrayList<Methode> methodes;
	public ArrayList<Relation> relations;
	
	public DescriptionImpl() {
		this.constructeurs = new ArrayList<Constructeur>();
		this.attributs = new ArrayList<Attribut>();
		this.methodes = new ArrayList<Methode>();
		this.relations = new ArrayList<Relation>();
	}

	@Override
	public ArrayList<Constructeur> getConstructeurs() {
		return this.constructeurs;
	}

	@Override
	public ArrayList<Attribut> getAttributs() {
		return this.attributs;
	}

	@Override
	public ArrayList<Methode> getMethodes() {
		return this.methodes;
	}

	@Override
	public ArrayList<Relation> getRelations() {
		return this.relations;
	}
	
	
	public String toString() {
		String Newligne = System.getProperty("line.separator");
		
		String str = "";
		str += "Attributs : " + this.attributs.toString();
		str += Newligne;
		str += "Constructeurs : " + this.constructeurs.toString();
		str += Newligne;
		str += "Methodes : " + this.methodes.toString();
		
		return str;
	}

}
