package model_controler_view;

import java.util.ArrayList;
import java.util.List;

public class Univers {

	private List <Case> cases;

	public Univers() {
		super();
		this.cases = new ArrayList <Case>();
	}

	public List<Case> getCases() {
		return cases;
	}
		
}
