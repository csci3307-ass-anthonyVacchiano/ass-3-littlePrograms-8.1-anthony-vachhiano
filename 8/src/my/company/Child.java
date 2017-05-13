package my.company;

public class Child extends Parent implements Ask4money, SpendsMoney {
		 private String favoriteFood;

public Child() {
super();
}
		
	public Child(float _debt, String _name, String _lastName, float _wealth, String _favoriteFood)
	{
		 	super (_debt, _name, _lastName, _wealth);
		 	favoriteFood = _favoriteFood;
		 super.wealth += 100;
}

	public Child(Child c) 
	{
		 	this(c.getDebt(), c.getName(), c.getLastName(), c.wealth, c.favoriteFood);
	}
	@Override
	public boolean spendMoney(float _money2spend) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public float investInMe(float _amount2ask) {
		// TODO Auto-generated method stub
		return 0;
	}
}
