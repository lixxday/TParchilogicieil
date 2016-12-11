package app.representation;

import java.util.ArrayList;

import app.base.Graphique;

public class Dessineur implements IDessineur {
	
	private Graphique g;
	
	public Dessineur(Graphique g){
		this.g =g;
	}

	@Override
	public void visit(IDessinable o) {
		System.out.println("Cette classe n'a pas encore de visiteur");

	}

	@Override
	public void visit(RetourConsole o) {
		// TODO Auto-generated method stub
		String s = "-------------------------------------------------------" + "\n";
		for(int i=0; i<this.g.getListRectangle().size();i++){
			s += "---- " + g.getListRectangle().get(i).getNom();
			for(int k=0; k<this.g.getListRectangle().get(i).getDependances().size(); k++){
				s += " extends/implements " + g.getListRectangle().get(i).getDependances().get(k);
			}
			s += " ----" + "\n";
			for(int j=0; j<g.getListRectangle().get(i).getContenu().size(); j++){
				s += "--" + g.getListRectangle().get(i).getContenu().get(j) + "--" + "\n";
			}
		}
		System.out.println(s);
	}

	@Override
	public void visit(RetourSVG o) {
		// TODO Auto-generated method stub
		
	}

}
