package business.abstracts;

import entities.abstracts.Entity;

public interface AuthCheckInterface {
    boolean checkForRegister(Entity user);
}
