//player class which is a calss that creates teh player that the user will be playing
//extends weapons class
public class Player extends Weapons {
//intializing  variables for player
	Weapons weapon;
Weapons Shield;
Weapons helmet;
Weapons plateLegs;
Weapons ChestPlate;
double ATK;
double DEF;
	String charName;
	double hp=0;
	String Gen;
	Item item;
	
	//default constructor for player
	public  Player()
	{
		
	}
	//creates palyer with @param string doubte and string
	public Player(String name,double health, String Gender)
	{
		//setters
		setName(name);
		setHealth(health);
		setGender(Gender);
	}
	//settign health
	public void setHealth(double health) {
		// TODO Auto-generated method stub
		
		hp= health;
	}
//setting attack 
	public static double Attack(double hit)
	{
		double hitPoints =hit;
		return hit;
	
		
	}
	//setting defense
	public static double Defend(double hit)
	{
		double hitPoints =hit;
		return hit;
	
		
	}
	//setting name
	public  void setName(String a)
	{
		charName =a;
	}
	//returns health
	public double getHeatlh()
	{
		return hp;
	}
	//returns name
	public String getName()
	{
		
		return charName;
	}
	
	//set gender
	public void setGender(String Gender)
	{
		Gen= Gender;
	}
	
	//returns gender
	public String getGender()
	{
		return Gen;
	}
	//sets attack
	public double Attack()
	{
		Roll hero = new Roll();
		hero.Roll( 9);
		
		return hero.RollDice(9);
	
	}
	
	//rolls defend
	public double Defend()
	{
		Roll hero = new Roll();
		hero.Roll( 19);
		
		return hero.RollDice(19);
	
	}
	//sets weapons
	public void setWeapon(Weapons s)
	{
		weapon=s;
	}
	
	//returns weapon
	public Weapons getWeapon()
	{
		return weapon;
	}
	
	//sets item
	public void setItem(Item x)
	{
		item=x;
	}
	
	//returns item
	public Item getItem()
	{
		return item;
	}

	//sets defense weapon
	public void setDefense(Weapons shield) {
		Shield =shield;
	}
	
	//gets defense weapons
	public Weapons getDefense()
	{
		return Shield;
	}
	
	//method to wear armor
	public void wearHelmet(Weapons Helm)
	{
		helmet=Helm;
	}
	public Weapons getHelmet()
	{
		return helmet;
	}
	//method to wear armor
	public void wearChestPlate(Weapons palte)
	{
		ChestPlate=palte;
	}
	public Weapons getChestPlate()
	{
	return ChestPlate;	
	}
	//method to wear armor
	public void wearLegs(Weapons Legs)
	{
		plateLegs=Legs;
	}
	public Weapons GetLegs()
	{
		return plateLegs;
	}
	public void setATK( )
	{
	ATK=Attack();
	
	}
	public double getATK()
	{
		return ATK;
	}
	public void setDEF()
	{
		DEF=Defend();
	}
	public double getDEF()
	{
		return DEF;
	}
}
