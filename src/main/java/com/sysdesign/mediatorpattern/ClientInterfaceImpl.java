package com.sysdesign.mediatorpattern;

import com.sysdesign.mediatorpattern.mediator.ChatMediatorImpl;
import com.sysdesign.mediatorpattern.mediator.Mediator;
import com.sysdesign.mediatorpattern.user.User;
import com.sysdesign.mediatorpattern.user.UserImpl;

public class ClientInterfaceImpl {
    public static void main(String[] args) {
        Mediator mediator = new ChatMediatorImpl();
        User user1 = new UserImpl(mediator, "Pankaj");
        User user2 = new UserImpl(mediator, "Lisa");
        User user3 = new UserImpl(mediator, "Saurabh");
        User user4 = new UserImpl(mediator, "David");

        mediator.addUsers(user1);
        mediator.addUsers(user2);
        mediator.addUsers(user3);
        mediator.addUsers(user4);

        user2.send("Hi All");

    }
}
