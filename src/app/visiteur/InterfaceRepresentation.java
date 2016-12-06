package app.visiteur;

public class InterfaceRepresentation implements IVisitable{

	private Class<?> myInterface;
	
	public InterfaceRepresentation (Object o) {
		this.myInterface = o.getClass();
	}
	
	public Class<?> getMyInterface() {
		return this.myInterface;
	}
	
	
	@Override
	public void accept(IVisiteur visiteur) {
		visiteur.visit(this);
	}

}
