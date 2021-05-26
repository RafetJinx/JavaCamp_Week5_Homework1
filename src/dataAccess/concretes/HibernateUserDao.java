package dataAccess.concretes;

import dataAccess.abstracts.UserDao;
import entities.abstracts.Entity;

public class HibernateUserDao implements UserDao {
    @Override
    public void add(Entity user) {
        System.out.println("Hibernate user dao ile eklendi.");
    }
}
