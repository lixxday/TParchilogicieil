package dessin;

import general.Relation;
import general.Type;

public class RelationDessin implements ElementDeDessin {

	private Type type;
	private Relation relation;

	public RelationDessin(Type classeDepart, Relation r) {
		this.type = classeDepart;
		this.relation = r;
	}

	@Override
	public void dessiner() {
		System.out.println(type.getJavaType() + type.getNom() + relation.getJavaRelation()
				+ relation.getRelationParent().getNom());
	}

}
