package flights;

import people.passengers.Passenger;
import people.staff.CabinCrew;
import people.staff.Pilot;
import planes.Plane;
import planes.PlaneType;

import java.util.ArrayList;

public class Flight {

    private PlaneType plane;
    private ArrayList<Pilot> pilots;
    private ArrayList<CabinCrew> cabinCrew;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;
    private ArrayList<Passenger> passengers;

    public Flight(PlaneType plane, String flightNumber, String destination, String departureAirport, String departureTime) {
        this.plane = plane;
        this.pilots = new ArrayList<>();
        this.cabinCrew = new ArrayList<>();
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
        this.passengers = new ArrayList<>();
    }

    public PlaneType getPlane() {
        return plane;
    }

    public ArrayList<Pilot> getPilots() {
        return pilots;
    }

    public ArrayList<CabinCrew> getCabinCrew() {
        return cabinCrew;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public int getNumberOfSeats() {
        return plane.getCapacity();
    }

    public int getNumberOfPassengers() {
        return passengers.size();
    }

    public void addPassengerToPlane(Passenger passenger){
        passengers.add(passenger);
    }

    public int getAvailableSeats() {
        int seats = plane.getCapacity();
        return seats - passengers.size();
    }
}
