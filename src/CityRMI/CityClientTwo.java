package CityRMI;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.*;

public class CityClientTwo {
    public static void main(String[] args) throws RemoteException, MalformedURLException, NotBoundException {
        City cityServer = (City) Naming.lookup("rmi://localhost:5099/City");

        ArrayList<Integer> cityinfos = new ArrayList<Integer>();
        cityinfos.add(10); //temperature
        cityinfos.add(200); //population

        cityServer.addNewCity("Lavanda", cityinfos);
        cityServer.addNewCity("Singapore", cityinfos);
        cityServer.addNewCity("Shanghai", cityinfos);
        cityServer.addNewCity("Changgi",cityinfos);
    }
}
