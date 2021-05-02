import Concrete.UserManager;
import Entity.User;
import Entity.Discount;
import Entity.Game;
import Concrete.GameManager;
import Concrete.SalesManager;

public class Main {

	public static void main(String[] args) {
		User user=new User();
		user.setName("emre");
		user.setSurName("yiðit");
		user.setNo(1);
		user.setDogumYili("15.01.2001");
		UserManager userManager=new UserManager();
		
		userManager.add(user);
		Discount discount=new Discount();
		discount.setCampaignName("Kýs");
		discount.setRate(15);
		Game game=new Game();
		game.setName("Pes 2020");
		game.setPrice(400);
		GameManager gameManager=new GameManager();
		gameManager.add(game);
		SalesManager salesManager=new SalesManager();
		salesManager.sell(game, user,discount);
	}

}
