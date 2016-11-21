package general.impl;

import general.Description;
import general.Type;

public class JavaClass implements Type {
	
	private String nom;
	private String nomPackage;
	private Description description;

	//TODO ajouter une description
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
	public String getPackage() {
		return nomPackage;
	}

	@Override
	public void setPackage(String paquet) {
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
	

}
