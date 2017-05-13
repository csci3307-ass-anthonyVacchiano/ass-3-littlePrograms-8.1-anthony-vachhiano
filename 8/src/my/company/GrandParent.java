package my.company;
public class GrandParent implements HasName {
 	private float debt;
 	private String lastName;
 private String name;
public GrandParent() {
 		this(0, "oldMan", "grandPa");

 	}
 	
 	public GrandParent(float debt, String _name, String _lastName) {
 		this.debt = debt;
 		name = _name;
 		lastName = _lastName;
}
public String getName() {
 		return name;	}
public String getLastName() {
 		return lastName;
 	}
 
 	public float getDebt() {
 		return debt;
 }	
}

