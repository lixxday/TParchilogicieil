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
			for (int k = 0; k < this.g.getListRectangle().get(i).getDependances().size(); k++) {
				if (this.g.getListRectangle().get(i).getDependances().size() > 0) {
					s += " extends/implements : ";
				}
				if(k==0){
					s += g.getListRectangle().get(i).getDependances().get(0);
				}else{
					s += ", " + g.getListRectangle().get(i).getDependances().get(k);
				}
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
				+ "\n <svg width=\"1000\" height=\"1000\" version=\"1.1\"" + " xmlns=\"http://www.w3.org/2000/svg\">"
				+ "\n <title>Diagramme SVG</title>";
		String sg = "\n <g>";
		String sDef = "\n <defs>";
		String sSeul = "\n";
		int x = 10;
		int y = 10;
		int height = 0;
		int width = 300;
		ArrayList<String[]> listPos = new ArrayList<String[]>();
		ArrayList<Rectangle> rectangles = g.getListRectangle();

		for (int i = 0; i < rectangles.size(); i++) {
			height = (rectangles.get(i).getContenu().size()-1) * 30 + 100;
			sSeul += "<rect x=\"" + x + "\" y=\"" + y + "\" width=\"" + width + "\" height=\"" + height + "\"  style=\" fill:#FFFFFF; stroke:#1F56D2\" /> \n";
			sSeul += "<text x=\"" + (x + 75) + "\" y=\"" + (y + 25) + "\" style=\"font-size:25;\">" + rectangles.get(i).getNom() + " </text>";
			for(int m=0; m<rectangles.get(i).getContenu().size(); m++){
				sSeul += "<text x=\"" + (x+5) + "\" y=\"" + (y + 75 + m*20) + "\" >" + rectangles.get(i).getContenu().get(m) + " </text>";
			}
			String[] toAdd = { rectangles.get(i).getNom(), "" + x, "" + y };
			listPos.add(toAdd);
			y += height + 50;
		}
		
		
		for (int j = 0; j < rectangles.size(); j++) {
			int num = 0;
			for (int k = 0; k < rectangles.get(j).getDependances().size(); k++) {
				String nomArrive = rectangles.get(j).getDependances().get(k);
				String[] PosDepart = { listPos.get(j)[1], listPos.get(j)[2] };
				int l = 0;
				if (nomArrive != "java.lang.Object") {
					while (l<listPos.size() && listPos.get(l)[0] != nomArrive) {
						System.out.println(listPos.get(l)[0] + " == " + nomArrive);
						l++;
					}
					String[] PosArrivee = { listPos.get(l - 1)[1], listPos.get(l - 1)[2] };
					sSeul += "<line x1=\"" + (140+num) + "\" y1=\"" + PosDepart[1] + "\" x2=\"" + (140+num)
							+ "\" y2=\"" + PosArrivee[1] + "\"  style=\" stroke:#000000; stroke-linecap:round;\" /> \n";
				}
				num = num + 5;
			}
		}
		sg += "</g>";
		sDef += "</defs>";
		sSeul += "</svg>";
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
