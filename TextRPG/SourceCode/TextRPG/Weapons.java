//start of weapons class which will be used to create weapon objects as well as defeneive objects
public class Weapons {

	//intializing variables
	String name;
	double hitPoints;
	double hitAmount;
	//default constructor
	public  Weapons()
	{
		
	}
	//weapons method which creates the objects takes @param String, double and doubel values
	public  Weapons(String name, double hitPoints,double hitAmount)
	{
		setName(name);
		setHitPoints(hitPoints);
		SetHitAmount(hitAmount);
	}
	
	//setname method which takes @param String called n
	public void setName(String n)
	{
		name=n;
	}
	
	//setHitpoints method which takes @param double
	public void setHitPoints(double hit)
	{
		hitPoints=hit;
	}
	
	//setHitAmount method which takes @param htiAmt
	public void SetHitAmount(double hitAmt)
	{
		hitAmount=hitAmt;
	}
	
	//GetHitAmount method returns hitAmount
	public double getHitAmount()
	{
		return hitAmount;
	}
	
	//returns name
	public String getName()
	{
		return name;
	}
	
	//returns hitpoints
	public double getHitPoints()
	{
		return hitPoints;
	}
	
	//prints name
	public String toString()
	{
		return name;
	}
}//end of weapons class
