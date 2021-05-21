package com.sysdesign.mediatorpattern.mediator;

import com.sysdesign.mediatorpattern.user.User;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements Mediator{
    List<User> users = new ArrayList<User>();


    public void sendMessage(String msg, User user) {
        for ( User u: this.users) {
            if(u!= user){
                u.recieve(msg);
            }
        }
    }

    public void addUsers(User user) {
        this.users.add(user);
    }
}
