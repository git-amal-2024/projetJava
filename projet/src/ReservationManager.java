import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ReservationManager {
    private List<Reservation> reservations;

    public ReservationManager() {
        this.reservations = new ArrayList<>();
    }

    public void addReservation(Reservation reservation) {
        reservations.add(reservation);
    }

    public void cancelReservation(User user, Vehicle vehicle) {
        reservations.removeIf(reservation -> reservation.getUser().equals(user) && reservation.getVehicle().equals(vehicle));
    }

    public List<Reservation> getReservationsByUser(User user) {
        return reservations.stream()
                .filter(reservation -> reservation.getUser().equals(user))
                .collect(Collectors.toList());
    }

    public List<Reservation> getReservationsByVehicle(Vehicle vehicle) {
        return reservations.stream()
                .filter(reservation -> reservation.getVehicle().equals(vehicle))
                .collect(Collectors.toList());
    }

    public List<Reservation> getAllReservations() {
        return new ArrayList<>(reservations);
    }
}
