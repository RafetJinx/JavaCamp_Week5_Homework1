import business.abstracts.AuthInterface;
import business.abstracts.UserService;
import business.concretes.Auth;
import business.concretes.GoogleAuth;
import business.concretes.UserManager;
import dataAccess.concretes.HibernateUserDao;
import entities.abstracts.Entity;
import entities.concretes.GoogleUser;
import entities.concretes.User;

public class Main {
    public static void main(String[] args) {


        // User ekleme
        Entity user = new User(1,"Rafet","Ersoy","rafetersoy@gmail.com","123456");
        Entity user1 = new User(2,"Engin","Demirog","engindemirog@gmail.com","654321");
        AuthInterface auth = new Auth();

        UserService userService = new UserManager(new HibernateUserDao(), auth);
        userService.add(user);
        userService.add(user1);
        auth.login("rafetersoy@gmail.com","123456");
        auth.login("engindemirog@gmail.com","654321");


        // Google user ekleme
        Entity googleUser = new GoogleUser("rafetengin@gmail.com","234567");
        Entity googleUser1 = new GoogleUser("ersoydemirog@gmail.com","345678");
        AuthInterface googleAuth = new GoogleAuth();

        UserService googleUserService = new UserManager(new HibernateUserDao(), googleAuth);
        googleUserService.add(googleUser);
        googleUserService.add(googleUser1);

    }
}
