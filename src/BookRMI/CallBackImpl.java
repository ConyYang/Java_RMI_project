package BookRMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CallBackImpl extends UnicastRemoteObject implements Callback {


    protected CallBackImpl() throws RemoteException {
        super();
    }

    @Override
    public void BookCreated(Book myBook) throws RemoteException {
        System.out.println("New book added: "+myBook.getName() +
                myBook.getPrice()+myBook.getStock());
    }
}
