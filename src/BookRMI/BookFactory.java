package BookRMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface BookFactory extends Remote {
    void createBook(String name, int price, int stock) throws RemoteException;
    Book lookupBook(String name) throws RemoteException;
    void register(Callback cb) throws RemoteException;
    void deregister(Callback cb) throws RemoteException;
}
