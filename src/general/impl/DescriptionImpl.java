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

	public DescriptionImpl(ArrayList<Constructeur> constructeurs, ArrayList<Attribut> attributs,
			ArrayList<Methode> methodes, ArrayList<Relation> relations) {

		this.constructeurs = constructeurs;
		this.attributs = attributs;
		this.methodes = methodes;
		this.relations = relations;
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
		str += "Attributs : " + this.attributs;
		str += Newligne;
		str += "Constructeurs : " + this.constructeurs;
		str += Newligne;
		str += "Methodes : " + this.methodes;

		return str;
	}

	@Override
	public boolean addAttribut(Attribut attr) {
		return this.attributs.add(attr);
	}

	@Override
	public boolean addConstructeur(Constructeur constr) {
		return this.constructeurs.add(constr);
	}

	@Override
	public boolean addMethode(Methode meth) {
		return this.methodes.add(meth);
	}

	@Override
	public boolean addRelation(Relation rel) {
		return this.relations.add(rel);
	}

	@Override
	public boolean removeAttribut(Attribut attr) {
		return this.attributs.remove(attr);
	}

	@Override
	public boolean removeConstructeur(Constructeur constr) {
		return this.constructeurs.remove(constr);
	}

	@Override
	public boolean removeMethode(Methode meth) {
		return this.methodes.remove(meth);
	}

	@Override
	public boolean removeRelation(Relation rel) {
		return this.relations.remove(rel);
	}

}
