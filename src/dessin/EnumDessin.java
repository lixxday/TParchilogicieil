package dessin;

import general.Type;

public class EnumDessin implements ElementDeDessin {
	
	private Type enu;
	
	public EnumDessin(Type enu){
		this.enu = enu;
	}

	@Override
	public void dessiner() {
		// TODO Auto-generated method stub
		String attributs = "Attributs : \n";
		
		for(int i=0; i<enu.getDescription().getAttributs().size();i++){
			attributs += enu.getDescription().getAttributs().get(i).getNom().toUpperCase() +"\n";
		}
		
		System.out.println("\n -------------------------------------- \n"
				+ "Enum : " + enu.getNom() + "\n -------------------------------------- \n" 
				+ "Package : " + enu.getPackage() + "\n -------------------------------------- \n"
				+ attributs + "\n-------------------------------------- \n"
				);

	}

}
