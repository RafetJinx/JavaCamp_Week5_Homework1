package business.abstracts;

import entities.abstracts.Entity;
import entities.concretes.User;

public interface UserInformationValidationInterface {
    boolean validateName(Entity user);
    boolean validateLastName(Entity user);
    boolean validateEmail(Entity user);
    boolean validatePassword(Entity user);
    boolean validateAll(Entity user);
    void showUnvalidateInformations(Entity user);
}
