package CityRMI;

import javax.security.auth.callback.Callback;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.HashMap;

public interface City extends Remote {
    int getPopulation(String cityName) throws RemoteException;
    int getTemperature(String cityName) throws RemoteException;
    void addNewCity(String cityName, ArrayList<Integer> cityInfos) throws RemoteException;
    HashMap<String, ArrayList<Integer>> getAllCities() throws RemoteException;

//    void callbackmethod(String notifymsg) throws RemoteException;
}
