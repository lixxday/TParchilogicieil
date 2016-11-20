package general.impl;

import java.util.ArrayList;

import javax.swing.Icon;

import general.Constructeur;

public class ConstructeurImpl implements Constructeur {
	private ArrayList<String> listeTypeParam;
	private Icon icone;
	
	public ConstructeurImpl(ArrayList<String> listeTypeParam){
		this.listeTypeParam = listeTypeParam;
	}

	@Override
	public ArrayList<String> getTypeParam() {
		// TODO Auto-generated method stub
		return this.listeTypeParam;
	}
}
