package BookRMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Book extends Remote {
    String getName() throws RemoteException;
    int getPrice() throws RemoteException;
    int getStock() throws RemoteException;
}
