package general.impl;

import java.util.ArrayList;

import general.Description;
import general.Attribut;
import general.Constructeur;
import general.Methode;
import general.Relation;
import general.Type;

public class JavaEnum implements Type {

	private String nom;
	private String nomPackage;
	private Description description;

	@Override
	public String getNom() {
		return this.nom;
	}

	@Override
	public String getPackage() {
		return this.nomPackage;
	}

	@Override
	public String getJavaType() {
		return "Enum";
	}

	@Override
	public Description getDescription() {
		return this.description;
	}

	@Override
	public void setPackage(String paquet) {
		this.nomPackage = paquet;
	}

	@Override
	public ArrayList<Relation> getRelations() {
		// TODO Auto-generated method stub
		return this.description.getRelations();
	}
	
	public void setDescription(ArrayList<Constructeur> constructeurs, ArrayList<Attribut> attributs,
			ArrayList<Methode> methodes, ArrayList<Relation> relations) {
		Description des = new DescriptionImpl(constructeurs, attributs, methodes, relations);

		this.description = des;
	}

	@Override
	public void setPosition(String paquet) {
		// TODO Auto-generated method stub
		
	}

}
