package com.task8;



import java.rmi.AlreadyBoundException;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Main {

    public static void main(String[] args) throws RemoteException {
        UserHandler userHandler = new UserHandlerImpl();
        Registry registry;
        try {

            registry  = LocateRegistry.createRegistry(10990);
            registry.bind("demo", userHandler);
//            Naming.bind("demo",userHandler);
            System.out.println("服务启动");
        } catch (RemoteException | AlreadyBoundException e) {
            e.printStackTrace();
        }

    }
}