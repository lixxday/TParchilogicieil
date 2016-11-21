package general;

public interface Relation {
	
	/**
	 * @return relation java. Extends ou Implements
	 */
	public String getJavaRelation();
	/**
	 * 
	 * @return Type parent (Type implemente ou etendu)
	 */
	public Type getRelationParent();
	/**
	 * 
	 * @return Type qui precise le parent
	 */
	Type getChild();
	
}
