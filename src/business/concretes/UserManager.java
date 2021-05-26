package business.concretes;

import business.abstracts.AuthInterface;
import business.abstracts.UserService;
import dataAccess.abstracts.UserDao;
import entities.abstracts.Entity;

public class UserManager implements UserService {
    private UserDao userDao;
    private AuthInterface authInterface;

    public UserManager(UserDao userDao, AuthInterface authInterface) {
        super();
        this.userDao = userDao;
        this.authInterface = authInterface;
    }

    @Override
    public void add(Entity user) {
        authInterface.register(this.userDao, user);
    }
}
