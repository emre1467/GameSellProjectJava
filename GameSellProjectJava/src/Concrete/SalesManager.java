package Concrete;
import Entity.User;
import Entity.Game;
import Entity.Discount;

public class SalesManager {
	public void sell(Game game,User user,Discount discount) {
		System.out.println(user.getName()+" isimli kullanýcý "+game.getName()+" adlý oyunu yüzde " +discount.getRate()+ " oranlý indirimle satýn aldý");
	}
}
