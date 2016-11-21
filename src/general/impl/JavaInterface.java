package general.impl;

import java.util.ArrayList;

<<<<<<< HEAD
=======
import general.Description;
>>>>>>> master
import general.Attribut;
import general.Constructeur;
import general.Methode;
import general.Relation;
import general.Type;

public class JavaInterface implements Type {

	private String nom;
	private String nomPackage;
	private Description description;

	public JavaInterface(String nom) {
		this.nom = nom;
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
<<<<<<< HEAD

	public void setDescription(ArrayList<Constructeur> constructeurs, ArrayList<Attribut> attributs,
=======
	
		public void setDescription(ArrayList<Constructeur> constructeurs, ArrayList<Attribut> attributs,
>>>>>>> master
			ArrayList<Methode> methodes, ArrayList<Relation> relations) {
		Description des = new DescriptionImpl(constructeurs, attributs, methodes, relations);
		
		this.description = des;
<<<<<<< HEAD
	}

	@Override
	public void setPosition(String paquet) {
		// TODO Auto-generated method stub
		
=======
>>>>>>> master
	}

		@Override
		public void setPosition(String paquet) {
			// TODO Auto-generated method stub
			
		}

}
