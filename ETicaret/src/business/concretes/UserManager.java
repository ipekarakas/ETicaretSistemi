package business.concretes;

import java.util.List;

import Google.GoogleManager;
import entities.concretes.User;
import business.abstracts.UserService;
import core.concretes.EmailCheckManager;
import dataAccess.abstracts.UserDao;
import dataAccess.concretes.HibernateUserDao;

public class UserManager implements UserService{
	
	private UserDao userDao;
	
	public UserManager(HibernateUserDao hibernateUserDao, GoogleManager googleManager,
			EmailCheckManager emailCheckManager) {
		// TODO Auto-generated constructor stub
	}

	public boolean register(User user) {
		if(user.getLength1()<=1 || user.getLength2()<=1) {
			System.out.println("Bu kategoride ürün kabul edilmiyor. Ad ve soyad en az iki karakterden oluþmalýdýr.");
			return false;
		}
		if(user.getLength3()<6) {
			System.out.println("Bu kategoride ürün kabul edilmiyor. Parola en az 6 karakterden oluþmalýdýr.");
		}
		if(emailCheckRegex(user)) {
			System.out.println("Gecersiz email!!!");
			return false;
		}
		return false;
		
}
	
	private boolean emailCheckRegex(User user) {
		
		return false;
	}
	public boolean login1(User user) {
	
		for(User u: userDao.getAll()) {
			if(user.geteMail().equals(u.geteMail())&&user.getParola().equals(u.getParola())) {
				return true;
		
			}

		}
		return false;
}
	public boolean userCheck(String email) {
		if(userDao.getePosta() != null ) {
		
			System.out.println("Bu e-posta ile kullanici mevcut");
			return false;
			}
		
		return true;
	}

	@Override
	public void add(User user) {
		System.out.println("DOðrulama kodunuz gönderildi. Lütfen doðrulama kodunu giriniz:");
		return;
		}
	public void update() {
		
	}
	public void delete() {
		
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void login(User user1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void SignIn(String string, String string2) {
		// TODO Auto-generated method stub
		
	}
}