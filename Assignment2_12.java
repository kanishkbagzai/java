class Distance{
    double distanceInMiles;
    public Distance(double distanceInMiles){
        this.distanceInMiles=distanceInMiles;
    }
    public void travelTime(){
        double time=distanceInMiles/60.0;
        System.out.println("Time in hours at 60mph is "+time);
    }
}
class DistanceMKS extends Distance{
    public DistanceMKS(double distanceInKilometers){
        super(distanceInKilometers);
    }
    public void travelTime(){
        double speedInKmPerSecond = 100.0;
        double time = distanceInMiles / speedInKmPerSecond;
        System.out.println("Travel time (in seconds) at 100 km/s: " + time + " seconds");
    }
}

public class Assignment2_12 {
    public static void main(String[] args) {
        // Create an object of Distance with distance in miles
        Distance distanceInMiles = new Distance(120);  // 120 miles
        System.out.println("Base class output:");
        distanceInMiles.travelTime();  // Call travelTime method of base class

        // Create an object of DistanceMKS with distance in kilometers
        DistanceMKS distanceInKm = new DistanceMKS(200);  // 200 kilometers
        System.out.println("\nDerived class output:");
        distanceInKm.travelTime();  // Call overridden travelTime method of derived class
}
}
