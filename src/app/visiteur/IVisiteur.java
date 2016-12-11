package app.visiteur;

public interface IVisiteur {

	void visit(IVisitable o);
	void visit(ClassRepresentation o);
	void visit(InterfaceRepresentation o);
}
