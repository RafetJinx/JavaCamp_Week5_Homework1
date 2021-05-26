package business.concretes;

import business.abstracts.AuthInterface;
import dataAccess.abstracts.UserDao;
import entities.abstracts.Entity;

import java.util.ArrayList;

public class GoogleAuth implements AuthInterface {
    ArrayList<String> email_arrayList = null;
    ArrayList<String> password_arrayList = null;

    @Override
    public void login(String email, String password) {
        if(userInformations != null){
            email_arrayList = userInformations.getEmail_arrayList();
            password_arrayList = userInformations.getPassword_arraylist();
            boolean userLogin = false;
            for(int i = 0; i < email_arrayList.size(); i++){
                if(email.equals(email_arrayList.get(i)) && password.equals(password_arrayList.get(i)))
                    userLogin = true;
            }
            if(userLogin == true)
                System.out.println("Giris basarili, girisi yapilan kullanici e-mail'i: " + email);
            else
                System.out.println("Giris basarisiz.");
        }
    }

    @Override
    public void register(UserDao userDao, Entity user) {
        if(authCheck.checkForRegister(user) == false){
            // false ise sistemde boyle bir kullanici kayitli degil demek.
            confirmationEmail.sendConfirmationEmail();
            if(confirmationEmail.verifyEmail() == true){
                // E-mail dogrulanirsa kayit islemi devam ettiriliyor.
                userInformations.addInformation(user);
                userDao.add(user);
            }
        } else {
            System.out.println("Sistemde boyle bir kullanici e-mail'i kayitli.");
        }
    }
}
