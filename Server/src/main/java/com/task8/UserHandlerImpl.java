package com.task8;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class UserHandlerImpl extends UnicastRemoteObject implements UserHandler {


    protected UserHandlerImpl() throws RemoteException {
        super( );
    }

    @Override
    public String getUserName(int id) {
        return "zln312";
    }

    @Override
    public int getUserCount() {
        return 1;
    }

    @Override
    public User getUserByName(String name) {
        return new User("zln312", 4);
    }
}
