package endpoint.repository.actions;

import java.util.List;

import endpoint.repository.IdRef;
import endpoint.repository.actions.annotations.PUT;
import endpoint.repository.models.parents.Child;

public class ChildAction extends Action<Child> {

	@PUT("touched")
	public Child touch(IdRef<Child> id) {
		Child child = id.fetch();
		child.setName("touched " + child.getName());
		return child;
	}

	@PUT(value = "touched", overCollection = true)
	public List<Child> touch() {
		List<Child> childs = r.query(Child.class).list();
		for (Child child : childs) {
			child.setName("touched " + child.getName());
		}
		return childs;
	}

}