package BookRMI;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class BookFactoryServer {
    public static void main(String[] args) {
        try{
            LocateRegistry.createRegistry(5099);
            BookFactoryImpl mybookFactory = new BookFactoryImpl();
            Naming.rebind("rmi://localhost:5099/Book",mybookFactory);
        }catch (Exception e){
            System.out.println();
        }
    }
}
