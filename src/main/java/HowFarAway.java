import java.util.Scanner;

public class HowFarAway 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the latitude of the starting location: ");
        double latitude1 = in.nextDouble();
        
        System.out.print("\nEnter the longitude of the starting location: ");
        double longitude1 = in.nextDouble();
        
        System.out.print("\nEnter the latitude of the ending location: ");
        double latitude2 = in.nextDouble();
        
        System.out.print("\nEnter the longitude of the ending location: ");
        double longitude2 = in.nextDouble();
        
        GeoLocation myGeo = new GeoLocation(latitude1, longitude1);
        
        //System.out.println(myGeo.toString());
        //System.out.println(myGeo.getLatitude());
        //System.out.println(myGeo.getLongitude());
        
        GeoLocation other = new GeoLocation(latitude2, longitude2);
        
        System.out.println("The distance is " + myGeo.distanceFrom(other) + " miles.");
    }
}
