package app.base;

import java.util.ArrayList;

public class Rectangle {
	
	private String nom;
	private ArrayList<String> contenu;
	private ArrayList<String> dependances;
	
	public Rectangle(String nom, ArrayList<String> contenu, ArrayList<String> dependances) {
		this.contenu = contenu;
		this.dependances = dependances;
		this.nom = nom;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public ArrayList<String> getContenu() {
		return this.contenu;
	}

	public ArrayList<String> getDependances() {
		return this.dependances;
	}
}
