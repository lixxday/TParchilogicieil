package general;

public class RelationImpl implements Relation {
	private Type child;
	private String javaRelation;
	private Type parent;
	//private Fleche fleche;
	
	public RelationImpl(Type child, String javaRelation, Type parent){
		this.child = child;
		this.javaRelation = javaRelation;
		this.parent = parent;
	}

	@Override
	public Type getChild(){
		return this.child;
		
	}
	
	@Override
	public String getJavaRelation() {
		// TODO Auto-generated method stub
		return this.javaRelation;
	}

	@Override
	public Type getRelationParent() {
		// TODO Auto-generated method stub
		return this.parent;
	}



}
