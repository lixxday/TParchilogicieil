package general.impl;

import java.util.ArrayList;

import general.Constructeur;

public class ConstructeurImpl implements Constructeur {
	private ArrayList<String> listeTypeParam;
	
	public ConstructeurImpl(ArrayList<String> listeTypeParam){
		this.listeTypeParam = listeTypeParam;
	}

	@Override
	public ArrayList<String> getTypeParam() {
		// TODO Auto-generated method stub
		return this.listeTypeParam;
	}
}
