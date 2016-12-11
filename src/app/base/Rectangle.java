package app.base;

import java.util.ArrayList;

public class Rectangle {
	
	private String nom;
	private String type;
	private ArrayList<String> contenu;
	private ArrayList<String> dependances;
	
	public Rectangle(String nom, String type, ArrayList<String> contenu, ArrayList<String> dependances) {
		this.contenu = contenu;
		this.dependances = dependances;
		this.nom = nom;
		this.type = type;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public String getType() {
		return this.type;
	}
	
	public ArrayList<String> getContenu() {
		return this.contenu;
	}

	public ArrayList<String> getDependances() {
		return this.dependances;
	}
	
	public String toString() {
		
		return "Rectangle : \n" + 
				"\n nom : " + this.nom + 
				"\n type : " + this.type + 
				"\n contenu : " + this.contenu + 
				"\n dependances : " + this.dependances;
	}
}
