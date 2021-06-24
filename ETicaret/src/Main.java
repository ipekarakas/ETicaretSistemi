import Google.GoogleManager;
import business.abstracts.EmailService;
import business.abstracts.UserService;
import business.concretes.UserManager;
import core.concretes.EmailCheckManager;
import dataAccess.concretes.HibernateUserDao;
import entities.concretes.User;


public class Main {

	private static EmailService eMailService;

	@SuppressWarnings("null")
	public static void main(String[] args) {
		
		eMailService = null;
		GoogleManager google = null;
		User user1=new User("ipek","karakas","karakasipek@hotmail.com","12345");
		User user2=new User("elif","yýlmaz","elifyilmaz@outlook.com","54785");
		User user3=new User("mehmet","senturk","senturkm@gmail.com","7485");
		
		UserService userService= new UserManager(new HibernateUserDao(),new GoogleManager(),new EmailCheckManager());
	
	//signUp
	
	userService.login(user1);
	eMailService.sendEmail(user1, user1.getePosta());
	
	userService.login(user2);
	eMailService.sendEmail(user2, user2.getePosta());
	
	userService.login(user3);
	eMailService.sendEmail(user3, user3.getePosta());
	
	//signIn
	
	userService.SignIn("karakasipek@hotmail.com","12345");
	
	//signUp with Google
	
	google.signInwithGoogle("senturkm@gmail.com","7485");
	}
}

