package business.concretes;

import business.abstracts.UserInformationValidationInterface;
import entities.abstracts.Entity;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserInformationValidation implements UserInformationValidationInterface {
    String regexEmail =  "(?<mailAdi>.*)[@](?<saglayici>\\w+)[.](?<alanAdi>.*)";
    Matcher matcherEmail;

    @Override
    public boolean validateName(Entity user) {
        if(user.getName().length() >= 2)
            return true;
        else
            return false;
    }

    @Override
    public boolean validateLastName(Entity user) {
        if(user.getLastName().length() >= 2)
            return true;
        else
            return false;
    }

    @Override
    public boolean validateEmail(Entity user) {
        matcherEmail = Pattern.compile(regexEmail).matcher(user.getEmail());
        if(matcherEmail.find())
            return  true;
        return false;
    }

    @Override
    public boolean validatePassword(Entity user) {
        if(user.getPassword().length() >= 6)
            return true;
        return false;
    }

    @Override
    public boolean validateAll(Entity user) {
        if(validateName(user) == true && validateLastName(user) == true &&
                validateEmail(user) == true && validatePassword(user) == true)
            return true;
        return false;
    }

    @Override
    public void showUnvalidateInformations(Entity user) {
        if(validateName(user) != true)
            System.out.println("Adiniz minimum 2 karakterden olusmalidir.");
        if(validateLastName(user) != true)
            System.out.println("Soyadiniz minimum 2 karakterden olusmalidir.");
        if(validateEmail(user) != true)
            System.out.println("E-mail'iniz E-mail formatina uygun olmalidir.");
        if(validatePassword(user) != true)
            System.out.println("Sifreniz minimum 6 karakterden olusmalidir.");
    }
}
