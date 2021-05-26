package business.concretes;

import business.abstracts.ConfirmationEmailInterface;

import java.util.Scanner;

public class ConfirmationEmail implements ConfirmationEmailInterface {
    Scanner scanner;

    @Override
    public void sendConfirmationEmail() {
        System.out.println("Dogrulama e-mail'i gonderildi.");
    }

    @Override
    public boolean verifyEmail() {
        scanner = new Scanner(System.in);
        boolean verify = true;
        String ifade;
        System.out.println("E-mail'inizi dogrulamak istiyor musunuz? (e/h)");
        ifade = scanner.nextLine();
        if(ifade.equals("e")) {
            System.out.println("E-mail'iniz dogrulandi, kayit isleminiz yapiliyor.");
            verify = true;
        }
        else if(ifade.equals("h")) {
            System.out.println("E-mail'iniz dogrulanmadi, kayit isleminiz yapilamiyor.");
            verify = false;
        }
        else {
            System.out.println("E-mail'iniz dogrulanmadi, kayit isleminiz yapilamiyor.");
            verify = false;
        }
        return verify;
    }
}
