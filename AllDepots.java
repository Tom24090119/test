import java.util.ArrayList;
import java.util.HashMap;

public class AllDepots {

    private static int totalDepots;
    private  int totalCarCountPerDepot;
    private int totalColour;
    private HashMap<String,Integer> car  = new HashMap<String, Integer>();
    private Location location;

    public AllDepots(int totalColour)
    {
        this.totalColour = totalColour;
    }

    public static void setTotalDepots(int totalDepots) {
        AllDepots.totalDepots = totalDepots;
    }

    public void setTotalCarCountPerDepot(int totalCarCountPerDepot) {
        this.totalCarCountPerDepot = totalCarCountPerDepot;
    }



    public void setLocation(Location location) {
        this.location = location;
    }

    public void addCar(String colour, int number)
    {
        car.put(colour,number);
    }

    /*
     Getters
     */
    public static int getTotalDepots() {
        return totalDepots;
    }

    public HashMap<String,Integer> getCar()
    {
        return car;
    }

    public Location getLocation()
    {
        return location;
    }

    public int getTotalCarCountPerDepot() {
        return totalCarCountPerDepot;
    }
}
