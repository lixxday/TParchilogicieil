package app.representation;

public interface IDessineur {
	void visit(IDessinable o);
	void visit(RetourConsole o);
	void visit(RetourSVG o);

}
