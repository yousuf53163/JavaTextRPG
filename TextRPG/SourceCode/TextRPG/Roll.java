//roll class which will be used to roll random numbers deciding for players used for attacking and defending

import java.util.Random;

public class Roll {
	
	//intializing variables
int sides;
double outcome;

//default constructor
	public Roll()
	{
		
	}
	
	//craetes dices and sets sides 
	public  void Roll( int s)
	{
	setSides(s);
	
	}
	
	//sets the sides of the dice
	public  void setSides(int s)
	{
		sides= s;
	}
	//returns sides of the die
	public double getSides()
	{
		return sides;
	}
	
	
	//rolls the dice and returns the outcome
	public double RollDice( int sides)
	{
		Random roll = new Random();
		double s= roll.nextInt(sides);
		return outcome= s/sides;
	}
}//end of dice class
