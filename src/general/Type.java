package general;

import java.util.ArrayList;

public interface Type {
	
	public String getNom();
	public String getPosition();
	public String getJavaType();
	
	public Description getDescription();
	public void setPosition(String paquet);
//	public String getJavaRelation();
//	public Type getRelationParent();
	public ArrayList<Relation> getRelations();
	
}
