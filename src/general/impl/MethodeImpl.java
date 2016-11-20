package general.impl;

import java.util.ArrayList;

import javax.swing.Icon;

import general.Methode;

public class MethodeImpl implements Methode {
	private String nom;
	private ArrayList<String> listTypeParam;
	private String typeRetour;
	private Icon icone;
	
	public MethodeImpl(String nom, ArrayList<String> listTypeParam, String typeRetour){
		this.nom = nom;
		this.listTypeParam = listTypeParam;
		this.typeRetour = typeRetour;
	}

	@Override
	public String getNom() {
		// TODO Auto-generated method stub
		return this.nom;
	}

	@Override
	public ArrayList<String> getTypeParam() {
		// TODO Auto-generated method stub
		return this.listTypeParam;
	}

	@Override
	public String getTypeRetour() {
		// TODO Auto-generated method stub
		return this.typeRetour;
	}

}
