public class Card {
	
	public String color;//Attributes
	public int value;
	
	/**
	* The method Card is the constructor.
	* @param int Value is the specific value on every card.
	* @param String color is the specific color on every card. 
	*/
	
	public Card(int value,String color) {//constructor
		
		this.color = color;
		this.value = value;	
	}
	
	public String getColor() {
		return this.color;
	}
	
	public int getValue() {
		return this.value;
	}
	
	public String toString() {
	
		String[] card = {" ----- ", "|     |", "|     |", "|     |", " ----- "};
		String c = "";
		
		for(int i=0;i<card.length;i++) {	
			for(int j=0;j<1;j++) {
				if(i==1) {
					c = c +"| "+this.getColor()+" |"+" ";	
				}
				else if(i==2) {
					c = c + "|  "+this.getValue()+"  |"+" ";
				}
				else if(i==2) {
					c = c + card[i] + " ";
				}
				else {
					c = c + card[i]+" "; 
				}	
			}
				c +="\n";		
		}
		return c;	
	}
}
