//class used to construct enemey objects for player to fight
public class Enemy {
	//intializing variables
	String name;
	double health=0;
	int sided;
	int damage;
	int defense;
	
	//default constructor
public Enemy()
{
	
}

//method used for constructing the enemey objects
public  Enemy(String name,int health,int sided,int dam,int def)
{
	setName(name);
	setHealth(health);
	setSided(sided);
	setDamage(dam);
	setDefense(def);
}
private void setDefense(int def) {
	// TODO Auto-generated method stub
	defense=def;
}
public int getDefense()
{
	return defense;
}
private void setDamage(int dam) {
	// TODO Auto-generated method stub
	damage=dam;
}
public int getDamage()
{
	return damage;
}


private void setSided(int sided2) {
	// TODO Auto-generated method stub
	sided=sided2;
}
public  int getSided()
{
	return sided;
}
public void setHealth(double d) {
	// TODO Auto-generated method stub
	health=d;
}
public void setName(String n)
{
	name=n;
}

public String getName()
{
	return name;
}
public double getHealth()
{
	return health;
}

//rolls dice for attacking takes @param int for sides of die
public double Attack(int  s)
{
	
	Roll x  = new Roll();
	x.Roll( s);
	
	return x.RollDice(s);

}

//method used for rolling defense die takes@param int for sides of die
public double Defend(int  s)
{
	Roll x = new Roll();
	x.Roll( s);
	
	return x.RollDice(s);

}

//method for settign hit damage
public static double AttackAction(double hit)
{
	double hitPoints =hit;
	return hit;
}


}//end of enemey classs
