package com.jarema.lukasz.zadania.programistyczne.rozdzial8;

public class PoliceOfficer {
    private String lastName;
    private int id;
    private ParkedCar parkedCar;
    private ParkingMeter parkingMeter;
    private ParkingTicket parkingTicket;

    /**
     * Konstruktor bezargumentowy obiektu typu PoliceOfficer
     */
    public PoliceOfficer() {

    }

    /**
     * Konstruktor obiektu typu PoliceOfficer przyjmujący jako argument wartość pól lastName oraz id
     * @param lastName warość pola lastName
     * @param id warość pola id
     */
    public PoliceOfficer(String lastName, int id) {
        this.lastName = lastName;
        this.id = id;
    }

    /**
     * Konstruktor kopiujący obiektu typu PoliceOfficer
     * @param policeOfficer wartość pola PoliceOfficer
     */
    public PoliceOfficer(PoliceOfficer policeOfficer) {
        lastName = policeOfficer.lastName;
        id = policeOfficer.id;
    }

    public void getFine(ParkedCar parkedCar, ParkingTicket parkingTicket, ParkingMeter parkingMeter, PoliceOfficer
                        policeOfficer) {
        parkingTicket.expiredTicket(parkedCar, parkingMeter);
        if (parkingTicket.getFine() > 0) {
            System.out.println("Samochód\n" + parkedCar + "\nOtrzymał mandat w wysokości: " + parkingTicket.getFine() +
                    "\n" + policeOfficer);
        } else
            System.out.println("Samochód jest zaparkowany prawidłowo");
    }

    public String toString() {
        return "Nazwisko policjanta: " + lastName + "\nIdentyfikator policjanta: " + id;
    }
}
