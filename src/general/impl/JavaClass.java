package general.impl;

import java.util.ArrayList;

import general.Attribut;
import general.Constructeur;
import general.Description;
import general.Methode;
import general.Relation;
import general.Type;

public class JavaClass implements Type {

	private String nom;
	private String nomPackage;
	private Description description;

	// TODO ajouter une description
	public JavaClass() {
		this.nom = "Classe";
		this.nomPackage = "defaultPackage";
	}

	public JavaClass(String nom, String paquet) {
		this.nom = nom;
		this.nomPackage = paquet;
	}

	@Override
	public String getNom() {
		return this.nom;
	}

	@Override
	public String getPosition() {
		return nomPackage;
	}

	@Override
	public void setPosition(String paquet) {
		// TODO Auto-generated method stub
		this.nomPackage = paquet;
	}

	@Override
	public String getJavaType() {
		return "Class";
	}

	@Override
	public Description getDescription() {
		return this.description;
	}

	@Override
	public void setDescription(ArrayList<Constructeur> constructeurs, ArrayList<Attribut> attributs,
			ArrayList<Methode> methodes, ArrayList<Relation> relations) {
		Description des = new DescriptionImpl(constructeurs, attributs, methodes, relations);

		this.description = des;
	}

}
