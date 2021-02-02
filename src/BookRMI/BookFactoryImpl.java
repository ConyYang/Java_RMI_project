package BookRMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Vector;

public class BookFactoryImpl extends UnicastRemoteObject implements BookFactory {
    private Vector bookList;
    private Vector cbList;

    protected BookFactoryImpl() throws RemoteException {
        super();
        bookList = new Vector();
        cbList = new Vector();
    }

    @Override
    public void createBook(String name, int price, int stock) throws RemoteException {
        Book myBook = new BookImpl(name, price, stock);
        bookList.add(myBook);
        for (int i=0; i<cbList.size(); i++){
            Callback cb = (Callback) cbList.elementAt(i);
            cb.BookCreated(myBook);
        }
    }

    @Override
    public Book lookupBook(String name) throws RemoteException {
        Book myBook;
        for (int i = 0; i<bookList.size(); i++){
            myBook = (Book) bookList.elementAt(i);
            if (myBook.getName().equals(name))
                return myBook;
        }
        return null;
    }

    @Override
    public void register(Callback cb) throws RemoteException {
        if (!(cbList.contains(cb)))
            cbList.addElement(cb);
    }

    @Override
    public void deregister(Callback cb) throws RemoteException {
        if(cbList.contains(cb))
            cbList.removeElement(cb);
    }
}
