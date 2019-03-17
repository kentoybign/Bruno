import java.util.ArrayList;
import java.util.Scanner;


public class Player {
	private ArrayList<Card> playercards; //cards in hand
	private String name; //player name
	public boolean token;
	
	/**
	* The method Player is the constructor
	* @param String name names the players in the game
	*/
	
	public Player(String name) { //constructor

		boolean token = false;
		playercards = new ArrayList<Card>();
		this.name = name;	
	}
	
	/**
	* the method numberOfCards is thee size of the playercard 
	*/
	
	//playercard size
	public int numberOfCards() {
	
		return playercards.size();
	}
	
	public ArrayList<Card> PlayerCards(){
	
		return playercards;
	}
	
	public void pickCards(Card c) {
		
		playercards.add(c);
	}
	
	/**
	* The method Card throwcard lets the player throw a card from the hand 
	* @param c is the hand 
	*/
	
	//player throws a card from hand which is at position 'c'
	public Card throwCard(int c) {
	
		return playercards.remove(c);
	}
	
	/**
	* the method showCards lets you show the cards
	*/
	
	public void showCards() {

		String[] card = {" ------ ", "|     |", "|     |", "|     |", " ------ "};
		String c = "";
	
		for(int i=0;i< (card.length);i++) {
	
			for(int j=0;j<playercards.size();j++) {
					
				playercards.get(j);
					if(i==1) {	
						c = c +"|  "+playercards.get(j).getColor()+" |"+" ";	
					}
					else if(i==2) {
						c = c + "|   "+playercards.get(j).getValue()+"  |"+" ";
					}
					else if (i==3) {
						if (j<9){
						c = c + "| [0"+ (j + 1) +"] |"+" ";
						}
						else{
							c = c + "| ["+ (j + 1) +"] |"+" ";
						}
					}
					else{
						c = c + card[i]+" "; 
					}
			}	
				c +="\n";	                     	
		}
		System.out.print(c);
	}
	
	/**
	* the method hideCards lets you hide the player's cards
	*/
	
	// to hide player cards
	public void hideCards() {
		
		String[] card = {" ------ ", "|      |" , "|      |", "|      |", " ------ "};
		String c = "";
		
		for(int i=0;i<card.length;i++) {	
			for(int j=0;j<playercards.size();j++) {
				c = c + card[i]+" ";
			}
		c+="\n";
		}
		
		System.out.print(c);
	}
	
	/**
	* the method hasWon checks the player if he/she won or not
	*/
	
	// check is the player has won or not
	public boolean hasWon() {
		
		if(playercards.size()==0) {
			return true;
		}
		return false;
	}
	
	public String toString() {
	
		return this.name;
	}
	
	/**
	* the method hasToken gets to choose the player who can choose a card to play
	* @param Player player are the players of the game
	*/
	
	public boolean hasToken(Player player) {
		return player.token;
	}
	
	/**
	* the method setToken decides who is the winner of that round and play a card.
	*/
	
	public void setToken(boolean token) {
		this.token = token;
	}
	
}