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
	
	public JavaEnum(){
		ArrayList<Attribut> attributs = new ArrayList<Attribut>();
		attributs.add(new AttributImpl("att1","String"));
		attributs.add(new AttributImpl("att2","int"));
		this.nom = "EnumTest";
		this.nomPackage = "PackageTest";
		this.description = new DescriptionImpl(new ArrayList<Constructeur>(), attributs, new ArrayList<Methode>() , new ArrayList<Relation>());
	}
	
	public JavaEnum(String nom, String nomPackage, Description description){
		this.nom = nom;
		this.nomPackage = nomPackage;
		this.description = description;
	}
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

}
