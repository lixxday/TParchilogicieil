package app.visiteur;

public class InterfaceRepresentation implements IVisitable{

	private Class<?> myInterface;
	
	public InterfaceRepresentation (Class<?> o) {
		this.myInterface = o;
	}
	
	public Class<?> getMyInterface() {
		return this.myInterface;
	}
	
	
	@Override
	public void accept(IVisiteur visiteur) {
		visiteur.visit(this);
	}

}
