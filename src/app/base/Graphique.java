package app.base;

import java.util.ArrayList;

public class Graphique {
	private ArrayList<Rectangle> listRectangle;
	
	public Graphique(){
		this.listRectangle = new ArrayList<Rectangle>();
	}
	
	public Graphique (ArrayList<Rectangle> listRectangle){
		this.listRectangle = listRectangle;
	}
	
	public void addGraphique(Rectangle r){
		this.listRectangle.add(r);
	}
	
	public ArrayList<Rectangle> getListRectangle(){
		return this.listRectangle;
	}

}
