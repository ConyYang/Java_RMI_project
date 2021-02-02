package chatclient;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ChatClientIF extends Remote {
    void retrieveMsg(String message) throws RemoteException;
}
