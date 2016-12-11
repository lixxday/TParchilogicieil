package app.visiteur;

public class ClassRepresentation implements IVisitable {

	private Class<?> myClass;

	public ClassRepresentation(Class<?> o) {
		this.myClass = o;
	}
	
	public Class<?> getMyClass() {
		return this.myClass;
	}
	
	@Override
	public void accept(IVisiteur visiteur) {
		visiteur.visit(this);
	}
}
