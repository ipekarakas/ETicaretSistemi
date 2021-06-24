package business.abstracts;

import java.util.List;

import entities.concretes.User;

public interface UserService {
	void add(User user);
	List<User> getAll();
	void login(User user1);
	void SignIn(String string, String string2);
	
		
	
}
