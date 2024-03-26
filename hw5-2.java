package hw5_1;

public class hw5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StoreValueCard[] cards= {
				new StoreValueCard("A001",500,0),
				new StoreValueCard("A002",300,0),
				new StoreValueCard("A003",1000,1)
		};
		for(var card:cards) {
			System.out.printf("(%s.%d.%d)%n",
					card.cardId, card.balance, card.bonus);
		}
		
	}

}
class StoreValueCard{
	String cardId;
	int balance;
	int bonus;
	
	StoreValueCard(String cardId, int balance, int bouns){
		this.cardId=cardId;
		this.balance=balance;
		this.bonus=bonus;
	}
}
