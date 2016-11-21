package general;

public interface Relation {
	
	/**
	 * @return relation java. Extends ou Implements
	 */
	public String getJavaRelation();
	public Type getRelationParent();
	Type getChild();
	
}
