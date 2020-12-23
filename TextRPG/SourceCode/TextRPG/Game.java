
//importing classes to be used in the main 
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
//start of game class
public class Game {

//intializing bags for charecter to use which will holde weapons and item types 
	static ResizableArrayBag<Item> PlayerBag = new ResizableArrayBag<Item>();
	static ResizableArrayBag<Weapons> PlayerWeapons = new ResizableArrayBag<Weapons>();
	static ResizableArrayBag<Weapons> PlayerDefense = new ResizableArrayBag<Weapons>();
	static ResizableArrayBag<Weapons> PlayerArmor = new ResizableArrayBag<Weapons>();
// creating random object
public static	Random random = new Random();

//intializng wearable objects
	static Weapons ChestPlate = new Weapons("Chest Plate",50,15);
	static Weapons Helmet = new Weapons("Helmet",20,10);
	static Weapons PlateLegs = new Weapons("Plate Legs",30,10);
	 static Weapons Shirt= new Weapons("Shirt",0,100);
	 static Weapons Hat= new Weapons("Hat",0,100);
	static Weapons Pants= new Weapons("Pants",0,100);
	//intializing potions
	static Item minPotion = new Item("Low Potion",20);
	static Item medPotion = new Item("Medium Potion",50);
	static Item fullPotion = new Item("Full potion",100);
	static Item OverKill= new Item("OverKill", 300);
	//intializing defensive weapons
	static Weapons Shield = new Weapons("Shield", 25,20);
	static Weapons CrossArms= new Weapons("Crossing your arms",10,20);
	static Weapons Sword = new Weapons("Sword",20,15);
	static Weapons Fist = new Weapons("Fist",5,30);
	static Weapons Dagger = new Weapons("Dagger",10,10);
	//intializing enemies
	static Enemy Rat = new Enemy("Rat",20,25,5,3);
	static Enemy Thief = new Enemy("PETA Memeber", 60,20,10,5);
	static Enemy Knight = new Enemy("Knight",100,15,20,15);
	static Enemy Dragon = new Enemy("Dragon",250,23,29,25);
	//intializing hero
 public static Player hero = new Player(null, 100, null);
 //intializing choice maker
 public static boolean ChoiceMaker=false;


public static void main (String [] args)//start of main method
{
	
	Scanner x = new Scanner(System.in);// intializing scanner class object

	
	 boolean Confirm= false;//setting boolean to false
	 
	double health =100;// setting health of hero to 100
	String gender;// intializing gender of charecter
	 String name;System.out.println("roight game aint finsihed. This is the E3 demo, to play the full game you must purchase DLC to fight the dragon");
	 String Start=x.nextLine();//scanenr object intialization
while(Confirm == false)//start of while loop
{
	int counter=0;//counter
			counter++;//counter increases
System.out.println("please enter your charecters name");



name= x.nextLine();//input for name
while(name.equals(""))//checks if name is blank
{
System.out.println("Try again mate don't leave it blank");
name=x.nextLine();//input for name
}
System.out.println("please enter your charecters gender");
System.out.println();
 gender= x.nextLine();//input for gender
 while(gender.equals(""))//checks gender is blank
 {
 System.out.println("Try again mate don't leave it blank");
 gender=x.nextLine();//input for gender
 }
setPlayer(name, health, gender);//setting players name gender and health
hero.wearHelmet(Hat);//setting wearble objects to hero
hero.wearChestPlate(Shirt);//setting wearble objects to hero
hero.wearLegs(Pants);//setting wearble objects to hero
System.out.println();
System.out.println("Your name is "+name+" and your gender is "+gender);


System.out.println("Are you sure about your selections?  Y/N");
System.out.println();
String Choice=x.nextLine();

while(Choice.equals(""))//checks choice is blank
{
System.out.println("Try again mate don't leave it blank");
Choice=x.nextLine();
}
System.out.println();

yes(Choice);//checking if choice is yes

if(ChoiceMaker==true)//if choice maker is true 
{
	
	Confirm =true;//setting confirm to true
	System.out.println("Ok I guess you have finally created you charecter only took you "+counter+" retries to pick your charecter name and gender");
	String	enter= x.nextLine();//waiting for blank enter
}
else
{
	Confirm =false;//assigning confirm to false
}
}
SpaceCreater();//calling space method
genderCheck(hero.getGender());//checking gender
System.out.println("oh whatever I guess we can start the adventure that you'll be playing hit enter to continue buddy ol pal");
String enter= x.nextLine();//enter taker
SpaceCreater();//space maker
//story print line statements
System.out.println("Aight so here's what happening,"+ hero.getName()+" was walking onto the ccm campus and noticed that there was a weird");
System.out.println("looking man was trying to find a young "+hero.getGender()+" to travel back in time. He sees you and says ");
enter= x.nextLine();
System.out.println("MAN: my look at you, you little "+hero.getGender()+" would you like to step into my machine?  Y/N?");
String Choice=x.nextLine();//choice assignment
while(Choice.equals(""))//while loop to check choice
{
System.out.println("Try again mate don't leave it blank");
Choice=x.nextLine();
}
yes(Choice);//calling yes method which is taking choice string
if(ChoiceMaker==true)//cheching if choice is true
{
	//progresses story
	enter= x.nextLine();
	System.out.println("You being a bloody idiot actually stepped into his machine and immediatley passed out from the noxious fumes that were released");
	enter= x.nextLine();
System.out.println("The man slips a note in your pocket as your concious begins to fade");
	enter= x.nextLine();
	System.out.println("You woke up in a forest still foggy minded and unaware of whats going on see a rat four feet tall and wide eating a dead human corpse");
	enter= x.nextLine();
	System.out.println("you notice that the man is wearing clothes from the 16th century. Then the rat changes focus to you and immediatley charges at you");
	enter= x.nextLine();
	System.out.println("A bloody fricken rat mate.......I know... I know.. how original just like every other RPG");
	enter= x.nextLine();
}//end of if statement
else//else statement that ends story
{
	enter= x.nextLine();
	System.out.println("Ok... I see you're too good to go into a time machine. well I hope you fail the class you're heading towards");
	enter= x.nextLine();
System.out.println("The end mate leave or restart and actaully play the game");
enter= x.nextLine();
System.out.println("aight bye bye");
System.exit(0);
}//end of else statement


SpaceCreater();//creates spaces
addWeapon(Fist,PlayerWeapons);//adding weapon fist to weapons bag
addDefense(CrossArms,PlayerDefense);//adding defense cross arms to player defense bag
//progressing story
System.out.println("So I added the weapon "+Fist.getName()+" for you to use. I dont know how you didn't know how to use them before but they only do");
System.out.println("like "+Fist.getHitPoints()+" the more you progess the more weapons you'll find and be able to use throughout the game");
System.out.println("just punch the rat and don't die mate, aight peace out till I need to do more exposition");
//setting defense and weapons
hero.setDefense(CrossArms);
hero.setWeapon(Fist);
enter= x.nextLine();//taking enter 
SpaceCreater();//space generator
System.out.println("A wild rat appears...");
System.out.println("what would you like to do?");
Fight(Rat);//calling fight method passing rat


System.out.println("would you like to rummage thorugh the corspe of a dead rat?");
String choice =x.nextLine();
yes(choice);//checking what choice was 

if(ChoiceMaker==true)//if choice is true
{
	//adding items to bag
System.out.println("you were curious and decided to rumage through the rats corpse and found a "+ minPotion.getName()+" it heals "+minPotion.getHitPoints()+" health points");
System.out.println("its been added to your bag");
addItem(minPotion,PlayerBag);
enter=x.nextLine();
}//end of if statement
else
{
	//alternate choice option
	System.out.println("you missed out on some rad loot dude");
	enter=x.nextLine();
}//else statement end

SpaceCreater();//creates spaces
//story statements
System.out.println("As you recover and get your bearings straight you notice that the world around is familliar yet strange at the same time");
enter= x.nextLine();
System.out.println("you notice that you seem to be where CCM would of been, yet you notice that nothing is constructed");
enter= x.nextLine();
System.out.println("you think to yousrself- Why the hell was tehre a rat that was 4ft tall and wide and why is this dead guy wearing rennisance clothing");
enter= x.nextLine();
System.out.println("you notice that the man has a dagger sticking out of his pocket ");
enter= x.nextLine();
System.out.println("would you like to take his dagger?");

choice= x.nextLine();//checking choice
while(choice.equals(""))
{
System.out.println("Try again mate don't leave it blank");
choice=x.nextLine();
}
yes(choice);//checking choice 
if(ChoiceMaker==true)//checking if boolean is true
{
	//adding dagger to player weapons
	System.out.println("I guess grave robbing isn't above you");
	addWeapon(Dagger,PlayerWeapons);
	System.out.println("The dagger was added to your bag, you should be ashamed of yourself");
}//end of if statement
else
{//start of else statement
	System.out.println("ah I see the moral high ground how good of you");
}//end of else statement



//story
choice=x.nextLine();
System.out.println("As you walk down the forest trying to get to anything that resembles a civilization");
choice=x.nextLine();
System.out.println("You notice a man is watching you and is sneaking around hiding, going tree by tree as he trails you from behind");
choice=x.nextLine();
System.out.println("You lose sight of the man behind you and suddenly he appears infront of you and says.");

choice=x.nextLine();
System.out.println("MAN: oye lad I saw you snooping around a dead mans body and beating a rat off, to death.");
choice=x.nextLine();
System.out.println("Man: As the loyal man of PETA I must stop you before you hurt anymore animals you sicko");
choice=x.nextLine();
System.out.println("A Wild Peta member has appeared and going to bloody murder you");

Fight(Thief);//calling fight method passing enemey thief
//story
System.out.println("aye you survived");
enter= x.nextLine();
System.out.println("All it took was murdering a poor thief in the woods");

enter= x.nextLine();
System.out.println("So i'm assuming you're gonna want to take his stuff so lets just add it to your bag ey");
enter= x.nextLine();
System.out.println("So it looks like what he's got like i dont know a medium potion,a mininum potion and it looks like hes got a shield he never used and a chest plated armor");
enter=x.nextLine();
addArmor(ChestPlate,PlayerArmor);//adding chest plate to player armor bag
System.out.println("Chest Plate has been added to your bag");
enter=x.nextLine();
addDefense(Shield,PlayerDefense);//adding shiled to player defense
System.out.println("A shield has been added to your bag");

addItem(medPotion, PlayerBag);//adding medium potion in playerBag
System.out.println("Medium potions have been added to your bag");

addItem(minPotion, PlayerBag);//adding minPoition playerbag
System.out.println("Mininum potions have been added to your bag");
enter=x.nextLine();
//story 
System.out.println("So as you make your merry way thorugh the forest you notice that your phone also has no bars");
enter= x.nextLine();
System.out.println("I mean for real fam if you don't know by now that this is medieval times then I'm questioning your intelligence");
enter= x.nextLine();
System.out.println("You have finally arrived to an area that resembles a mdeieval times city");
enter= x.nextLine();
System.out.println("a Knight approaches you as you near the gate and starts to inspect your clothes");
enter= x.nextLine();
System.out.println("Knight: Oye what are you wearing, these clothes look unnatural, which kingdoms garmets are you wearing?");

String kingdom;//intialziing string kingdom
kingdom=x.nextLine();
while(kingdom.equals(""))//check to see if kingdom is blank
{
System.out.println("Try again mate don't leave it blank, where are you from");
kingdom=x.nextLine();
}//end of while loop

//story statements
System.out.println(hero.getName()+": Um they are the colors of the kingdom of "+ kingdom);
enter= x.nextLine();
System.out.println("Knight: "+kingdom+" ? were you sent here to aid the cause and fight the dragon that threatnes our sweet kingdom of Kenvil");
enter= x.nextLine();
System.out.println(hero.getName()+": you bet, I'm here to help you fight the dragon. I'm here to speak to your king ");
enter= x.nextLine();
System.out.println("ah why thank you for your support whos your king again?");
String King= x.nextLine();
while(King.equals(""))//checking if string king is blank
{
System.out.println("Try again mate don't leave it blank, whos your king");
King=x.nextLine();
}// end of while loop
enter=x.nextLine();
//story progressing
System.out.println("Why bless the king "+King+" lord momo will thank him and send his gifts to "+kingdom);
System.out.println(hero.getName()+": hey so can we go to the king we have important work to do");
enter= x.nextLine();
System.out.println("Knight:Of course right this way ");
enter= x.nextLine();
System.out.println("As you approached the kings castle, and entered the kings throne room. The knight turns to you and says");
enter= x.nextLine();
System.out.println("Knight: Just make sure when the king asks you who your king is respond by saying the code phrase given by sir "+King);
enter= x.nextLine();
SpaceCreater();
System.out.println("Now you're in a pickle mate what the hell is this code phrase the sir "+King+" gave to you.");
enter= x.nextLine();
System.out.println("Oh right you made this up, good going mate hope the kingdom of "+kingdom+" is real for your sake");
enter=x.nextLine();
System.out.println("Well good luck i'll give you 3 options to guess from. Alright away we go");
enter=x.nextLine();

SpaceCreater();// creating spaces
//story continues
System.out.println("KING: well pleased to make your acquaintance sir "+hero.getName()+" never have i seen a more strange arangements of garments worn by a "+hero.getGender()+"");
enter= x.nextLine();
System.out.println("KING: but anyway I'd like to know who your king is?");
enter= x.nextLine();
SpaceCreater();
System.out.println("ok its go time bud, time to choose one of the three ");
System.out.println("Option 1 the wheels on the bus go round and round");
System.out.println("Option 2 "+King+" is the one and only king");
System.out.println("Option 3 oye mate lovely black plague we're having");
enter= x.nextLine();
System.out.println("tough pick, well hope you get it right. type 1,2 or 3 for the answer");
enter=x.nextLine();

try//try catch block
{
	
int guess =x.nextInt();//int guess 
while(guess>3||guess<1)///while loop checking if guess is 3 or 1
{
	guess=x.nextInt();
}//end of while loop
}//end of try 
catch(InputMismatchException a)
{//start of catch
	System.out.println("try again mate");
}//end of catch
enter= x.nextLine();
SpaceCreater();//creating spaces with space method

//stroy progressing
System.out.println("KING: why I think we have a spy in our mitts, guards aprehend him");
enter= x.nextLine();
System.out.println("The guards come swiftly and grab you and before the execute you the king asks if you have any last request?");
enter= x.nextLine();
System.out.println("you reply by saying that you want a trial by combat and if you win you get to live and walk away.");
enter= x.nextLine();
System.out.println("The king agrees and says if you beat my best knight you get to walk away ");
enter =x.nextLine();
System.out.println("KNIGHT: You are now my opponenet, I will make your death quick");
SpaceCreater();
System.out.println("Wow you are really in a pickle mate, well hopefully you survive. See ya later");
enter= x.nextLine();
addWeapon(Sword,PlayerWeapons);//add sword to playerweapons bag
Fight(Knight);//calling fight method which takes knight enemey
SpaceCreater();//creating spaces with space method
enter= x.nextLine();
//story 
System.out.println("wow holy canolis man you actually killed the knight, not just any knight the best knight kenvil had who was going to fight the dragon ");
enter= x.nextLine();
System.out.println("you're proabably not walking out of this one alive ");
enter= x.nextLine();
System.out.println("well I hope the best for you");
SpaceCreater();
System.out.println("KING: Well it seems like you have doomed us all, you have just killed the only hope to be spared the destruction the dragon will cause");
enter= x.nextLine();
System.out.println("KING: He was the only one that could defeat the dragon and was trained by the ancient monks ");
enter= x.nextLine();
System.out.println("KING: Now that you ahve slain our dragon slayer we will make you fight the dragon. Otherwise I'll just kill you where you stand");
enter= x.nextLine();
System.out.println("KING: Well are you going to cooperate or are you going to die today?");
enter= x.nextLine();
System.out.println("hmmmm well this is a perdicament you either die or fight a dragon....I don't know how you even ended up here. ");
enter= x.nextLine();
System.out.println("Well what are you going to say yes or no to fighting this dragon?");
 String Option=x.nextLine();
yes(Option);//yes method with string option
if(ChoiceMaker==false)//checking boolean ChoiceMaker is if false
{
System.out.println("damn dude thats dark you just give up and not even try to fight for your life and rather just die>");
enter= x.nextLine();
System.out.println("well this is the last time I'll speak to you "+ hero.getName()+" I hope you're happy with this selection");
enter= x.nextLine();
System.out.println("bye-bye now");
enter= x.nextLine();
SpaceCreater();
System.out.println("KING: Ok guards execute the stranger where he stands as an exapmle of what happens when you defy the king");
enter= x.nextLine();
System.out.println("The kings gaurds came at you at full speed and pierced there blades into your chest as if you were the center of a bicycle tire and if their swords where the spokes");
enter= x.nextLine();
System.out.println("you slowly lose all the blood in your body and die");
enter= x.nextLine();
System.exit(0);//exits game
	
}//end of if statemetn

//story statemetns
System.out.println("Well thats the spirit take on that dragon and hope you surive");
enter= x.nextLine();
System.out.println("Dont get yourself scoarched mate you still need to figure out how to get back to your time");
enter= x.nextLine();
System.out.println("King: ok so what ye must do is take thy self and equip yourself with the knights sword and armor.");
enter= x.nextLine();
System.out.println( "Magician: Here "+hero.getName()+" take this drug itll help you its called overkill, use it only when you are in a dire situation. it only works on "+hero.getGender()+" mate");
enter= x.nextLine();
System.out.println("you accept it and smile whole heartedly and it is added to your bag ");
enter= x.nextLine();
hero.setWeapon(Sword);
hero.getWeapon().SetHitAmount(40);
addArmor(PlateLegs,PlayerArmor);//adding platelegs to armor bag
addArmor(Helmet,PlayerArmor);//adding helemet to player armor
addItem(OverKill,PlayerBag);//adding overkill to playerbag

//story statements
enter= x.nextLine();
System.out.println("You are off to fight the dragon good luck mate");
enter= x.nextLine();
System.out.println(" As you approach the dragon, the dragon notice you and say omae wu shinderu, and you respond with NANI!??? ");
enter= x.nextLine();
SpaceCreater();
Fight(Dragon);//calling fight method that uses enemy dragon
SpaceCreater();//making spaces
//story
System.out.println("Wow you actually killed the dragon");
enter= x.nextLine();
System.out.println("alright the game is finished, thats it");
enter= x.nextLine();
System.out.println("theres no way for you to go back to your time");
enter= x.nextLine();
System.out.println("youre gonna live the rest of your life here");
enter= x.nextLine();
System.out.println("Atleast you're a hero here, toodles");
System.exit(0);//exits game
}//end of main method



//start of addDefense method which takes @param weapon called defense and an array bag called playerWeapons2 
//this method adds an item to a bag
private static void addDefense(Weapons defense, ResizableArrayBag<Weapons> playerWeapons2) {
	// TODO Auto-generated method stub
	playerWeapons2.add(defense);
}//end of method


//a method that creates spaces
protected static void SpaceCreater() {
	// TODO Auto-generated method stub
	for(int x=0;x<100;x++)
	{
		System.out.println();
	}
}///end of method


//a method wwhich checks gender takes @param String called gender
private static void genderCheck(String gender) {
	// TODO Auto-generated method stub
	int g=0;//intializing int g
	if(gender.equals("male")||gender.equals("MALE")||gender.equals("Male")||gender.equals("boy")||gender.equals("BOY")||gender.equals("Boy")||gender.equals("m")||gender.equals("M"))
	{
		System.out.println("wow super original gender dude could of been a little creative");
	
	}
	else if(gender.equals("female")||gender.equals("Female")||gender.equals("FEMALE")||gender.equals("F")||gender.equals("f")||gender.equals("girl")||gender.equals("Girl")||gender.equals("GIRL"))
	{
		System.out.println("wow super original gender dudette could of been a little creative");
	
	}
	else
	{
		System.out.println("I didn't even know that was a gender but sure this is a role playing game do whatever you want you a... you "+gender);
		
	}
}//end of method

//start of setPlayer which takes @param String, double, String

public static  void setPlayer(String name, double health,String gender)
{
	Player x = new Player(name, health, gender);//creates player
	
hero =x;//assigns x to hero
}//end of setPalyer

//retuns hero 
public Player getPlayer()
{
	return  hero;
	
}//end of method


//additem method which takes Item object and and a bag which takes Items
public static ResizableArrayBag<Item> addItem(Item item, ResizableArrayBag<Item> bag)
{
	bag.add(item);
	return bag;
}//end of add item.


//Add armor method takes @param armor and a resizableArrayBag which holds Weapons objects
public static ResizableArrayBag<Weapons> addArmor(Weapons item, ResizableArrayBag<Weapons> bag)
{
	bag.add(item);//add item to bag
	return bag;//return bag
}//end of method


//Add armor method takes @param Weapons and a resizableArrayBag which holds Weapons objects

public static ResizableArrayBag<Weapons> addWeapon(Weapons weapon,ResizableArrayBag<Weapons> bag)
{
	bag.add(weapon);//add item to bag
	return bag;//return bag
}//end of method

//yes method which takes @param String called choice and checks if you typed yes or no
public static boolean yes(String Choice)
{
	Scanner x = new Scanner(System.in);

	boolean Confirm;//intiralizing variables
	boolean correct =false;
	while(correct==false)//while statement to check the choice either yes or no
	{
		
	if(Choice.equals("yes")||Choice.equals("Y")||Choice.equals("y")||Choice.equals("YES")||Choice.equals("Yes"))
	{
		//setting and returning true chociemkaker
		ChoiceMaker =true;
		correct=true;
		return ChoiceMaker;
		
	}
	else if(Choice.equals("no")||Choice.equals("N")||Choice.equals("n")||Choice.equals("NO")||Choice.equals("No"))
	{
		//setting false chociemaker
		ChoiceMaker =false;
		correct=true;
		return ChoiceMaker;
	}
	else
	{
		System.out.println("inccorect Selection");
	}
	
	Choice=x.nextLine();
	}
	return ChoiceMaker;
}//end of method

//foght method which is used to fight enemeies in the game and is very important to the gameplay, takes @param Enemy called current enemy
public static void Fight(Enemy CurrentEnemey)
{
	Scanner x = new Scanner(System.in);// intrializing variables used in the method
	String enter;
	while(CurrentEnemey.getHealth()>=0&&hero.getHeatlh()>=0)//while loop making sure health isnt below 0 for either the player or enemy
	{
		int choice = 0;//intitalizing choice variable whihc will decide the menu choice
		boolean w = false;
	while(!w)//while boolean is not false it will run the game
	{
		Weapons currentWep= hero.getWeapon();//equiping heros weapons
System.out.println(currentWep.toString());//letting you know the current weapon
System.out.println("Your current weapon has "+hero.getWeapon().getHitAmount()+" left and your current defense has "+hero.getDefense().getHitAmount()+" left for blockng and taking attacks");
	
System.out.println("press 1 for attack, press 2 to block, press 3 to choose your weapon, press 4 to use an item, press 5 for defensive items, press 6 for equipping armor");//menu
	System.out.println();
	 try{//try catch for choice
	choice=x.nextInt();
	 }
	 catch(InputMismatchException a)
	 {
		    System.out.println("Oye mate thats not a correct selection");

	 }//end of try catch
	x.nextLine();//enter taker
	if(choice>0&&choice<7)//checking if choice is acceptable and valid
	{
		w=true;
	}
	else
	{
		w=false;
	}
	}
	 //choice 1 is an attacking option and will roll random numbers which will determine if the player hits or gets hit by the opponenet
	if(choice==1)
	{
		hero.setATK();//setting hero atak
		hero.Attack(hero.getWeapon().getHitPoints());//assignign hero atk
		double EnemyDFD=CurrentEnemey.Defend(CurrentEnemey.getSided());//assignign enemey defense
		
		if(hero.getATK()>EnemyDFD)//checking if hero roll is greater than enemey roll
		{
			if(hero.getWeapon().getHitAmount()<=0)//checking to see if weapon is broken
			{
				System.out.println("You're weapon has broken, please select a new weapon");
				PlayerWeapons.remove(hero.getWeapon());//removing weapons

				hero.setWeapon(Fist);//setting weapon to fist if weapon is broken
				
				
				
			}
			//decreasing hero weapon points and decreasing enemy life points
			CurrentEnemey.setHealth(CurrentEnemey.getHealth()-hero.Attack(hero.getWeapon().getHitPoints()));
			System.out.println("NOICE mate you hit him and damaged him "+hero.Attack(hero.getWeapon().getHitPoints())+" hit points to his health");
			enter= x.nextLine();
			hero.getWeapon().SetHitAmount(hero.getWeapon().getHitAmount()-1);
		
		}
		//this will make the hero lose hit points and the enemey will ahve no damage
		if(EnemyDFD>hero.getATK())
		{
			double EnemyATK=0;
			if(hero.getWeapon().getHitAmount()<=0)//checking to see if weapon is broken
			{
				System.out.println("You're weapon has broken, please select a new weapon");
				hero.setWeapon(Fist);//removing weapons

				PlayerWeapons.remove(hero.getWeapon());//setting weapon to fist if weapon is broken
				
			}
			while(EnemyATK==0)//same deal as before damage is done to hero 
			{
				EnemyATK=  random.nextInt(CurrentEnemey.getDamage());
			}
			hero.setHealth(hero.getHeatlh()-CurrentEnemey.AttackAction(EnemyATK));
			System.out.println("yikes dude a "+ CurrentEnemey.getName()+" just out smarted you and dodged your attack and dealt ya "+EnemyATK+" damage to your health");
			enter= x.nextLine();
			hero.getWeapon().SetHitAmount(hero.getWeapon().getHitAmount()-1);//setting new hit points
		
		}
	}
	if(choice==2)//choice 2 is blocking
	{
hero.setDEF();//setting hero defense
hero.Defend(hero.getDefense().getHitPoints());//settign hero defense
		double RatATK= CurrentEnemey.Attack(CurrentEnemey.getSided());//setting attack of enemy 
		if(hero.getDEF()>RatATK)//checking to see whos roll is higer
		{
			System.out.println("took no damage mate but you whipped that "+ CurrentEnemey.getName()+" good with your "+hero.getDefense().getName());
			System.out.println("Dealt "+hero.getDefense().getHitPoints()+" damage");
			CurrentEnemey.setHealth(CurrentEnemey.getHealth()-hero.Attack(hero.getDefense().getHitPoints()));
			hero.getDefense().SetHitAmount(hero.getDefense().getHitAmount()-1);//setting hit amount

			enter= x.nextLine();//enter taker
		}//end of if statement
		else//else statement
		{
			hero.getDefense().SetHitAmount(hero.getDefense().getHitAmount()-1);

			System.out.println("you didnt block that well mate");
			hero.setHealth(hero.getHeatlh()-CurrentEnemey.AttackAction(CurrentEnemey.getDefense()));
//wearbles being broken such as armor 
			if(hero.getHelmet()!=Hat)
			{
			hero.getHelmet().SetHitAmount(hero.getHelmet().getHitAmount()-2);
			if(hero.getHelmet().getHitAmount()<=0)
			{
				System.out.println("your helmet is a goner mate");
				hero.wearHelmet(Hat);
			}
			}
			
			
			
			
			if(hero.GetLegs()!=Pants)
			{
			hero.GetLegs().SetHitAmount(hero.GetLegs().getHitAmount()-2);
			if(hero.GetLegs().getHitAmount()<=0)
			{
				System.out.println("your plate legs is a goner mate");
				hero.wearLegs(Pants);

			}
			}
			
			
			
			if(hero.getChestPlate()!=Shirt)
			{
			hero.getChestPlate().SetHitAmount(hero.getChestPlate().getHitAmount()-3);
			if(hero.GetLegs().getHitAmount()<=0)
			{
				System.out.println("your chest plate  is a goner mate");
				
				hero.wearChestPlate(Shirt);

			}
			}
			enter= x.nextLine();
		}
	}
	//choice 3 checks to see if the player wants to choose another weapon if its in his bag
	if(choice==3)
	{ 
		Object[]Weapons=PlayerWeapons.toArray();
		
		//for loop that prints out everything in the bag array
		for(Object weapon : Weapons)
		{
			Weapons hold=(Weapons)weapon;
			System.out.println("weapon name "+hold.getName()+" and it deals this much hit points "+hold.getHitPoints());
		
		}
		
		enter= x.nextLine();
		if(enter.equals(Fist.getName()))//checking to see if it is in the bag
		{
			if(PlayerWeapons.contains(Fist))//sets object to player
			{
			hero.setWeapon(Fist);
			System.out.println("you have selected a "+hero.getWeapon());
			String en= x.nextLine();
			}
		}
		if(enter.equals(Sword.getName()))//checking to see if it is in the bag
		{	
			if(PlayerWeapons.contains(Sword))//sets object to player
		{
		hero.setWeapon(Sword);
		System.out.println("you have selected a "+hero.getWeapon());
		String en= x.nextLine();
		}
			else {
			System.out.println("you dont have a sword");
			}
		}
		if(enter.equals(Dagger.getName()))//checking to see if it is in the bag
		{
			if(PlayerWeapons.contains(Dagger)==true)//checking to see if it is in the bag
			{
			hero.setWeapon(Dagger);//sets object to player
			System.out.println("you have selected a "+hero.getWeapon());
			String en= x.nextLine();
			}
			else {
				System.out.println("you don't have a dagger ya nut");
			}
		}
		enter= x.nextLine();
		System.out.println();
	}
	if(choice==4)
	{
		if(PlayerBag.isEmpty())//checking to see if it is in the bag
		{
			System.out.println("Theres nothing in your Item bag");
			enter=x.nextLine();
		}
		else
		{
		boolean h =false;
		while(h!=true)
		{
	Object[]Item=PlayerBag.toArray();
		
		//for loop that prints out everything in the bag array
		for(Object item : Item)
		{
			Item hold=(Item)item;
			System.out.println(hold.getName()+" "+hold.getHitPoints());
			System.out.println("Item name "+hold.getName()+" and it heals this much hit points "+hold.getHitPoints());

		}
		System.out.println("Select the item you would like to use, please type as it is listed on the screen");
		enter=x.nextLine();
		
		if(enter.equals(minPotion.getName()))//checking to see if it is in the bag
		{
			if(PlayerBag.contains(minPotion)==true)
			{
			hero.setItem(minPotion);//sets object to player
			System.out.println("you have used your min potion");
			enter=x.nextLine();
			
			hero.setHealth(hero.getHeatlh()+minPotion.getHitPoints());
			PlayerBag.remove(minPotion);
			System.out.println("you have healed "+minPotion.getHitPoints()+" you have "+PlayerBag.getFrequencyOf(minPotion)+" left");
			enter=x.nextLine();
			h=true;
			}
			else
			{
			System.out.println("you dont have any mininum potions");
			enter=x.nextLine();
			}
		}
		if(enter.equals(medPotion.getName()))//checking to see if it is in the bag
		{
			if(PlayerBag.contains(medPotion)==true)
			{
			hero.setItem(medPotion);//sets object to player
			System.out.println("you have used your medium potion");
			enter=x.nextLine();
			hero.setHealth(hero.getHeatlh()+medPotion.getHitPoints());
			PlayerBag.remove(medPotion);
			System.out.println("you have healed "+medPotion.getHitPoints()+" you have "+PlayerBag.getFrequencyOf(medPotion)+" left");
			enter=x.nextLine();
			h=true;
			}
			else
			{
			System.out.println("you dont have any medium potions");
			enter=x.nextLine();
			}
		}
		if(enter.equals(fullPotion.getName()))//checking to see if it is in the bag
		{
			if(PlayerBag.contains(fullPotion)==true)
			{
			hero.setItem(fullPotion);//sets object to player
			System.out.println("you have used your full potion");
			enter=x.nextLine();
			hero.setHealth(hero.getHeatlh()+fullPotion.getHitPoints());
			PlayerBag.remove(fullPotion);
			System.out.println("you have healed "+fullPotion.getHitPoints()+" you have "+PlayerBag.getFrequencyOf(fullPotion)+" left");
			enter=x.nextLine();
			h=true;
			}
			else
			{
			System.out.println("you dont have any full potions");
			enter=x.nextLine();
			}
		}
		if(enter.equals(OverKill.getName()))//checking to see if it is in the bag
		{
			if(PlayerBag.contains(OverKill)==true)
			{
			hero.setItem(OverKill);//sets object to player
			System.out.println("you have used your overkill potion");
			enter=x.nextLine();
			hero.setHealth(hero.getHeatlh()+OverKill.getHitPoints());
			PlayerBag.remove(OverKill);
			System.out.println("you have healed "+OverKill.getHitPoints()+" you have "+PlayerBag.getFrequencyOf(OverKill)+" left");
			enter=x.nextLine();
			h=true;
			}
			else
			{
			System.out.println("you dont have any OverKill ");
			enter=x.nextLine();
			}
		}
		if(enter.equals("exit")||enter.equals("EXIT")||enter.equals("Exit"))
		{
			h=true;
		}
		
		
		}
		
		System.out.println();
		}
	}
	if(choice==5)
	{
		Object[]Weapons=PlayerDefense.toArray();
		for(Object defend : Weapons)
		{
			Weapons hold=(Weapons)defend;
			System.out.println(hold.getName()+" "+hold.getHitPoints());
			System.out.println("defensive  name "+hold.getName()+" and it adds "+hold.getHitPoints());

		}
		System.out.println("Select the item you would like to use, please type as it is listed on the screen");
		enter=x.nextLine();
		if(enter.equals(Shield.getName()))//checking to see if it is in the bag
		{
			if(PlayerDefense.contains(Shield)==true)
			{
			hero.setDefense(Shield);//sets object to player
			System.out.println("you have selected the Shield");
			enter=x.nextLine();
			}
			else {
				System.out.println("you don't have a shield ya nut");
				enter=x.nextLine();
			}
		}
		if(enter.equals(CrossArms.getName()))//checking to see if it is in the bag
				{
			if(PlayerDefense.contains(CrossArms)==true)
			{
			hero.setDefense(CrossArms);//sets object to player
			System.out.println("you have selected to cross your arms");
			enter=x.nextLine();
			}
			else {
				System.out.println("you don't have arms ya nut");
				enter=x.nextLine();
			}
				}
	}
	//chosses to equipd armor to player
	if(choice==6)
	{
		Object[]Weapons=PlayerArmor.toArray();
		for(Object defend : Weapons)
		{
			Weapons hold=(Weapons)defend;
			System.out.println(hold.getName()+" "+hold.getHitPoints());
			System.out.println("defensive  name "+hold.getName()+" and it adds "+hold.getHitPoints());

		}
		System.out.println("Select the armor you would like to wear, please type as it is listed on the screen");
		enter=x.nextLine();
		if(enter.equals(ChestPlate.getName()))
		{
			if(PlayerArmor.contains(ChestPlate)==true)
			{
			hero.wearChestPlate(ChestPlate);//sets object to player
			System.out.println("you have selected to wear a Chest Plate");
			hero.setHealth(hero.getHeatlh()+ChestPlate.getHitPoints());
PlayerArmor.remove(ChestPlate);//sets object to player
			enter=x.nextLine();
			}
			else {
				System.out.println("you don't have a Chest Plate ya nut");
				enter=x.nextLine();
			}
		}
		if(enter.equals(PlateLegs.getName()))
		{
			if(PlayerArmor.contains(PlateLegs)==true)
			{
			hero.wearLegs(PlateLegs);//sets object to player
			System.out.println("you have selected to wear Leg Plates");
			hero.setHealth(hero.getHeatlh()+PlateLegs.getHitPoints());
			PlayerArmor.remove(PlateLegs);//sets object to player

			enter=x.nextLine();
			}
			else {
				System.out.println("you don't have a Chest Plate ya nut");
				enter=x.nextLine();
			}
		}
		if(enter.equals(Helmet.getName()))//checking to see if it is in the bag
		{
			if(PlayerArmor.contains(Helmet)==true)
			{
			hero.wearHelmet(Helmet);//sets object to player
			System.out.println("you have selected to wear a helmet");
		hero.setHealth(hero.getHeatlh()+hero.getHelmet().hitPoints);
			enter=x.nextLine();
			PlayerArmor.remove(Helmet);//sets object to player
			}
			else {
				System.out.println("you don't have a Chest Plate ya nut");
				enter=x.nextLine();
			}
		}
	}
	System.out.println("You have "+hero.getHeatlh()+" hitpoints left");
	System.out.println("The "+CurrentEnemey.getName()+" has "+CurrentEnemey.getHealth()+" hitpoints left");
	System.out.println("hit enter to next move selection");
	enter =x.nextLine();
	if(hero.getHeatlh()<=0)//checks hero health
	{
		System.out.println("Christ dude a "+CurrentEnemey.getName()+" killed, I made it impossible for that to happen");
		System.out.println("just stop playing");
		System.exit(0);//to end the game
	}
	if(CurrentEnemey.getHealth()<=0)//checks enemey health
	{
		System.out.println("aye you killed a "+CurrentEnemey.getName()+", hope you feel good about yourself they proabably had a family");
		System.out.println("you murdering psycho. They're family has no provider now");
		enter=x.nextLine();
		hero.setWeapon(Fist);
		hero.getWeapon().SetHitAmount(20);
		hero.setDefense(CrossArms);
		hero.getDefense().SetHitAmount(30);
		break;//to end the fight
		
	}
	
	SpaceCreater();//space creater
	}
}//end of fight method

}//end fo classs

/*
 * roight game aint finsihed. This is the E3 demo, to play the full game you must purchase DLC to fight the dragon

please enter your charecters name

Try again mate don't leave it blank

Try again mate don't leave it blank
yousuf
please enter your charecters gender

male

Your name is yousuf and your gender is male
Are you sure about your selections?  Y/N

y

Ok I guess you have finally created you charecter only took you 1 retries to pick your charecter name and gender





































































































wow super original gender dude could of been a little creative
oh whatever I guess we can start the adventure that you'll be playing hit enter to continue buddy ol pal





































































































Aight so here's what happening,yousuf was walking onto the ccm campus and noticed that there was a weird
looking man was trying to find a young male to travel back in time. He sees you and says 

MAN: my look at you, you little male would you like to step into my machine?  Y/N?

Try again mate don't leave it blank
y

You being a bloody idiot actually stepped into his machine and immediatley passed out from the noxious fumes that were released

The man slips a note in your pocket as your concious begins to fade

You woke up in a forest still foggy minded and unaware of whats going on see a rat four feet tall and wide eating a dead human corpse

you notice that the man is wearing clothes from the 16th century. Then the rat changes focus to you and immediatley charges at you

A bloody fricken rat mate.......I know... I know.. how original just like every other RPG





































































































So I added the weapon Fist for you to use. I dont know how you didn't know how to use them before but they only do
like 5.0 the more you progess the more weapons you'll find and be able to use throughout the game
just punch the rat and don't die mate, aight peace out till I need to do more exposition





































































































A wild rat appears...
what would you like to do?
Fist
Your current weapon has 30.0 left and your current defense has 20.0 left for blockng and taking attacks
press 1 for attack, press 2 to block, press 3 to choose your weapon, press 4 to use an item, press 5 for defensive items, press 6 for equipping armor

1
yikes dude a Rat just out smarted you and dodged your attack and dealt ya 4.0 damage to your health
1
You have 96.0 hitpoints left
The Rat has 20.0 hitpoints left
hit enter to next move selection
1
1



































































































Fist
Your current weapon has 29.0 left and your current defense has 20.0 left for blockng and taking attacks
press 1 for attack, press 2 to block, press 3 to choose your weapon, press 4 to use an item, press 5 for defensive items, press 6 for equipping armor


1You have 96.0 hitpoints left
The Rat has 20.0 hitpoints left
hit enter to next move selection

1



































































































Fist
Your current weapon has 29.0 left and your current defense has 20.0 left for blockng and taking attacks
press 1 for attack, press 2 to block, press 3 to choose your weapon, press 4 to use an item, press 5 for defensive items, press 6 for equipping armor


1yikes dude a Rat just out smarted you and dodged your attack and dealt ya 1.0 damage to your health

You have 95.0 hitpoints left
The Rat has 20.0 hitpoints left
hit enter to next move selection
1




































































































Fist
Your current weapon has 28.0 left and your current defense has 20.0 left for blockng and taking attacks
press 1 for attack, press 2 to block, press 3 to choose your weapon, press 4 to use an item, press 5 for defensive items, press 6 for equipping armor


1
yikes dude a Rat just out smarted you and dodged your attack and dealt ya 4.0 damage to your health

You have 91.0 hitpoints left
The Rat has 20.0 hitpoints left
hit enter to next move selection





































































































Fist
Your current weapon has 27.0 left and your current defense has 20.0 left for blockng and taking attacks
press 1 for attack, press 2 to block, press 3 to choose your weapon, press 4 to use an item, press 5 for defensive items, press 6 for equipping armor

1
NOICE mate you hit him and damaged him 5.0 hit points to his health

You have 91.0 hitpoints left
The Rat has 15.0 hitpoints left
hit enter to next move selection





































































































Fist
Your current weapon has 26.0 left and your current defense has 20.0 left for blockng and taking attacks
press 1 for attack, press 2 to block, press 3 to choose your weapon, press 4 to use an item, press 5 for defensive items, press 6 for equipping armor

1
yikes dude a Rat just out smarted you and dodged your attack and dealt ya 1.0 damage to your health

You have 90.0 hitpoints left
The Rat has 15.0 hitpoints left
hit enter to next move selection





































































































Fist
Your current weapon has 25.0 left and your current defense has 20.0 left for blockng and taking attacks
press 1 for attack, press 2 to block, press 3 to choose your weapon, press 4 to use an item, press 5 for defensive items, press 6 for equipping armor

1
yikes dude a Rat just out smarted you and dodged your attack and dealt ya 4.0 damage to your health

You have 86.0 hitpoints left
The Rat has 15.0 hitpoints left
hit enter to next move selection





































































































Fist
Your current weapon has 24.0 left and your current defense has 20.0 left for blockng and taking attacks
press 1 for attack, press 2 to block, press 3 to choose your weapon, press 4 to use an item, press 5 for defensive items, press 6 for equipping armor

1
NOICE mate you hit him and damaged him 5.0 hit points to his health

You have 86.0 hitpoints left
The Rat has 10.0 hitpoints left
hit enter to next move selection





































































































Fist
Your current weapon has 23.0 left and your current defense has 20.0 left for blockng and taking attacks
press 1 for attack, press 2 to block, press 3 to choose your weapon, press 4 to use an item, press 5 for defensive items, press 6 for equipping armor

1
yikes dude a Rat just out smarted you and dodged your attack and dealt ya 3.0 damage to your health

You have 83.0 hitpoints left
The Rat has 10.0 hitpoints left
hit enter to next move selection





































































































Fist
Your current weapon has 22.0 left and your current defense has 20.0 left for blockng and taking attacks
press 1 for attack, press 2 to block, press 3 to choose your weapon, press 4 to use an item, press 5 for defensive items, press 6 for equipping armor

1
yikes dude a Rat just out smarted you and dodged your attack and dealt ya 1.0 damage to your health

You have 82.0 hitpoints left
The Rat has 10.0 hitpoints left
hit enter to next move selection





































































































Fist
Your current weapon has 21.0 left and your current defense has 20.0 left for blockng and taking attacks
press 1 for attack, press 2 to block, press 3 to choose your weapon, press 4 to use an item, press 5 for defensive items, press 6 for equipping armor

1
NOICE mate you hit him and damaged him 5.0 hit points to his health

You have 82.0 hitpoints left
The Rat has 5.0 hitpoints left
hit enter to next move selection





































































































Fist
Your current weapon has 20.0 left and your current defense has 20.0 left for blockng and taking attacks
press 1 for attack, press 2 to block, press 3 to choose your weapon, press 4 to use an item, press 5 for defensive items, press 6 for equipping armor

2
took no damage mate but you whipped that Rat good with your Crossing your arms
Dealt 10.0 damage

You have 82.0 hitpoints left
The Rat has -5.0 hitpoints left
hit enter to next move selection

aye you killed a Rat, hope you feel good about yourself they proabably had a family
you murdering psycho. They're family has no provider now

would you like to rummage thorugh the corspe of a dead rat?
y
you were curious and decided to rumage through the rats corpse and found a Low Potion it heals 20.0 health points
its been added to your bag





































































































As you recover and get your bearings straight you notice that the world around is familliar yet strange at the same time

you notice that you seem to be where CCM would of been, yet you notice that nothing is constructed

you think to yousrself- Why the hell was tehre a rat that was 4ft tall and wide and why is this dead guy wearing rennisance clothing

you notice that the man has a dagger sticking out of his pocket 

would you like to take his dagger?

Try again mate don't leave it blank
n
ah I see the moral high ground how good of you

As you walk down the forest trying to get to anything that resembles a civilization

You notice a man is watching you and is sneaking around hiding, going tree by tree as he trails you from behind

You lose sight of the man behind you and suddenly he appears infront of you and says.

MAN: oye lad I saw you snooping around a dead mans body and beating a rat off, to death.

Man: As the loyal man of PETA I must stop you before you hurt anymore animals you sicko

A Wild Peta member has appeared and going to bloody murder you
Fist
Your current weapon has 20.0 left and your current defense has 30.0 left for blockng and taking attacks
press 1 for attack, press 2 to block, press 3 to choose your weapon, press 4 to use an item, press 5 for defensive items, press 6 for equipping armor


1
NOICE mate you hit him and damaged him 5.0 hit points to his health

You have 82.0 hitpoints left
The PETA Memeber has 55.0 hitpoints left
hit enter to next move selection





































































































Fist
Your current weapon has 19.0 left and your current defense has 30.0 left for blockng and taking attacks
press 1 for attack, press 2 to block, press 3 to choose your weapon, press 4 to use an item, press 5 for defensive items, press 6 for equipping armor

1
NOICE mate you hit him and damaged him 5.0 hit points to his health

You have 82.0 hitpoints left
The PETA Memeber has 50.0 hitpoints left
hit enter to next move selection





































































































Fist
Your current weapon has 18.0 left and your current defense has 30.0 left for blockng and taking attacks
press 1 for attack, press 2 to block, press 3 to choose your weapon, press 4 to use an item, press 5 for defensive items, press 6 for equipping armor


2
you didnt block that well mate

You have 77.0 hitpoints left
The PETA Memeber has 50.0 hitpoints left
hit enter to next move selection





































































































Fist
Your current weapon has 18.0 left and your current defense has 29.0 left for blockng and taking attacks
press 1 for attack, press 2 to block, press 3 to choose your weapon, press 4 to use an item, press 5 for defensive items, press 6 for equipping armor

1
NOICE mate you hit him and damaged him 5.0 hit points to his health

You have 77.0 hitpoints left
The PETA Memeber has 45.0 hitpoints left
hit enter to next move selection





































































































Fist
Your current weapon has 17.0 left and your current defense has 29.0 left for blockng and taking attacks
press 1 for attack, press 2 to block, press 3 to choose your weapon, press 4 to use an item, press 5 for defensive items, press 6 for equipping armor

1
yikes dude a PETA Memeber just out smarted you and dodged your attack and dealt ya 5.0 damage to your health

You have 72.0 hitpoints left
The PETA Memeber has 45.0 hitpoints left
hit enter to next move selection





































































































Fist
Your current weapon has 16.0 left and your current defense has 29.0 left for blockng and taking attacks
press 1 for attack, press 2 to block, press 3 to choose your weapon, press 4 to use an item, press 5 for defensive items, press 6 for equipping armor

1
yikes dude a PETA Memeber just out smarted you and dodged your attack and dealt ya 1.0 damage to your health

You have 71.0 hitpoints left
The PETA Memeber has 45.0 hitpoints left
hit enter to next move selection





































































































Fist
Your current weapon has 15.0 left and your current defense has 29.0 left for blockng and taking attacks
press 1 for attack, press 2 to block, press 3 to choose your weapon, press 4 to use an item, press 5 for defensive items, press 6 for equipping armor

1
yikes dude a PETA Memeber just out smarted you and dodged your attack and dealt ya 9.0 damage to your health

You have 62.0 hitpoints left
The PETA Memeber has 45.0 hitpoints left
hit enter to next move selection





































































































Fist
Your current weapon has 14.0 left and your current defense has 29.0 left for blockng and taking attacks
press 1 for attack, press 2 to block, press 3 to choose your weapon, press 4 to use an item, press 5 for defensive items, press 6 for equipping armor

12
Fist
Your current weapon has 14.0 left and your current defense has 29.0 left for blockng and taking attacks
press 1 for attack, press 2 to block, press 3 to choose your weapon, press 4 to use an item, press 5 for defensive items, press 6 for equipping armor



2
you didnt block that well mate

You have 57.0 hitpoints left
The PETA Memeber has 45.0 hitpoints left
hit enter to next move selection





































































































Fist
Your current weapon has 14.0 left and your current defense has 28.0 left for blockng and taking attacks
press 1 for attack, press 2 to block, press 3 to choose your weapon, press 4 to use an item, press 5 for defensive items, press 6 for equipping armor

2
took no damage mate but you whipped that PETA Memeber good with your Crossing your arms
Dealt 10.0 damage

You have 57.0 hitpoints left
The PETA Memeber has 35.0 hitpoints left
hit enter to next move selection





































































































Fist
Your current weapon has 14.0 left and your current defense has 27.0 left for blockng and taking attacks
press 1 for attack, press 2 to block, press 3 to choose your weapon, press 4 to use an item, press 5 for defensive items, press 6 for equipping armor

1
yikes dude a PETA Memeber just out smarted you and dodged your attack and dealt ya 9.0 damage to your health

You have 48.0 hitpoints left
The PETA Memeber has 35.0 hitpoints left
hit enter to next move selection





































































































Fist
Your current weapon has 13.0 left and your current defense has 27.0 left for blockng and taking attacks
press 1 for attack, press 2 to block, press 3 to choose your weapon, press 4 to use an item, press 5 for defensive items, press 6 for equipping armor

2
you didnt block that well mate

You have 43.0 hitpoints left
The PETA Memeber has 35.0 hitpoints left
hit enter to next move selection





































































































Fist
Your current weapon has 13.0 left and your current defense has 26.0 left for blockng and taking attacks
press 1 for attack, press 2 to block, press 3 to choose your weapon, press 4 to use an item, press 5 for defensive items, press 6 for equipping armor

2
took no damage mate but you whipped that PETA Memeber good with your Crossing your arms
Dealt 10.0 damage

You have 43.0 hitpoints left
The PETA Memeber has 25.0 hitpoints left
hit enter to next move selection





































































































Fist
Your current weapon has 13.0 left and your current defense has 25.0 left for blockng and taking attacks
press 1 for attack, press 2 to block, press 3 to choose your weapon, press 4 to use an item, press 5 for defensive items, press 6 for equipping armor

2
took no damage mate but you whipped that PETA Memeber good with your Crossing your arms
Dealt 10.0 damage

You have 43.0 hitpoints left
The PETA Memeber has 15.0 hitpoints left
hit enter to next move selection





































































































Fist
Your current weapon has 13.0 left and your current defense has 24.0 left for blockng and taking attacks
press 1 for attack, press 2 to block, press 3 to choose your weapon, press 4 to use an item, press 5 for defensive items, press 6 for equipping armor


1
NOICE mate you hit him and damaged him 5.0 hit points to his health

You have 43.0 hitpoints left
The PETA Memeber has 10.0 hitpoints left
hit enter to next move selection





































































































Fist
Your current weapon has 12.0 left and your current defense has 24.0 left for blockng and taking attacks
press 1 for attack, press 2 to block, press 3 to choose your weapon, press 4 to use an item, press 5 for defensive items, press 6 for equipping armor

2
took no damage mate but you whipped that PETA Memeber good with your Crossing your arms
Dealt 10.0 damage

You have 43.0 hitpoints left
The PETA Memeber has 0.0 hitpoints left
hit enter to next move selection

aye you killed a PETA Memeber, hope you feel good about yourself they proabably had a family
you murdering psycho. They're family has no provider now
1
aye you survived

All it took was murdering a poor thief in the woods

So i'm assuming you're gonna want to take his stuff so lets just add it to your bag ey

So it looks like what he's got like i dont know a medium potion,a mininum potion and it looks like hes got a shield he never used and a chest plated armor

Chest Plate has been added to your bag

A shield has been added to your bag
Medium potions have been added to your bag
Mininum potions have been added to your bag

So as you make your merry way thorugh the forest you notice that your phone also has no bars

I mean for real fam if you don't know by now that this is medieval times then I'm questioning your intelligence

You have finally arrived to an area that resembles a mdeieval times city

a Knight approaches you as you near the gate and starts to inspect your clothes

Knight: Oye what are you wearing, these clothes look unnatural, which kingdoms garmets are you wearing?

Try again mate don't leave it blank, where are you from

Try again mate don't leave it blank, where are you from
ccm
yousuf: Um they are the colors of the kingdom of ccm

Knight: ccm ? were you sent here to aid the cause and fight the dragon that threatnes our sweet kingdom of Kenvil

yousuf: you bet, I'm here to help you fight the dragon. I'm here to speak to your king 

ah why thank you for your support whos your king again?
panther the cat

Why bless the king panther the cat lord momo will thank him and send his gifts to ccm
yousuf: hey so can we go to the king we have important work to do

Knight:Of course right this way 

As you approached the kings castle, and entered the kings throne room. The knight turns to you and says

Knight: Just make sure when the king asks you who your king is respond by saying the code phrase given by sir panther the cat





































































































Now you're in a pickle mate what the hell is this code phrase the sir panther the cat gave to you.

Oh right you made this up, good going mate hope the kingdom of ccm is real for your sake

Well good luck i'll give you 3 options to guess from. Alright away we go





































































































KING: well pleased to make your acquaintance sir yousuf never have i seen a more strange arangements of garments worn by a male

KING: but anyway I'd like to know who your king is?





































































































ok its go time bud, time to choose one of the three 
Option 1 the wheels on the bus go round and round
Option 2 panther the cat is the one and only king
Option 3 oye mate lovely black plague we're having

tough pick, well hope you get it right. type 1,2 or 3 for the answer
1



2




































































































KING: why I think we have a spy in our mitts, guards aprehend him

The guards come swiftly and grab you and before the execute you the king asks if you have any last request?

you reply by saying that you want a trial by combat and if you win you get to live and walk away.

The king agrees and says if you beat my best knight you get to walk away 

KNIGHT: You are now my opponenet, I will make your death quick




































































































Wow you are really in a pickle mate, well hopefully you survive. See ya later

Fist
Your current weapon has 20.0 left and your current defense has 30.0 left for blockng and taking attacks
press 1 for attack, press 2 to block, press 3 to choose your weapon, press 4 to use an item, press 5 for defensive items, press 6 for equipping armor

4
Low Potion 20.0
Item name Low Potion and it heals this much hit points 20.0
Medium Potion 50.0
Item name Medium Potion and it heals this much hit points 50.0
Low Potion 20.0
Item name Low Potion and it heals this much hit points 20.0
Select the item you would like to use, please type as it is listed on the screen
Low Potion
you have used your min potion

you have healed 20.0 you have 1 left


You have 63.0 hitpoints left
The Knight has 100.0 hitpoints left
hit enter to next move selection





































































































Fist
Your current weapon has 20.0 left and your current defense has 30.0 left for blockng and taking attacks
press 1 for attack, press 2 to block, press 3 to choose your weapon, press 4 to use an item, press 5 for defensive items, press 6 for equipping armor

3
weapon name Fist and it deals this much hit points 5.0
weapon name Sword and it deals this much hit points 20.0
Sword
you have selected a Sword



You have 63.0 hitpoints left
The Knight has 100.0 hitpoints left
hit enter to next move selection





































































































Sword
Your current weapon has 15.0 left and your current defense has 30.0 left for blockng and taking attacks
press 1 for attack, press 2 to block, press 3 to choose your weapon, press 4 to use an item, press 5 for defensive items, press 6 for equipping armor

5
Crossing your arms 10.0
defensive  name Crossing your arms and it adds 10.0
Shield 25.0
defensive  name Shield and it adds 25.0
Select the item you would like to use, please type as it is listed on the screen
Shield
you have selected the Shield

You have 63.0 hitpoints left
The Knight has 100.0 hitpoints left
hit enter to next move selection





































































































Sword
Your current weapon has 15.0 left and your current defense has 20.0 left for blockng and taking attacks
press 1 for attack, press 2 to block, press 3 to choose your weapon, press 4 to use an item, press 5 for defensive items, press 6 for equipping armor

4
Low Potion 20.0
Item name Low Potion and it heals this much hit points 20.0
Medium Potion 50.0
Item name Medium Potion and it heals this much hit points 50.0
Select the item you would like to use, please type as it is listed on the screen
Medium Potion
you have used your medium potion

you have healed 50.0 you have 0 left


You have 113.0 hitpoints left
The Knight has 100.0 hitpoints left
hit enter to next move selection





































































































Sword
Your current weapon has 15.0 left and your current defense has 20.0 left for blockng and taking attacks
press 1 for attack, press 2 to block, press 3 to choose your weapon, press 4 to use an item, press 5 for defensive items, press 6 for equipping armor

4
Low Potion 20.0
Item name Low Potion and it heals this much hit points 20.0
Select the item you would like to use, please type as it is listed on the screen
Low Potion
you have used your min potion

you have healed 20.0 you have 0 left


You have 133.0 hitpoints left
The Knight has 100.0 hitpoints left
hit enter to next move selection





































































































Sword
Your current weapon has 15.0 left and your current defense has 20.0 left for blockng and taking attacks
press 1 for attack, press 2 to block, press 3 to choose your weapon, press 4 to use an item, press 5 for defensive items, press 6 for equipping armor

6
Chest Plate 50.0
defensive  name Chest Plate and it adds 50.0
Select the armor you would like to wear, please type as it is listed on the screen
Chest Plate
you have selected to wear a Chest Plate

You have 183.0 hitpoints left
The Knight has 100.0 hitpoints left
hit enter to next move selection





































































































Sword
Your current weapon has 15.0 left and your current defense has 20.0 left for blockng and taking attacks
press 1 for attack, press 2 to block, press 3 to choose your weapon, press 4 to use an item, press 5 for defensive items, press 6 for equipping armor

1
NOICE mate you hit him and damaged him 20.0 hit points to his health

You have 183.0 hitpoints left
The Knight has 80.0 hitpoints left
hit enter to next move selection





































































































Sword
Your current weapon has 14.0 left and your current defense has 20.0 left for blockng and taking attacks
press 1 for attack, press 2 to block, press 3 to choose your weapon, press 4 to use an item, press 5 for defensive items, press 6 for equipping armor

1
yikes dude a Knight just out smarted you and dodged your attack and dealt ya 19.0 damage to your health

You have 164.0 hitpoints left
The Knight has 80.0 hitpoints left
hit enter to next move selection





































































































Sword
Your current weapon has 13.0 left and your current defense has 20.0 left for blockng and taking attacks
press 1 for attack, press 2 to block, press 3 to choose your weapon, press 4 to use an item, press 5 for defensive items, press 6 for equipping armor

2
took no damage mate but you whipped that Knight good with your Shield
Dealt 25.0 damage

You have 164.0 hitpoints left
The Knight has 55.0 hitpoints left
hit enter to next move selection





































































































Sword
Your current weapon has 13.0 left and your current defense has 19.0 left for blockng and taking attacks
press 1 for attack, press 2 to block, press 3 to choose your weapon, press 4 to use an item, press 5 for defensive items, press 6 for equipping armor

2
took no damage mate but you whipped that Knight good with your Shield
Dealt 25.0 damage

You have 164.0 hitpoints left
The Knight has 30.0 hitpoints left
hit enter to next move selection





































































































Sword
Your current weapon has 13.0 left and your current defense has 18.0 left for blockng and taking attacks
press 1 for attack, press 2 to block, press 3 to choose your weapon, press 4 to use an item, press 5 for defensive items, press 6 for equipping armor

2
you didnt block that well mate

You have 149.0 hitpoints left
The Knight has 30.0 hitpoints left
hit enter to next move selection





































































































Sword
Your current weapon has 13.0 left and your current defense has 17.0 left for blockng and taking attacks
press 1 for attack, press 2 to block, press 3 to choose your weapon, press 4 to use an item, press 5 for defensive items, press 6 for equipping armor

1
yikes dude a Knight just out smarted you and dodged your attack and dealt ya 7.0 damage to your health

You have 142.0 hitpoints left
The Knight has 30.0 hitpoints left
hit enter to next move selection





































































































Sword
Your current weapon has 12.0 left and your current defense has 17.0 left for blockng and taking attacks
press 1 for attack, press 2 to block, press 3 to choose your weapon, press 4 to use an item, press 5 for defensive items, press 6 for equipping armor

2
you didnt block that well mate

You have 127.0 hitpoints left
The Knight has 30.0 hitpoints left
hit enter to next move selection





































































































Sword
Your current weapon has 12.0 left and your current defense has 16.0 left for blockng and taking attacks
press 1 for attack, press 2 to block, press 3 to choose your weapon, press 4 to use an item, press 5 for defensive items, press 6 for equipping armor

1
NOICE mate you hit him and damaged him 20.0 hit points to his health

You have 127.0 hitpoints left
The Knight has 10.0 hitpoints left
hit enter to next move selection





































































































Sword
Your current weapon has 11.0 left and your current defense has 16.0 left for blockng and taking attacks
press 1 for attack, press 2 to block, press 3 to choose your weapon, press 4 to use an item, press 5 for defensive items, press 6 for equipping armor

2
you didnt block that well mate

You have 112.0 hitpoints left
The Knight has 10.0 hitpoints left
hit enter to next move selection





































































































Sword
Your current weapon has 11.0 left and your current defense has 15.0 left for blockng and taking attacks
press 1 for attack, press 2 to block, press 3 to choose your weapon, press 4 to use an item, press 5 for defensive items, press 6 for equipping armor

1
NOICE mate you hit him and damaged him 20.0 hit points to his health

You have 112.0 hitpoints left
The Knight has -10.0 hitpoints left
hit enter to next move selection

aye you killed a Knight, hope you feel good about yourself they proabably had a family
you murdering psycho. They're family has no provider now






































































































wow holy canolis man you actually killed the knight, not just any knight the best knight kenvil had who was going to fight the dragon 

you're proabably not walking out of this one alive 

well I hope the best for you




































































































KING: Well it seems like you have doomed us all, you have just killed the only hope to be spared the destruction the dragon will cause

KING: He was the only one that could defeat the dragon and was trained by the ancient monks 

KING: Now that you ahve slain our dragon slayer we will make you fight the dragon. Otherwise I'll just kill you where you stand

KING: Well are you going to cooperate or are you going to die today?

hmmmm well this is a perdicament you either die or fight a dragon....I don't know how you even ended up here. 

Well what are you going to say yes or no to fighting this dragon?
yes
Well thats the spirit take on that dragon and hope you surive

Dont get yourself scoarched mate you still need to figure out how to get back to your time

King: ok so what ye must do is take thy self and equip yourself with the knights sword and armor.

Magician: Here yousuf take this drug itll help you its called overkill, use it only when you are in a dire situation. it only works on male mate

you accept it and smile whole heartedly and it is added to your bag 


You are off to fight the dragon good luck mate

 As you approach the dragon, the dragon notice you and say omae wu shinderu, and you respond with NANI!??? 





































































































Fist
Your current weapon has 20.0 left and your current defense has 30.0 left for blockng and taking attacks
press 1 for attack, press 2 to block, press 3 to choose your weapon, press 4 to use an item, press 5 for defensive items, press 6 for equipping armor

4
OverKill 300.0
Item name OverKill and it heals this much hit points 300.0
Select the item you would like to use, please type as it is listed on the screen
overKill
OverKill 300.0
Item name OverKill and it heals this much hit points 300.0
Select the item you would like to use, please type as it is listed on the screen
OverKill
you have used your overkill potion

you have healed 300.0 you have 0 left


You have 412.0 hitpoints left
The Dragon has 500.0 hitpoints left
hit enter to next move selection





































































































Fist
Your current weapon has 20.0 left and your current defense has 30.0 left for blockng and taking attacks
press 1 for attack, press 2 to block, press 3 to choose your weapon, press 4 to use an item, press 5 for defensive items, press 6 for equipping armor

1
NOICE mate you hit him and damaged him 5.0 hit points to his health

You have 412.0 hitpoints left
The Dragon has 495.0 hitpoints left
hit enter to next move selection





































































































Fist
Your current weapon has 19.0 left and your current defense has 30.0 left for blockng and taking attacks
press 1 for attack, press 2 to block, press 3 to choose your weapon, press 4 to use an item, press 5 for defensive items, press 6 for equipping armor

1
yikes dude a Dragon just out smarted you and dodged your attack and dealt ya 14.0 damage to your health

You have 398.0 hitpoints left
The Dragon has 495.0 hitpoints left
hit enter to next move selection





































































































Fist
Your current weapon has 18.0 left and your current defense has 30.0 left for blockng and taking attacks
press 1 for attack, press 2 to block, press 3 to choose your weapon, press 4 to use an item, press 5 for defensive items, press 6 for equipping armor

1
NOICE mate you hit him and damaged him 5.0 hit points to his health

You have 398.0 hitpoints left
The Dragon has 490.0 hitpoints left
hit enter to next move selection





































































































Fist
Your current weapon has 17.0 left and your current defense has 30.0 left for blockng and taking attacks
press 1 for attack, press 2 to block, press 3 to choose your weapon, press 4 to use an item, press 5 for defensive items, press 6 for equipping armor


1
yikes dude a Dragon just out smarted you and dodged your attack and dealt ya 28.0 damage to your health

You have 370.0 hitpoints left
The Dragon has 490.0 hitpoints left
hit enter to next move selection





































































































Fist
Your current weapon has 16.0 left and your current defense has 30.0 left for blockng and taking attacks
press 1 for attack, press 2 to block, press 3 to choose your weapon, press 4 to use an item, press 5 for defensive items, press 6 for equipping armor

1
NOICE mate you hit him and damaged him 5.0 hit points to his health

You have 370.0 hitpoints left
The Dragon has 485.0 hitpoints left
hit enter to next move selection





































































































Fist
Your current weapon has 15.0 left and your current defense has 30.0 left for blockng and taking attacks
press 1 for attack, press 2 to block, press 3 to choose your weapon, press 4 to use an item, press 5 for defensive items, press 6 for equipping armor

1
yikes dude a Dragon just out smarted you and dodged your attack and dealt ya 1.0 damage to your health

You have 369.0 hitpoints left
The Dragon has 485.0 hitpoints left
hit enter to next move selection





































































































Fist
Your current weapon has 14.0 left and your current defense has 30.0 left for blockng and taking attacks
press 1 for attack, press 2 to block, press 3 to choose your weapon, press 4 to use an item, press 5 for defensive items, press 6 for equipping armor

1
NOICE mate you hit him and damaged him 5.0 hit points to his health

You have 369.0 hitpoints left
The Dragon has 480.0 hitpoints left
hit enter to next move selection





































































































Fist
Your current weapon has 13.0 left and your current defense has 30.0 left for blockng and taking attacks
press 1 for attack, press 2 to block, press 3 to choose your weapon, press 4 to use an item, press 5 for defensive items, press 6 for equipping armor

1
NOICE mate you hit him and damaged him 5.0 hit points to his health

You have 369.0 hitpoints left
The Dragon has 475.0 hitpoints left
hit enter to next move selection





































































































Fist
Your current weapon has 12.0 left and your current defense has 30.0 left for blockng and taking attacks
press 1 for attack, press 2 to block, press 3 to choose your weapon, press 4 to use an item, press 5 for defensive items, press 6 for equipping armor

1
yikes dude a Dragon just out smarted you and dodged your attack and dealt ya 12.0 damage to your health

You have 357.0 hitpoints left
The Dragon has 475.0 hitpoints left
hit enter to next move selection





































































































Fist
Your current weapon has 11.0 left and your current defense has 30.0 left for blockng and taking attacks
press 1 for attack, press 2 to block, press 3 to choose your weapon, press 4 to use an item, press 5 for defensive items, press 6 for equipping armor

1
NOICE mate you hit him and damaged him 5.0 hit points to his health

You have 357.0 hitpoints left
The Dragon has 470.0 hitpoints left
hit enter to next move selection





































































































Fist
Your current weapon has 10.0 left and your current defense has 30.0 left for blockng and taking attacks
press 1 for attack, press 2 to block, press 3 to choose your weapon, press 4 to use an item, press 5 for defensive items, press 6 for equipping armor

1
yikes dude a Dragon just out smarted you and dodged your attack and dealt ya 14.0 damage to your health

You have 343.0 hitpoints left
The Dragon has 470.0 hitpoints left
hit enter to next move selection





































































































Fist
Your current weapon has 9.0 left and your current defense has 30.0 left for blockng and taking attacks
press 1 for attack, press 2 to block, press 3 to choose your weapon, press 4 to use an item, press 5 for defensive items, press 6 for equipping armor

1
NOICE mate you hit him and damaged him 5.0 hit points to his health

You have 343.0 hitpoints left
The Dragon has 465.0 hitpoints left
hit enter to next move selection





































































































Fist
Your current weapon has 8.0 left and your current defense has 30.0 left for blockng and taking attacks
press 1 for attack, press 2 to block, press 3 to choose your weapon, press 4 to use an item, press 5 for defensive items, press 6 for equipping armor

1
yikes dude a Dragon just out smarted you and dodged your attack and dealt ya 16.0 damage to your health

You have 327.0 hitpoints left
The Dragon has 465.0 hitpoints left
hit enter to next move selection





































































































Fist
Your current weapon has 7.0 left and your current defense has 30.0 left for blockng and taking attacks
press 1 for attack, press 2 to block, press 3 to choose your weapon, press 4 to use an item, press 5 for defensive items, press 6 for equipping armor

1
NOICE mate you hit him and damaged him 5.0 hit points to his health

You have 327.0 hitpoints left
The Dragon has 460.0 hitpoints left
hit enter to next move selection





































































































Fist
Your current weapon has 6.0 left and your current defense has 30.0 left for blockng and taking attacks
press 1 for attack, press 2 to block, press 3 to choose your weapon, press 4 to use an item, press 5 for defensive items, press 6 for equipping armor

1
yikes dude a Dragon just out smarted you and dodged your attack and dealt ya 8.0 damage to your health

You have 319.0 hitpoints left
The Dragon has 460.0 hitpoints left
hit enter to next move selection





































































































Fist
Your current weapon has 5.0 left and your current defense has 30.0 left for blockng and taking attacks
press 1 for attack, press 2 to block, press 3 to choose your weapon, press 4 to use an item, press 5 for defensive items, press 6 for equipping armor

2
took no damage mate but you whipped that Dragon good with your Crossing your arms
Dealt 10.0 damage

You have 319.0 hitpoints left
The Dragon has 450.0 hitpoints left
hit enter to next move selection





































































































Fist
Your current weapon has 5.0 left and your current defense has 29.0 left for blockng and taking attacks
press 1 for attack, press 2 to block, press 3 to choose your weapon, press 4 to use an item, press 5 for defensive items, press 6 for equipping armor

2
you didnt block that well mate

You have 294.0 hitpoints left
The Dragon has 450.0 hitpoints left
hit enter to next move selection





































































































Fist
Your current weapon has 5.0 left and your current defense has 28.0 left for blockng and taking attacks
press 1 for attack, press 2 to block, press 3 to choose your weapon, press 4 to use an item, press 5 for defensive items, press 6 for equipping armor

1
NOICE mate you hit him and damaged him 5.0 hit points to his health

You have 294.0 hitpoints left
The Dragon has 445.0 hitpoints left
hit enter to next move selection





































































































Fist
Your current weapon has 4.0 left and your current defense has 28.0 left for blockng and taking attacks
press 1 for attack, press 2 to block, press 3 to choose your weapon, press 4 to use an item, press 5 for defensive items, press 6 for equipping armor

1
NOICE mate you hit him and damaged him 5.0 hit points to his health

You have 294.0 hitpoints left
The Dragon has 440.0 hitpoints left
hit enter to next move selection





































































































Fist
Your current weapon has 3.0 left and your current defense has 28.0 left for blockng and taking attacks
press 1 for attack, press 2 to block, press 3 to choose your weapon, press 4 to use an item, press 5 for defensive items, press 6 for equipping armor

2
you didnt block that well mate

You have 269.0 hitpoints left
The Dragon has 440.0 hitpoints left
hit enter to next move selection





































































































Fist
Your current weapon has 3.0 left and your current defense has 27.0 left for blockng and taking attacks
press 1 for attack, press 2 to block, press 3 to choose your weapon, press 4 to use an item, press 5 for defensive items, press 6 for equipping armor

1
yikes dude a Dragon just out smarted you and dodged your attack and dealt ya 5.0 damage to your health

You have 264.0 hitpoints left
The Dragon has 440.0 hitpoints left
hit enter to next move selection





































































































Fist
Your current weapon has 2.0 left and your current defense has 27.0 left for blockng and taking attacks
press 1 for attack, press 2 to block, press 3 to choose your weapon, press 4 to use an item, press 5 for defensive items, press 6 for equipping armor

1
yikes dude a Dragon just out smarted you and dodged your attack and dealt ya 13.0 damage to your health

You have 251.0 hitpoints left
The Dragon has 440.0 hitpoints left
hit enter to next move selection





































































































Fist
Your current weapon has 1.0 left and your current defense has 27.0 left for blockng and taking attacks
press 1 for attack, press 2 to block, press 3 to choose your weapon, press 4 to use an item, press 5 for defensive items, press 6 for equipping armor

2
took no damage mate but you whipped that Dragon good with your Crossing your arms
Dealt 10.0 damage

You have 251.0 hitpoints left
The Dragon has 430.0 hitpoints left
hit enter to next move selection





































































































Fist
Your current weapon has 1.0 left and your current defense has 26.0 left for blockng and taking attacks
press 1 for attack, press 2 to block, press 3 to choose your weapon, press 4 to use an item, press 5 for defensive items, press 6 for equipping armor

1
yikes dude a Dragon just out smarted you and dodged your attack and dealt ya 9.0 damage to your health

You have 242.0 hitpoints left
The Dragon has 430.0 hitpoints left
hit enter to next move selection





































































































Fist
Your current weapon has 0.0 left and your current defense has 26.0 left for blockng and taking attacks
press 1 for attack, press 2 to block, press 3 to choose your weapon, press 4 to use an item, press 5 for defensive items, press 6 for equipping armor

3
weapon name Fist and it deals this much hit points 5.0
weapon name Sword and it deals this much hit points 20.0
weapon name Sword and it deals this much hit points 20.0
Sword
you have selected a Sword



You have 242.0 hitpoints left
The Dragon has 430.0 hitpoints left
hit enter to next move selection





































































































Sword
Your current weapon has 10.0 left and your current defense has 26.0 left for blockng and taking attacks
press 1 for attack, press 2 to block, press 3 to choose your weapon, press 4 to use an item, press 5 for defensive items, press 6 for equipping armor

1
yikes dude a Dragon just out smarted you and dodged your attack and dealt ya 16.0 damage to your health

You have 226.0 hitpoints left
The Dragon has 430.0 hitpoints left
hit enter to next move selection





































































































Sword
Your current weapon has 9.0 left and your current defense has 26.0 left for blockng and taking attacks
press 1 for attack, press 2 to block, press 3 to choose your weapon, press 4 to use an item, press 5 for defensive items, press 6 for equipping armor

1
NOICE mate you hit him and damaged him 20.0 hit points to his health

You have 226.0 hitpoints left
The Dragon has 410.0 hitpoints left
hit enter to next move selection





































































































Sword
Your current weapon has 8.0 left and your current defense has 26.0 left for blockng and taking attacks
press 1 for attack, press 2 to block, press 3 to choose your weapon, press 4 to use an item, press 5 for defensive items, press 6 for equipping armor

1
NOICE mate you hit him and damaged him 20.0 hit points to his health

You have 226.0 hitpoints left
The Dragon has 390.0 hitpoints left
hit enter to next move selection





































































































Sword
Your current weapon has 7.0 left and your current defense has 26.0 left for blockng and taking attacks
press 1 for attack, press 2 to block, press 3 to choose your weapon, press 4 to use an item, press 5 for defensive items, press 6 for equipping armor

1
yikes dude a Dragon just out smarted you and dodged your attack and dealt ya 10.0 damage to your health

You have 216.0 hitpoints left
The Dragon has 390.0 hitpoints left
hit enter to next move selection





































































































Sword
Your current weapon has 6.0 left and your current defense has 26.0 left for blockng and taking attacks
press 1 for attack, press 2 to block, press 3 to choose your weapon, press 4 to use an item, press 5 for defensive items, press 6 for equipping armor

1
yikes dude a Dragon just out smarted you and dodged your attack and dealt ya 19.0 damage to your health

You have 197.0 hitpoints left
The Dragon has 390.0 hitpoints left
hit enter to next move selection





































































































Sword
Your current weapon has 5.0 left and your current defense has 26.0 left for blockng and taking attacks
press 1 for attack, press 2 to block, press 3 to choose your weapon, press 4 to use an item, press 5 for defensive items, press 6 for equipping armor

1
yikes dude a Dragon just out smarted you and dodged your attack and dealt ya 13.0 damage to your health

You have 184.0 hitpoints left
The Dragon has 390.0 hitpoints left
hit enter to next move selection





































































































Sword
Your current weapon has 4.0 left and your current defense has 26.0 left for blockng and taking attacks
press 1 for attack, press 2 to block, press 3 to choose your weapon, press 4 to use an item, press 5 for defensive items, press 6 for equipping armor

2
you didnt block that well mate

You have 159.0 hitpoints left
The Dragon has 390.0 hitpoints left
hit enter to next move selection





































































































Sword
Your current weapon has 4.0 left and your current defense has 25.0 left for blockng and taking attacks
press 1 for attack, press 2 to block, press 3 to choose your weapon, press 4 to use an item, press 5 for defensive items, press 6 for equipping armor

2
you didnt block that well mate

You have 134.0 hitpoints left
The Dragon has 390.0 hitpoints left
hit enter to next move selection





































































































Sword
Your current weapon has 4.0 left and your current defense has 24.0 left for blockng and taking attacks
press 1 for attack, press 2 to block, press 3 to choose your weapon, press 4 to use an item, press 5 for defensive items, press 6 for equipping armor

1
yikes dude a Dragon just out smarted you and dodged your attack and dealt ya 15.0 damage to your health

You have 119.0 hitpoints left
The Dragon has 390.0 hitpoints left
hit enter to next move selection





































































































Sword
Your current weapon has 3.0 left and your current defense has 24.0 left for blockng and taking attacks
press 1 for attack, press 2 to block, press 3 to choose your weapon, press 4 to use an item, press 5 for defensive items, press 6 for equipping armor

2
you didnt block that well mate

You have 94.0 hitpoints left
The Dragon has 390.0 hitpoints left
hit enter to next move selection





































































































Sword
Your current weapon has 3.0 left and your current defense has 23.0 left for blockng and taking attacks
press 1 for attack, press 2 to block, press 3 to choose your weapon, press 4 to use an item, press 5 for defensive items, press 6 for equipping armor

1
NOICE mate you hit him and damaged him 20.0 hit points to his health

You have 94.0 hitpoints left
The Dragon has 370.0 hitpoints left
hit enter to next move selection





































































































Sword
Your current weapon has 2.0 left and your current defense has 23.0 left for blockng and taking attacks
press 1 for attack, press 2 to block, press 3 to choose your weapon, press 4 to use an item, press 5 for defensive items, press 6 for equipping armor

1
NOICE mate you hit him and damaged him 20.0 hit points to his health

You have 94.0 hitpoints left
The Dragon has 350.0 hitpoints left
hit enter to next move selection





































































































Sword
Your current weapon has 1.0 left and your current defense has 23.0 left for blockng and taking attacks
press 1 for attack, press 2 to block, press 3 to choose your weapon, press 4 to use an item, press 5 for defensive items, press 6 for equipping armor

1
yikes dude a Dragon just out smarted you and dodged your attack and dealt ya 26.0 damage to your health

You have 68.0 hitpoints left
The Dragon has 350.0 hitpoints left
hit enter to next move selection





































































































Sword
Your current weapon has 0.0 left and your current defense has 23.0 left for blockng and taking attacks
press 1 for attack, press 2 to block, press 3 to choose your weapon, press 4 to use an item, press 5 for defensive items, press 6 for equipping armor

2
you didnt block that well mate

You have 43.0 hitpoints left
The Dragon has 350.0 hitpoints left
hit enter to next move selection





































































































Sword
Your current weapon has 0.0 left and your current defense has 22.0 left for blockng and taking attacks
press 1 for attack, press 2 to block, press 3 to choose your weapon, press 4 to use an item, press 5 for defensive items, press 6 for equipping armor

1
You're weapon has broken, please select a new weapon
yikes dude a Dragon just out smarted you and dodged your attack and dealt ya 23.0 damage to your health

You have 20.0 hitpoints left
The Dragon has 350.0 hitpoints left
hit enter to next move selection





































































































Fist
Your current weapon has -1.0 left and your current defense has 22.0 left for blockng and taking attacks
press 1 for attack, press 2 to block, press 3 to choose your weapon, press 4 to use an item, press 5 for defensive items, press 6 for equipping armor

3
weapon name Sword and it deals this much hit points 20.0
weapon name Sword and it deals this much hit points 20.0
Sword
you have selected a Sword



You have 20.0 hitpoints left
The Dragon has 350.0 hitpoints left
hit enter to next move selection





































































































Sword
Your current weapon has 0.0 left and your current defense has 22.0 left for blockng and taking attacks
press 1 for attack, press 2 to block, press 3 to choose your weapon, press 4 to use an item, press 5 for defensive items, press 6 for equipping armor

1
You're weapon has broken, please select a new weapon
yikes dude a Dragon just out smarted you and dodged your attack and dealt ya 5.0 damage to your health

You have 15.0 hitpoints left
The Dragon has 350.0 hitpoints left
hit enter to next move selection





































































































Fist
Your current weapon has -2.0 left and your current defense has 22.0 left for blockng and taking attacks
press 1 for attack, press 2 to block, press 3 to choose your weapon, press 4 to use an item, press 5 for defensive items, press 6 for equipping armor

3
weapon name Sword and it deals this much hit points 20.0
weapon name Sword and it deals this much hit points 20.0

exit

You have 15.0 hitpoints left
The Dragon has 350.0 hitpoints left
hit enter to next move selection





































































































Fist
Your current weapon has -2.0 left and your current defense has 22.0 left for blockng and taking attacks
press 1 for attack, press 2 to block, press 3 to choose your weapon, press 4 to use an item, press 5 for defensive items, press 6 for equipping armor

1
You're weapon has broken, please select a new weapon
yikes dude a Dragon just out smarted you and dodged your attack and dealt ya 7.0 damage to your health

You have 8.0 hitpoints left
The Dragon has 350.0 hitpoints left
hit enter to next move selection





































































































Fist
Your current weapon has -3.0 left and your current defense has 22.0 left for blockng and taking attacks
press 1 for attack, press 2 to block, press 3 to choose your weapon, press 4 to use an item, press 5 for defensive items, press 6 for equipping armor

2
took no damage mate but you whipped that Dragon good with your Crossing your arms
Dealt 10.0 damage

You have 8.0 hitpoints left
The Dragon has 340.0 hitpoints left
hit enter to next move selection





































































































Fist
Your current weapon has -3.0 left and your current defense has 21.0 left for blockng and taking attacks
press 1 for attack, press 2 to block, press 3 to choose your weapon, press 4 to use an item, press 5 for defensive items, press 6 for equipping armor

2
you didnt block that well mate

You have -17.0 hitpoints left
The Dragon has 340.0 hitpoints left
hit enter to next move selection

Christ dude a Dragon killed, I made it impossible for that to happen
just stop playing
 

I decreased the dragons health after this game play becasue it was impossible to win 
*/