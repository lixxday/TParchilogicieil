package dessin;

import general.Type;

public class InterfaceDessin implements ElementDeDessin {
	private Type inter;
	
	public InterfaceDessin(Type inter){
		this.inter = inter;
	}

	@Override
	public void dessiner() {
		// TODO Auto-generated method stub
		String methodes = "";
		for(int i = 0; i < inter.getDescription().getMethodes().size(); i++){
			methodes += "Methode : " + inter.getDescription().getMethodes().get(i).getNom();
			if(inter.getDescription().getMethodes().get(i).getTypeParam().size() > 0){
				methodes += "\n types d'entree : (" +  inter.getDescription().getMethodes().get(i).getTypeParam().get(0);
			}
			for(int j = 1; j <inter.getDescription().getMethodes().get(i).getTypeParam().size(); j++){
				methodes += ", " + inter.getDescription().getMethodes().get(i).getTypeParam().get(j); 
			}
			if(inter.getDescription().getMethodes().get(i).getTypeParam().size() > 0){
				methodes += ") ";
			}
			methodes += " | type de sortie : " + inter.getDescription().getMethodes().get(i).getTypeRetour();
		}
		System.out.println("\n -------------------------------------- \n" 
				+ "Interface : " + inter.getNom() + "\n -------------------------------------- \n" 
				+ "Package : " + inter.getPackage() + "\n -------------------------------------- \n"
				+ methodes + "\n -------------------------------------- \n"
				);
	}

}
