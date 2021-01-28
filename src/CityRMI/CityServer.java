package CityRMI;

import HelloRMI.HelloServant;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class CityServer {
    public static void main(String[] args) {
        try{
            LocateRegistry.createRegistry(5099);
            CityServant cityServant = new CityServant();
            Naming.rebind("rmi://localhost:5099/City", cityServant);

        } catch (Exception e){
            System.out.println("error caught" + e);
        }
    }
}
