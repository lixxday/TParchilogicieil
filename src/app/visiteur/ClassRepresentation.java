package app.visiteur;

public class ClassRepresentation implements IVisitable {

	private Class<?> myClass;

	public ClassRepresentation(Object o) {
		this.myClass = o.getClass();
	}
	
	public Class<?> getMyClass() {
		return this.myClass;
	}
	
	@Override
	public void accept(IVisiteur visiteur) {
		visiteur.visit(this);
	}
}
