package app.representation;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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
		String s ="<?xml version=\"1.0\" standalone=\"no\"?>"
				+ "<!DOCTYPE svg PUBLIC \"-//W3C//DTD SVG 1.1//EN\" "
				+ "\"http://www.w3.org/Graphics/SVG/1.1/DTD/svg11.dtd\">"
				+ "<svg width=\"100%\" height=\"100%\" version=\"1.1\""
				+ "xmlns=\"http://www.w3.org/2000/svg\">"
				+ "<title>Mon premier document SVG !</title>";
		String sg = "<g>";
		String sDef = "<defs>";
		String sSeul = "";
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(new File("Diagramme.svg")));
			writer.write(s);
			 
			writer.close();
			}
			catch (IOException e)
			{
			e.printStackTrace();
			}
		
		sg += "</g>";
		sDef += "</defs>";
		sSeul = "</svg>";
		s += sDef + sg + sSeul;
		
	}

}
