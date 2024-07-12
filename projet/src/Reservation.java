import java.time.LocalDate;

public class Reservation {
    private User user;
    private Vehicle vehicle;
    private LocalDate dateDebut;
    private LocalDate dateFin;

    public Reservation(User user, Vehicle vehicle, LocalDate dateDebut, LocalDate dateFin) {
        this.user = user;
        this.vehicle = vehicle;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
    }

    // Getters et setters
    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }
    public Vehicle getVehicle() { return vehicle; }
    public void setVehicle(Vehicle vehicle) { this.vehicle = vehicle; }
    public LocalDate getDateDebut() { return dateDebut; }
    public void setDateDebut(LocalDate dateDebut) { this.dateDebut = dateDebut; }
    public LocalDate getDateFin() { return dateFin; }
    public void setDateFin(LocalDate dateFin) { this.dateFin = dateFin; }

    @Override
    public String toString() {
        return "Reservation [user=" + user + ", vehicle=" + vehicle + ", dateDebut=" + dateDebut + ", dateFin=" + dateFin + "]";
    }
}
