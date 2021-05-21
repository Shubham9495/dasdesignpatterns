package com.sysdesign.mediatorpattern.user;

import com.sysdesign.mediatorpattern.mediator.Mediator;

public class UserImpl extends User{

    public UserImpl(Mediator mediator, String name) {
        super(mediator, name);
    }

    public void send(String msg) {
        System.out.println(this.name+": Sending Message="+msg);
        mediator.sendMessage(msg,this);
    }

    public void recieve(String msg) {
        System.out.println(this.name+": Received Message:"+msg);
    }
}
