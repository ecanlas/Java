public class Basketball implements GamePresets{

public Object[] redTeam;
public Object[] blueTeam;


	public Object[] redTeam(Player player){
		player( "Ron", "12");
		player( "Zugor", "33");
		player( "Jordan", "23");
		player( "Kobe" , "24");
		player( "Muran", "2");
	}

	public Object[] blueTeam(Player player){
		player( "Zn", "34");
		player( "Chi", "33");
		player( "Dudu", "23");
		player( "Shaq" , "11");
		player( "Kohr", "22");
	}


	public void Gameplay(){


	}

	redTeamScores int redScore(blueBasket, ball){
	if(blueBasket + ball == true){
		redScore + ballAirTime;
		}
		return redScore;
	}


	blueTeamScores int blueScore(redBasket, ball){
	if(redBasket + ball == true){
		blueScore + ballAirTime;
		}
		return blueScore;
	}


}


// A game needs Players so I will make a class that will make players
	//This is a POJO "Plain Old Java Object"
public class Player {
	//A player needs a name
	private String playerName;
	//A player needs a number
	private String playerNumber;
	//We are making these private because we only want to use them inside the Player class
	//First we have to register players with their own name and number to Identify them
	//Now create a constructor that takes in a name and a number so that you won't have to set a name and number each time you want a new player
	public Player(String playerName, String playerNumber ){
		this.playerName = playerName;
		this.playerNumber = playerNumber;	
		}
	 /*So when making a POJO Java actually has a default Constructor for each class. Now that we created a parameterized constructor 
	 we won't have the default public Player(){}; method, but we can make that happen by declaring it before our constructor
		This way we can let someone join the game right away, even if they come in late for registery
	 		We will have to set the players name and number within the BasketBall class itself*/
	public Player(){};
	//Of course now that you created a constructor. Now you need a setter and getter inside this method to set the job for you once you call the constructor method Player();

	public String getStrPlayerName() { 
		return playerName; };
	public void setStrPlayerName(String playerName)	{
	 this.playerName = playerName;
	}	
	 public String getStrPlayerNumber(){ 
	 	return playerNumber; }
	 public void setStrPlayerNumber(String playerNumber){
	 	this.playerNumber = playerNumber;
	 }



}


// A game needs two teams 
	//A team needs players
public class Team extends Player {




}