package dataAccess.concretes;

import dataAccess.abstracts.UserDao;
import entities.abstracts.Entity;

public class GoogleUserDao implements UserDao {
    @Override
    public void add(Entity user) {
        System.out.println("Google user dao ile eklendi.");
    }
}
