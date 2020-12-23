//class to create items for player to use

public class Item {
//intializing variables
	String name;
	double healthPoints;
	//default constructor
	public  Item()
	{
		
	}
	
	//method used to construct item
	public Item(String name, double healthPoints)
	{
		setName(name);
		setHealthPoints(healthPoints);
	}
	
	
	public void setName(String n)
	{
		name=n;
	}
	public void setHealthPoints(double hit)
	{
		healthPoints=hit;
	}
	public String getName()
	{
		return name;
	}
	public double getHitPoints()
	{
		return healthPoints;
	}
}

