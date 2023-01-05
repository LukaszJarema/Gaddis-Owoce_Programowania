package com.jarema.lukasz.zadania.programistyczne.rozdzial8;

public class ParkingTicket {
    private ParkedCar parkedCar;
    private int fine;
    private PoliceOfficer policeOfficer;

    /**
     * Konstruktor bezargumentowy obiektu typu ParkingTicket
     */
    public ParkingTicket() {

    }

    /**
     * Konstruktor obiektu typu ParkingTicket przyjmujący jako argumenty wartość pól parkedCar, fine, policeOfficer
     * @param parkedCar wartość pola parkedCar
     * @param policeOfficer wartość pola policeOfficer
     */
    public ParkingTicket(ParkedCar parkedCar, PoliceOfficer policeOfficer) {
        this.parkedCar = parkedCar;
        fine = 0;
        this.policeOfficer = policeOfficer;
    }

    /**
     * Konstruktor kopiujący obiektu typu ParkingTicket
     * @param parkingTicket
     */
    public ParkingTicket(ParkingTicket parkingTicket) {
        parkedCar = parkingTicket.parkedCar;
        fine = parkingTicket.fine;
        policeOfficer = parkingTicket.policeOfficer;
    }

    //Akcesory

    public ParkedCar getParkedCar() {
        return parkedCar;
    }

    public int getFine() {
        return fine;
    }

    public PoliceOfficer getPoliceOfficer() {
        return policeOfficer;
    }

    //Mutatory

    public void setParkedCar(ParkedCar parkedCar) {
        this.parkedCar = parkedCar;
    }

    public void setFine(int fine) {
        this.fine = fine;
    }

    public void setPoliceOfficer(PoliceOfficer policeOfficer) {
        this.policeOfficer = policeOfficer;
    }

    /**
     * Metoda expiredTicket obiektu typu ParkingTicket sprawdza od jakiego czasu stoi zaparkowany samochód i na jaki
     * okres czasu ma wykupiony bilet. Następnie wypełnia wartość pola fine
     * @param parkedCar wartość obiektu parkedCar
     * @param parkingMeter wartość obiektu parkingMeter
     */
    public void expiredTicket(ParkedCar parkedCar, ParkingMeter parkingMeter) {
        int timeWithoutPurchase = parkedCar.getParkedMinutes() - parkingMeter.getMinutesOfTimePurchased();
        if (timeWithoutPurchase > 0 && timeWithoutPurchase <= 60) {
            setFine(50);
        } else if (timeWithoutPurchase > 60) {
            setFine((timeWithoutPurchase / 60 * 25) + 50);
        } else {
            setFine(0);
        }
    }

    public void whoGaveTheFine(PoliceOfficer policeOfficer) {
        if (fine > 0) {
            System.out.println("Mandat został wystawiony przez " + policeOfficer);
        }
    }
}
