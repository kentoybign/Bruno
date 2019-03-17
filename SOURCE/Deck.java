import java.util.Random;
public class Deck {
	
	/**
	* The method Card deck is the array of cards 
	* The colors in the deck are red(red), wht(white), blu(blue) and ylw(yellow)
	* The values in the deck are 1, 2, 3, 4, 5, 6, 7, 8 and 9
	*/
	
	private Card deck[];//Array of cards
	private final int Total_numbers_cards = 36;
	private int top;
	
		public Deck() {
			String color[] = {"red", "wht", "blu", "ylw"};
			int value[] = {1, 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 };
			deck = new Card[Total_numbers_cards];
			top = 0;	
			
			for (; top < deck.length;top++){
				deck[top] = new Card(value[top%9],color[top/9]);
			}
		}
	
	/**
	* The method shuffle shuffles the card in the deck
	*/
	
	public void shuffle(){
	//shuffle the cards
		
		for(int i = 0; i < this.deck.length; i++){
			
			//swaping
			int index = (int)(Math.random() * deck.length);
			Card temp = deck[i];
			deck[i] = deck[index];
			deck[index] = temp;
		}
	}

/**
* The method print prints the deck of the game
*/

	public void print(){
		for(int i = 0; i<this.top; i++){
			System.out.println(this.deck[i]);
		}
	}
	
	/**
	* the method isEmpty checks if the deck is empty or nah
	*/
	
	public boolean isEmpty() { //check if the deck empty
		if(top==0)
			return true;
		
		else
			return false;
		
	}
	
	public Card peek(){
		return deck[deck.length-1];
	}
	
	/**
	* The method Card getTopCard lets you only draw or get the card on top of the deck.
	*/
	
	public Card getTopCard(){
		Card temp;
		temp = deck[top-1];
		top--;
		return temp;
	}
	
	/**
	* The method Addtodeck adds the played cards to deck to avoid emptying of the deck
	* @param Card i is/are card added to the deck
	*/
	
	public void Addtodeck(Card i){
		deck[top] = i;
		top++;
	}

/**
* the method remainingCards is the 
*/

	public int remainingCards() {
		return top;
	}
}