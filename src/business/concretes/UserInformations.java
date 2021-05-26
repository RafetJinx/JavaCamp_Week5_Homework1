package business.concretes;

import business.abstracts.UserInformationsInterface;
import entities.abstracts.Entity;

import java.util.ArrayList;

public class UserInformations implements UserInformationsInterface {
    private ArrayList<Integer> id_arrayList = new ArrayList<>();
    private ArrayList<String> name_arrayList = new ArrayList<>();
    private ArrayList<String> lastName_arrayList = new ArrayList<>();
    private ArrayList<String> email_arrayList = new ArrayList<>();
    private ArrayList<String> password_arraylist = new ArrayList<>();

    public ArrayList<Integer> getId_arrayList() {
        return id_arrayList;
    }

    public void setId_arrayList(ArrayList<Integer> id_arrayList) {
        this.id_arrayList = id_arrayList;
    }

    public ArrayList<String> getName_arrayList() {
        return name_arrayList;
    }

    public void setName_arrayList(ArrayList<String> name_arrayList) {
        this.name_arrayList = name_arrayList;
    }

    public ArrayList<String> getLastName_arrayList() {
        return lastName_arrayList;
    }

    public void setLastName_arrayList(ArrayList<String> lastName_arrayList) {
        this.lastName_arrayList = lastName_arrayList;
    }

    public ArrayList<String> getEmail_arrayList() {
        return email_arrayList;
    }

    public void setEmail_arrayList(ArrayList<String> email_arrayList) {
        this.email_arrayList = email_arrayList;
    }

    public ArrayList<String> getPassword_arraylist() {
        return password_arraylist;
    }

    public void setPassword_arraylist(ArrayList<String> password_arraylist) {
        this.password_arraylist = password_arraylist;
    }

    @Override
    public void addInformation(Entity user){
        id_arrayList.add(user.getId());
        name_arrayList.add(user.getName());
        lastName_arrayList.add(user.getLastName());
        email_arrayList.add(user.getEmail());
        password_arraylist.add(user.getPassword());
    }
}
