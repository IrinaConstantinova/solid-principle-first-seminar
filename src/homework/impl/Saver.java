package homework.impl;

import homework.Saveable;
import homework.User;

public class Saver implements Saveable {
    private final User user;

    public Saver(User user){
        this.user = user;
    }

    @Override
    public void save(User user) {
        System.out.println("Save user: " + user.getName());
    }

}
