package core.abstracts;

import entities.concretes.User;

public interface EmailCheckService {
	boolean emailRegexCheck(User user);
}
