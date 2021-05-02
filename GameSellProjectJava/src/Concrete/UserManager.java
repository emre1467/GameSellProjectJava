package Concrete;

import Abscract.UserService;
import Entity.Game;
import Entity.User;

public class UserManager implements UserService{

	@Override
	public void add(User user) {
		if(eDevletKonrol(user)==true) {
			System.out.println("User added: "+user.getName()+" "+user.getSurName());	
		}
		else
			System.out.println("Kiþi edevlet sisteminde kayýtlý deðil.Kullanýcý eklenemedi.");
		
	}
	@Override
	public void delete(User user) {
		System.out.println("User deleted: "+user.getName()+" "+user.getSurName());	
		
	}
	@Override
	public void update(User user) {
		System.out.println("User updated: "+user.getName()+" "+user.getSurName());	
		
	}
	
	
	public static boolean eDevletKonrol(User user) {
		return true;
	}
	
	
}
