package Google;

import entities.concretes.User;
import Google.GoogleManager;

public class GoogleManager {
	User user;
	public void add(String message) {
		System.out.println("Google hesabýnýz ile kayýt oldunuz"+message);
	}
	public void signInwithGoogle(String string1,String string2) {
		System.out.println("Google hesabiniz ile giriþ yapildi"+user.getAd()+user.getSoyad());
	}
}
