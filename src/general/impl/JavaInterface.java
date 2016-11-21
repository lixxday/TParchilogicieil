package general.impl;

import java.util.ArrayList;

import general.Description;
import general.Attribut;
import general.Constructeur;
import general.Methode;
import general.Relation;
import general.Type;

public class JavaInterface implements Type {

	private String nom;
	private String nomPackage;
	private Description description;
	
	public JavaInterface(){
		ArrayList<Methode> methodes = new ArrayList<Methode>();
		ArrayList<String> listTypeParam = new ArrayList<String>();
		listTypeParam.add("int");
		listTypeParam.add("String");
		methodes.add(new MethodeImpl("methodeTest",listTypeParam,"void"));
		this.nom = "InterfaceVide";
		this.nomPackage = "PackageTest";
		this.description = new DescriptionImpl(new ArrayList<Constructeur>(), new ArrayList<Attribut>(),methodes , new ArrayList<Relation>());
	}
	
	public JavaInterface(String nom, String nomPackage, Description description){
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
		return "Interface";
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
