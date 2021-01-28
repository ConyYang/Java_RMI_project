package CityRMI;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.HashMap;

public class CityClientOne {
    public static void main(String[] args) throws RemoteException, MalformedURLException, NotBoundException {
        City cityServer = (City) Naming.lookup("rmi://localhost:5099/City");

        HashMap<String, ArrayList<Integer>> cities = cityServer.getAllCities();
        System.out.println(cities);

        int pop = cityServer.getPopulation("Lavanda");
        System.out.println(pop);
    }
}
