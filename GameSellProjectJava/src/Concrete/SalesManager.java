package Concrete;
import Entity.User;
import Entity.Game;
import Entity.Discount;

public class SalesManager {
	public void sell(Game game,User user,Discount discount) {
		System.out.println(user.getName()+" isimli kullan�c� "+game.getName()+" adl� oyunu y�zde " +discount.getRate()+ " oranl� indirimle sat�n ald�");
	}
}
