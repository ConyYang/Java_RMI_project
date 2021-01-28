package CityRMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.HashMap;

public class CityServant extends UnicastRemoteObject implements City {
    private HashMap<String, ArrayList<Integer>> cityNamesHashmap;

    protected CityServant() throws RemoteException {
        super();
        this.cityNamesHashmap = new HashMap<>();
    }

    @Override
    public void addNewCity(String cityName, ArrayList<Integer> cityInfos) throws RemoteException {
        this.cityNamesHashmap.put(cityName, cityInfos);
        System.out.println("A new city is added...");
    }

    @Override
    public HashMap<String, ArrayList<Integer>> getAllCities() throws RemoteException {
        return this.cityNamesHashmap;
    }

//    @Override
//    public void callbackmethod(String notifymsg) throws RemoteException {
//    }

    @Override
    public int getPopulation(String cityName) throws RemoteException {
        if (this.cityNamesHashmap.containsKey(cityName)){
            return this.cityNamesHashmap.get(cityName).get(0);
        }else {
            return -1;
        }
    }

    @Override
    public int getTemperature(String cityName) throws RemoteException {
        if (this.cityNamesHashmap.containsKey(cityName)){
            return this.cityNamesHashmap.get(cityName).get(1);
        }else {
            return -1;
        }
    }
}
