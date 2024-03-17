package homework;

import homework.impl.Saver;

public class Main{
    public static void main(String[] args){
        User user = new User("Bob");
        user.report();
        Saver saver = new Saver(user);
        saver.save(user);

    }
}