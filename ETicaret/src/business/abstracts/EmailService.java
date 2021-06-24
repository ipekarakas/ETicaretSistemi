package business.abstracts;

import entities.concretes.User;

public interface EmailService {

	void sendEmail(User user,String ePosta);

}