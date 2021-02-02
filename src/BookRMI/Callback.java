package BookRMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Callback extends Remote {
    void BookCreated(Book myBook) throws RemoteException;
}
