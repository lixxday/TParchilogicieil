package app.representation;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import app.base.Graphique;
import app.base.Rectangle;

public class Dessineur implements IDessineur {

	private Graphique g;

	public Dessineur(Graphique g) {
		this.g = g;
	}

	@Override
	public void visit(IDessinable o) {
		System.out.println("Cette classe n'a pas encore de visiteur");

	}

	@Override
	public void visit(RetourConsole o) {
		// TODO Auto-generated method stub
		String s = "Diagramme" + "\n" + "-------------------------------------------------------" + "\n" + "\n";
		for (int i = 0; i < this.g.getListRectangle().size(); i++) {
			s += "---- " + g.getListRectangle().get(i).getNom();
			for (int k = 1; k < this.g.getListRectangle().get(i).getDependances().size(); k++) {
				if (this.g.getListRectangle().get(i).getDependances().size() > 0) {
					s += " extends/implements : " + g.getListRectangle().get(i).getDependances().get(0);
				}
				s += ", " + g.getListRectangle().get(i).getDependances().get(k);
			}
			s += " ----" + "\n";
			for (int j = 0; j < g.getListRectangle().get(i).getContenu().size(); j++) {
				s += g.getListRectangle().get(i).getContenu().get(j) + "\n";
			}
			s += "\n";
		}
		s += "-------------------------------------------------------";
		System.out.println(s);
	}

	@Override
	public void visit(RetourSVG o) {
		// TODO Auto-generated method stub
		String s = "<?xml version=\"1.0\" standalone=\"no\"?>" + "<!DOCTYPE svg PUBLIC \"-//W3C//DTD SVG 1.1//EN\" "
				+ "\"http://www.w3.org/Graphics/SVG/1.1/DTD/svg11.dtd\">"
				+ "<svg width=\"100%\" height=\"100%\" version=\"1.1\"" + "xmlns=\"http://www.w3.org/2000/svg\">"
				+ "<title>Mon premier document SVG !</title>";
		String sg = "<g>";
		String sDef = "<defs>";
		String sSeul = "";
		int x = 10;
		int y = 10;
		int height = 0;
		int width = 0;
		ArrayList<String[]> listPos = new ArrayList<String[]>();
		ArrayList<Rectangle> rectangles = g.getListRectangle();

		for (int i = 0; i < rectangles.size(); i++) {
			height = rectangles.get(i).getContenu().size() * 10 + 10;
			sSeul += "<rect x=\"" + x + "\" y=\"" + y + "\" + width=\"" + width + "\" height=\"" + height + "\" /> \n";
			String[] toAdd = { rectangles.get(i).getNom(), "" + x, "" + y };
			listPos.add(toAdd);
			y += height + 10;
		}
		for (int j = 0; j < rectangles.size(); j++) {
			for (int k = 0; k < rectangles.get(j).getDependances().size(); k++) {
				String nomArrive = rectangles.get(j).getDependances().get(k);
				String[] PosDepart = { listPos.get(j)[1], listPos.get(j)[2] };
				int l = 0;
				if (nomArrive != "java.lang.Object") {
					while (l<listPos.size() && listPos.get(l)[0] != nomArrive) {
						System.out.println("Nom dans la liste : " + listPos.get(l)[0] + "; nomArrivee = " + nomArrive);
						l++;
					}
					String[] PosArrivee = { listPos.get(l)[1], listPos.get(l)[2] };
					sSeul += "<line x1=\"" + PosDepart[0] + "\" y1=\"" + PosDepart[1] + "\" x2=\"" + PosArrivee[0]
							+ "\" y2=\"" + PosArrivee[1] + "\"  style=\" stroke:#26CD22;\" />";
				}
			}
		}
		sg += "</g>";
		sDef += "</defs>";
		sSeul = "</svg>";
		s += sDef + sg + sSeul;

		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(new File("Diagramme.svg")));
			writer.write(s);

			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
