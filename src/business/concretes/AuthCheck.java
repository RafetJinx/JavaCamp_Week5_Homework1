package business.concretes;

import business.abstracts.AuthCheckInterface;
import entities.abstracts.Entity;

public class AuthCheck implements AuthCheckInterface {
    UserInformations userInformations;

    public AuthCheck(UserInformations userInformations) {
        super();
        this.userInformations = userInformations;
    }

    @Override
    public boolean checkForRegister(Entity user) {
        if(userInformations == null)
            return false;
        for(int i = 0; i < userInformations.getEmail_arrayList().size(); i++){
            if(user.getEmail().equals(userInformations.getEmail_arrayList().get(i)))
                return true;
        }
        return false;
    }
}
