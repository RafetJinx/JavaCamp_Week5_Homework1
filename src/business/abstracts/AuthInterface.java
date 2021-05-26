package business.abstracts;

import business.concretes.AuthCheck;
import business.concretes.ConfirmationEmail;
import business.concretes.UserInformationValidation;
import business.concretes.UserInformations;
import dataAccess.abstracts.UserDao;
import entities.abstracts.Entity;

public interface AuthInterface {
    UserDao userDao = null;
    UserInformationValidationInterface userInformationValidation = new UserInformationValidation();
    UserInformations userInformations = new UserInformations();
    AuthCheckInterface authCheck = new AuthCheck(userInformations);
    ConfirmationEmail confirmationEmail = new ConfirmationEmail();

    void login(String email, String password);
    void register(UserDao userDao, Entity user);
}
