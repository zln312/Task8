package com.task8;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * 一个远程调用接口 UserHandler
 * 远程调用接口必须继承java.rmi.Remote
 */


public interface UserHandler  extends Remote {

    //远程调用方法必须抛出RemoteException
    String getUserName(int id) throws RemoteException;

    int getUserCount() throws RemoteException;

    User getUserByName(String name) throws RemoteException;
}
