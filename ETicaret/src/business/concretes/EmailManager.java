package business.concretes;
import business.abstracts.EmailService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class EmailManager implements EmailService {
	private User user;
	private UserDao u;
	
	
	@Override
	public void sendEmail(User user, String ePosta) {
		System.out.println("Dogrulama kodu icin mailinizi kontrol ediniz.");
		
	}
}
