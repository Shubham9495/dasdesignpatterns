package com.sysdesign.mediatorpattern.mediator;

import com.sysdesign.mediatorpattern.user.User;

public interface Mediator {
    void sendMessage(String msg, User user);
    void addUsers(User user);
}
