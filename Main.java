import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<AllDepots> depot = new ArrayList<>();
        ArrayList<customer> customer = new ArrayList<>();

        try {
            Scanner sc = new Scanner(new FileInputStream("a1q1(small).txt.txt"),"UTF-16");

            AllDepots.setTotalDepots(Integer.parseInt(sc.nextLine()));
            int totalDepots = AllDepots.getTotalDepots();
            int totalCars = 0;
            boolean checkEvent = false;
            String line="";
            sc.useDelimiter(",");

            /*
            Looping to get data of depots
             */
            for(int i = 1; i <= totalDepots; i++)
            {
                String[] element;
                int currentDepot = Integer.parseInt(sc.nextLine());
                AllDepots obj = new AllDepots(currentDepot);

                int depotCar = 0;
                for(int j = 1; j <= currentDepot; j++)
                {
                    line = sc.nextLine();
                    element = line.split(",");
                    depotCar += Integer.parseInt(element[1]);
                    obj.addCar(element[0],Integer.parseInt(element[1]));
                }
                obj.setTotalCarCountPerDepot(depotCar);

                line = sc.nextLine();
                element = line.split(",");

                Location location = new Location(Integer.parseInt(element[0]),Integer.parseInt(element[1]));
                obj.setLocation(location);

                depot.add(obj);
            }

            for(int i = 1; i <= totalDepots; i++)
            {
//                for()
            }

            /*
            Looping to get customer data till the end of the file
             */
            while(sc.hasNextLine())
            {
                line = sc.nextLine();
                if(line.isEmpty()) {
                    checkEvent = !checkEvent;
                    line = sc.nextLine();
                }

                String[] element = line.split(",");

                if(!checkEvent) {  //For Renters
                    System.out.println("Location of the customer is : " +element[2]+ " " +element[3]);
                    Location location = new Location(Integer.parseInt(element[2]),Integer.parseInt(element[3]));
                    Renter renter = new Renter(element[0],element[1],location,Integer.parseInt(element[4]),Integer.parseInt(element[5]));
                    //This renter object will be stored in an arraylist of object containing renters data.
                    customer.add(renter);
                }
                else            //For events
                {
                    Location location = new Location(Integer.parseInt(element[1]),Integer.parseInt(element[2]));
                    Event event = new Event(element[0], element[4], location, Integer.parseInt(element[3]), Integer.parseInt(element[5]));

                    //This event object will be stored in an arraylist of object containing event data.
                    customer.add(event);
                }

            }



            sc.close();
            /**
             * Testing the arraylist
             */

            for(customer o : customer)
            {
                if(o instanceof  Renter)
                {

                }
                else
                    System.out.println("Ohh never mind its the other way round");
            }
            /*
            for(int j = 0; j < depot.size(); j++)
            {
                AllDepots xyz = depot.get(j);
                HashMap<String ,Integer> cars = xyz.getCar();
                for (String i : cars.keySet()) {
                    System.out.println("key: " + i + " value: " + cars.get(i));
                }
                Location l = xyz.getLocation();
                System.out.println(l.toString());
            }

            for(int j = 0; j < customer.size(); j++)
            {
                Renter xyz = customer.get(j);
                System.out.println(xyz.carColour);
                System.out.println(xyz.NameComparator);
            }

             */
        }
        catch(Exception e)
        {
            System.out.println("File not found");
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
