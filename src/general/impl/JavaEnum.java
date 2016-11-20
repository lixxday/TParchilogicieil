package general.impl;

import general.Description;
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
	public String getPosition() {
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
	public void setPosition(String paquet) {
		this.nomPackage = paquet;
	}

}
