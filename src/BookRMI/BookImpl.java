package BookRMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class BookImpl extends UnicastRemoteObject implements Book {
    private String bookName;
    private int bookPrice;
    private int bookStock;

    protected BookImpl(String name, int price, int stock) throws RemoteException {
        super();
        bookName = name;
        bookPrice = price;
        bookStock = stock;
    }

    @Override
    public String getName() throws RemoteException {
        return bookName;
    }

    @Override
    public int getPrice() throws RemoteException {
        return bookPrice;
    }

    @Override
    public int getStock() throws RemoteException {
        return bookStock;
    }
}
