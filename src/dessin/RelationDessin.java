package dessin;

import general.Relation;
import general.Type;

public class RelationDessin implements ElementDeDessin {

	private Type depart;
	private Relation relation;
	private Type parent;

	public RelationDessin(Relation r) {
		this.parent = r.getRelationParent();
		this.relation = r;
		this.depart = r.getChild();
	}

	@Override
	public void dessiner() {
		System.out.println("Relation(s) :");
		System.out.println(depart.getJavaType() + " " + depart.getNom() + " " + relation.getJavaRelation() + " "
				+ parent.getNom());
	}

}
