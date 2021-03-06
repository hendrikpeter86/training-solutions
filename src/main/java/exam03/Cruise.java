package exam03;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class Cruise {
    private Boat boat;
    private LocalDate sailing;
    private double basicPrice;
    private List<Passenger> passengers;

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public Boat getBoat() {
        return boat;
    }

    public LocalDate getSailing() {
        return sailing;
    }

    public double getBasicPrice() {
        return basicPrice;
    }

    public Cruise(Boat boat, LocalDate sailing, double basicPrice) {
        this.boat = boat;
        this.sailing = sailing;
        this.basicPrice = basicPrice;
    }

    public void bookPassenger (Passenger passenger){

    }

    public double getPriceForPassenger(Passenger passenger) {
        return basicPrice;
    }

    public Passenger findPassengerByName(String name){
        return ;
    }

    public List<String> getPassengerNamesOrdered(){
        return ;
    }

    public double sumAllBookingsCharged(){
        return ;
    }

    public Map<CruiseClass, Integer> countPassengerByClass(){
        return ;
    }
}
