package general;

public class RelationImpl implements Relation {
	private String javaRelation;
	private Type parent;
	//private Fleche fleche;
	
	public RelationImpl(String javaRelation, Type parent){
		this.javaRelation = javaRelation;
		this.parent = parent;
	}

	@Override
	public String getJavaRelation() {
		// TODO Auto-generated method stub
		return this.javaRelation;
	}

	@Override
	public String getParent() {
		// TODO Auto-generated method stub
		return this.parent.getNom();
	}

}
