import java.util.ArrayList;
import java.util.Random;
//Yousuf Khan

//start of client code
public class BAG_Client  {
//start of main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Initializing Coin Quater with interger value 25 and String value Quater 
		Coin Quater = new Coin(25,"Quater");
		
		//Initializing Coin Nickel with interger value 5 and String value Nickel
		Coin Nickel = new Coin(5,"Nickel");
		
		//Initializing Coin Dime with interger value 10 and String value Dine
		Coin Dime = new Coin(10,"Dime");
		
		//Initializing Coin Penny with interger value 1 and String value Penny
		Coin Penny= new Coin(1,"Penny");
		
		//Initializing a random object caled genator
		Random genator = new Random();
		
		
		
		
	
		// Initializing ResizableArrayBag which holds data type coin and is called BagOfCoins
		ResizableArrayBag<Coin> BagOfCoins = new ResizableArrayBag<Coin>();
		
		
		//for loop for adding random coins to be added to the bag 25 times
		for(int x=0;x<25;x++)
	{		
			//initialing interger size with random number from 0-3
			int size= genator.nextInt(4);
			
		
		//if statement stating if size is equal to 0 then add a penny
		if(size==0)
		{
			//add Coin Penny to BagOfCoins 
			BagOfCoins.add(Penny);
		}
		else
		{
		//blank else statement	
		}
		
		//if statement stating if size is equal to 1 then add a Nickel
		if(size==1)
		{
			//add Coin Nickel to BagOfCoins
			BagOfCoins.add(Nickel);
		}
		else
		{
			//blank else statement
		}
		
		//if statement stating if size is equal to 2 then add a Dime
		if(size==2)
		{
			//add Coin Dime to BagOfCoins
			BagOfCoins.add(Dime);
		}
		else
		{
			//blank else statement 
		}
		
		//if statement stating if size is equal to 3 then add a Quater
		if(size==3)
		{
			//add Coin Quater to BagOfCoins
			BagOfCoins.add(Quater);
		}
		else
		{
			//blank else statement 
		}
		
		}
		//prints the size of BagOfCoins and also the amount of coins in the bag
		System.out.println("There are "+BagOfCoins.getCurrentSize()+" coins");
		//print statement saying its testing if there is a nickel
		System.out.println("Testing if there is a nickel in the bag");
		//Print statement which uses the contains method from ResizableArrayBag to test if Nickel is in the bag
		System.out.println(BagOfCoins.contains(Nickel));
		
		
		//print statement letting the client know that a random coin is going to be removed
		System.out.println("Removing random coin");
		//Removes random Coin object from BagOfCoins
		BagOfCoins.remove();
		//print statement that tells you the amount of coins in the BagOfCoins 
		System.out.println("There are "+BagOfCoins.getCurrentSize()+" coins");
		//Statement saying a quater is being removed 
		System.out.println("Removing a Quater");
		//Removing Coin Quater from BagOfCoins
		BagOfCoins.remove(Quater );
		
		//Prints the current size of the BagOfCoins bag array and the amount of coins
		System.out.println("There are "+BagOfCoins.getCurrentSize()+" coins");
		
		//testing if there is a penny in the bag array
		System.out.println("Testing if there is a penny in the bag");
		System.out.println(BagOfCoins.contains(Penny));
		
		//testing if there is a quater in the bag array
		System.out.println("Testing if there is a quater in the bag");
		System.out.println(BagOfCoins.contains(Quater));
		
		//testing if there is a dime in the bag array
		System.out.println("Testing if there is a dime in the bag");
		System.out.println(BagOfCoins.contains(Dime));
		
		//testing if there is a nickel in the  bag array
		System.out.println("Testing if there is a nickel in the bag");
		System.out.println(BagOfCoins.contains(Nickel));
		

		//getting the frequency of dimes in the bag
		System.out.println("Dimes "+BagOfCoins.getFrequencyOf(Dime));
		//getting the frequency of nickels in the bag
		System.out.println("Nickels "+BagOfCoins.getFrequencyOf(Nickel));
		//getting the frequency of quaters in the bag
		System.out.println("Quaters "+BagOfCoins.getFrequencyOf(Quater));
		//getting the frequency of pennys in the bag
		System.out.println("Penny "+BagOfCoins.getFrequencyOf(Penny));	
		
		
	
		//creating spaces in output
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		//printing everything in the bag array
		System.out.println("Printing out everything in the bag");
	
		//assiging array Coin to BagOfCoins
		Object[]Coin=BagOfCoins.toArray();
		
		//for loop that prints out everything in the bag array
		for(Object coin : Coin)
		{
			Coin hold=(Coin)coin;
			System.out.println(hold.getFace());
		}
		
		//removing all coins form the bag
		System.out.println("removing all coins from the bag");
		BagOfCoins.clear();
		
		//Start of testing probability with coin drawing
		System.out.println("");
		System.out.println("Testing probability of picking out certain coins from a random size bag and randomly added coins ");
		System.out.println("every coin that is pulled will not be put back or replaced");
		System.out.println("");
		
		//intializing random number Loop from 0- 100
		int Loop= genator.nextInt(101);
	
		//printing out loop interger 
		System.out.println("There are "+Loop+" coins in the random bag");
		
		
		//for loop for adding random coins to be added to the bag randomly  0-100 times
		for( int x=0;x<Loop;x++)
	{		
			//initialing interger size with random number from 0-3
			int size= genator.nextInt(4);
			
		
		//if statement stating if size is equal to 0 then add a penny
		if(size==0)
		{
			//add Coin Penny to BagOfCoins 
			BagOfCoins.add(Penny);
		}
		else
		{
		//blank else statement	
		}
		
		//if statement stating if size is equal to 1 then add a Nickel
		if(size==1)
		{
			//add Coin Nickel to BagOfCoins
			BagOfCoins.add(Nickel);
		}
		else
		{
			//blank else statement
		}
		
		//if statement stating if size is equal to 2 then add a Dime
		if(size==2)
		{
			//add Coin Dime to BagOfCoins
			BagOfCoins.add(Dime);
		}
		else
		{
			//blank else statement 
		}
		
		//if statement stating if size is equal to 3 then add a Quater
		if(size==3)
		{
			//add Coin Quater to BagOfCoins
			BagOfCoins.add(Quater);
		}
		else
		{
			//blank else statement 
		}
		
		}
		
		
				//getting the frequency of dimes in the bag
				System.out.println("Dimes "+BagOfCoins.getFrequencyOf(Dime));
				//getting the frequency of nickels in the bag
				System.out.println("Nickels "+BagOfCoins.getFrequencyOf(Nickel));
				//getting the frequency of quaters in the bag
				System.out.println("Quaters "+BagOfCoins.getFrequencyOf(Quater));
				//getting the frequency of pennys in the bag
				System.out.println("Penny "+BagOfCoins.getFrequencyOf(Penny));
				
		//creating a double called penny which will hold the amount of pennys in BagOfCoins
		double penny= BagOfCoins.getFrequencyOf(Penny);
		//creating a double called nickel which will hold the amount of nickels in BagOfCoins
		double nickel=BagOfCoins.getFrequencyOf(Nickel);
		//creating a double called dime which will hold the amount of dimes in BagOfCoins
		double dime=BagOfCoins.getFrequencyOf(Dime);
		//creating a double called quater which will hold the amount of quaters in BagOfCoins 
		double quater=BagOfCoins.getFrequencyOf(Quater);
		
		
	
		//printing the total coins in the random bag
		System.out.println("");
		System.out.println("There are "+BagOfCoins.getCurrentSize()+" coins in the random bag");
		System.out.println("");
		System.out.println("");
		System.out.println("PROBABILITY SCENARIO 1");
		System.out.println("");
		//checking probability of picking a penny on the first draw
		System.out.println("Probability of picking a Penny on the first draw is ");
		System.out.printf("%.4f", BagOfCoins.getFrequencyOf(Penny)/(double)BagOfCoins.getCurrentSize()*100);System.out.print("%");
		System.out.println("");
		
		//creating double Pprob with penny divided by totalCoins
		double Pprob=BagOfCoins.getFrequencyOf(Penny)/(double)BagOfCoins.getCurrentSize();//assigning probability of picking penny to Pprob
		
		
		
		//testing probability of picking a nickel on the second draw
		System.out.println("Probability of picking a Nickel on the second draw is ");
		

		BagOfCoins.remove(Penny);//removing penny from bag
		
		//finding probability of picking a nickel on the second draw
		System.out.printf("%.4f", (double)BagOfCoins.getFrequencyOf(Nickel)/BagOfCoins.getCurrentSize()*Pprob*100);System.out.print("%");
		System.out.println("");
		
		//creating double Nprob with Nickel divided by totalCoins
		double Nprob=(double)BagOfCoins.getFrequencyOf(Nickel)/(double)BagOfCoins.getCurrentSize();
		
		BagOfCoins.remove(Nickel);//removing nickel from bag
		
		//testing probability of picking a dime on the third draw
		System.out.println("Probability of pciking a Dime on the third draw is ");
		
		
		//calculating probability of picking a dime on the third draw
		System.out.printf("%.4f", (double)BagOfCoins.getFrequencyOf(Dime)/(double)BagOfCoins.getCurrentSize()*Nprob*Pprob*100);System.out.print("%");
		System.out.println("");
		//assigned double Dprob  with dime divided by total coins
		double Dprob=(double)BagOfCoins.getFrequencyOf(Dime)/(double)BagOfCoins.getCurrentSize();
		
		

		System.out.println("Probability of picking a penny on the first draw then a nickel on the second draw and a dime on the third draw is ");
		System.out.printf("%.4f", Pprob*Nprob*Dprob*100);System.out.print("%");
		System.out.println("");
		
		//adding coins removed for new probability test
		BagOfCoins.add(Penny);
		BagOfCoins.add(Dime);
		BagOfCoins.add(Nickel);
		
		//start of probability scenario 2
		System.out.println("");
		System.out.println("PROBABILITY SCENARIO 2");
		System.out.println("");
	
		//calculating probability of picking a quater on the first draw
		System.out.println("Probability of picking a Quater on the first draw");
		System.out.printf("%.4f", (double)BagOfCoins.getFrequencyOf(Quater)/BagOfCoins.getCurrentSize()*100);System.out.print("%");
		System.out.println("");
		double Qprob=(double)BagOfCoins.getFrequencyOf(Quater)/(double)BagOfCoins.getCurrentSize();//assigning probability value to Qprob
		BagOfCoins.remove(Quater);//removing Quater from Bag
		
		//calculating probability of picking a quater on the second draw
		System.out.println("Probability of picking a Quater on the second draw");
		System.out.printf("%.4f", (double)BagOfCoins.getFrequencyOf(Quater)/BagOfCoins.getCurrentSize()*Qprob*100);System.out.print("%");
		System.out.println("");
		double Qprob2=(double)BagOfCoins.getFrequencyOf(Quater)/(double)BagOfCoins.getCurrentSize();// asigning probability of picking a quater to Qprob2
		BagOfCoins.remove(Quater);//removing Quater from Bag
		
		//calculating probability of picking a dime on the third draw
		System.out.println("Probability of picking a Dime on the third draw");
		System.out.printf("%.4f", (double)BagOfCoins.getFrequencyOf(Dime)/BagOfCoins.getCurrentSize()*Qprob*Qprob2*100);System.out.print("%");
		System.out.println("");
		 Dprob=(double)BagOfCoins.getFrequencyOf(Dime)/(double)BagOfCoins.getCurrentSize();//assigning probability of picking a dime to Dprob
		
		 //calculating probability of picking quater then quater then dime
		 System.out.println("Probability of picking a quater on the first draw then a quater on the second draw and a dime on the third draw is ");
			System.out.printf("%.4f", Qprob*Qprob2*Dprob*100);System.out.print("%");//printing out final probability
			System.out.println("");
			
			
			//adding coins back into bag for next scenario
			BagOfCoins.add(Quater);
			BagOfCoins.add(Quater);
			BagOfCoins.add(Dime);
			
			//start of scenario 3
			System.out.println("");
			System.out.println("PROBABILITY SCENARIO 3");
			System.out.println("");
			
		//probability of picking a dime on the first pick	
		System.out.println("probability of picking a dime on the first pick ");
		System.out.printf("%.4f", ((double)BagOfCoins.getFrequencyOf(Dime)/(double)BagOfCoins.getCurrentSize())*100);System.out.print("%");
		System.out.println("");
		Dprob= ((double)BagOfCoins.getFrequencyOf(Dime)/(double)BagOfCoins.getCurrentSize());// assigns the probability of drawing a dime to Dprob
		BagOfCoins.remove(Dime);//removes dime from bag
		
		//calculating probability of picking a nickel 
		System.out.println("probability of picking a dime on the first pick and a  Nickel on the second pick ");
		Nprob= ((double)BagOfCoins.getFrequencyOf(Nickel)/(double)BagOfCoins.getCurrentSize());//assigning probability of picking a nickel to Nprob
		System.out.println("");
		System.out.printf("%.4f", (Nprob*Dprob)*100);System.out.print("%");//prniting final proability
		System.out.println("");
		
		//adding coins back into bag
		BagOfCoins.add(Dime);
		BagOfCoins.add(Nickel);
		
		//start of scenario 4
		System.out.println("");
		System.out.println("PROBABILITY SCENARIO 4");
		System.out.println("No coins will be removed");
		System.out.println("");
		
		
		//calculating probabililty of picking a nickel on the first draw
		System.out.println("Probability of picking a nickel on the first draw ");
		System.out.printf("%.4f", ((double)BagOfCoins.getFrequencyOf(Nickel)/(double)BagOfCoins.getCurrentSize())*100);System.out.print("%");
		System.out.println("");
		Nprob=(double)BagOfCoins.getFrequencyOf(Nickel)/(double)BagOfCoins.getCurrentSize();
		
		//caclulating probability of picking a nickel on the second draw
		System.out.println("Probability of picking a nickel on the second draw ");
		System.out.printf("%.4f", ((double)BagOfCoins.getFrequencyOf(Nickel)/(double)BagOfCoins.getCurrentSize()*Nprob)*100);System.out.print("%");
		System.out.println("");
		
		
		//calculating probability of picking a nickel on the third draw
		System.out.println("Probability of picking a nickel on the second draw ");
		System.out.printf("%.4f", ((double)BagOfCoins.getFrequencyOf(Nickel)/(double)BagOfCoins.getCurrentSize()*Nprob*Nprob)*100);System.out.print("%");
		System.out.println("");
		
		
		//start of scenario 5
		System.out.println("");
		System.out.println("PROBABILITY SCENARIO 5");
		System.out.println("No coins will be removed");
		System.out.println("");
		//calculating probability of picking a quater and then a nickel with no coins removed
		System.out.println("probability of picking a quater on the first draw");
		System.out.printf("%.4f", ((double)BagOfCoins.getFrequencyOf(Quater)/(double)BagOfCoins.getCurrentSize())*100);System.out.print("%");
		Qprob=((double)BagOfCoins.getFrequencyOf(Quater)/(double)BagOfCoins.getCurrentSize());//assiging probability of picking a quater to Qprob
		
		System.out.println("");
		System.out.println("Probability of picking a nickel on the second draw");
		System.out.printf("%.4f", ((double)BagOfCoins.getFrequencyOf(Nickel)/(double)BagOfCoins.getCurrentSize())*Qprob*100);System.out.print("%");//printing probability of picking a quater and then a nickel
	}//end of main method
	
	

}//end of client class




/*
 * 
 * There are 25 coins
Testing if there is a nickel in the bag
true
Removing random coin
There are 24 coins
Removing a Quater
There are 23 coins
Testing if there is a penny in the bag
true
Testing if there is a quater in the bag
true
Testing if there is a dime in the bag
true
Testing if there is a nickel in the bag
true
Dimes 9
Nickels 3
Quaters 8
Penny 3



Printing out everything in the bag
Penny
Dime
Dime
Dime
Penny
Dime
Penny
Dime
Quater
Quater
Quater
Quater
Quater
Dime
Dime
Nickel
Quater
Quater
Nickel
Nickel
Dime
Quater
Dime
removing all coins from the bag

Testing probability of picking out certain coins from a random size bag and randomly added coins 
every coin that is pulled will not be put back or replaced

There are 66 coins in the random bag
Dimes 14
Nickels 25
Quaters 11
Penny 16

There are 66 coins in the random bag


PROBABILITY SCENARIO 1

Probability of picking a Penny on the first draw is 
24.2424%
Probability of picking a Nickel on the second draw is 
9.3240%
Probability of pciking a Dime on the third draw is 
2.0396%
Probability of picking a penny on the first draw then a nickel on the second draw and a dime on the third draw is 
2.0396%

PROBABILITY SCENARIO 2

Probability of picking a Quater on the first draw
16.4179%
Probability of picking a Quater on the second draw
2.4876%
Probability of picking a Dime on the third draw
0.5741%
Probability of picking a quater on the first draw then a quater on the second draw and a dime on the third draw is 
0.5741%

PROBABILITY SCENARIO 3

probability of picking a dime on the first pick 
23.5294%
probability of picking a dime on the first pick and a  Nickel on the second pick 

8.7796%

PROBABILITY SCENARIO 4
No coins will be removed

Probability of picking a nickel on the first draw 
37.6812%
Probability of picking a nickel on the second draw 
14.1987%
Probability of picking a nickel on the second draw 
5.3502%

PROBABILITY SCENARIO 5
No coins will be removed

probability of picking a quater on the first draw
15.9420%
Probability of picking a nickel on the second draw
6.0071%

*/
