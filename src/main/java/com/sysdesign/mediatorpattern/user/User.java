package com.sysdesign.mediatorpattern.user;

import com.sysdesign.mediatorpattern.mediator.Mediator;

public abstract class User {
    protected Mediator mediator;
    protected String name;
    public User(Mediator mediator, String name){
        this.mediator= mediator;
        this.name=name;
    }

    public abstract void send(String msg);
    public abstract void recieve(String msg);
}
