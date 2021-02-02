package BookRMI;

import java.rmi.Naming;

public class BookFactoryClient {
    public static void main(String[] args) {
        try{
            Callback cb = new CallBackImpl();
            BookFactory myBookFactory = (BookFactory) Naming.lookup("rmi://localhost:5099/Book");

            myBookFactory.register(cb);
            myBookFactory.createBook("Little Prince", 2, 30);
            myBookFactory.createBook("1Q84", 5, 40);

            Book myBook = myBookFactory.lookupBook("1Q84");
            System.out.println(myBook.getPrice());
            System.out.println(myBook.getStock());
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
