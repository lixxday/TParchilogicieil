package general;

import java.util.ArrayList;

public class MethodeImpl implements Methode {
	private String nom;
	private ArrayList<String> listTypeParam;
	private String typeRetour;

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
