import java.time.LocalDate;


public class Main {

    public static void main(String[] args) {
        VehicleManager vehicleManager = new VehicleManager();
        UserManager userManager = new UserManager();
        ReservationManager reservationManager = new ReservationManager();
        ReportGenerator reportGenerator = new ReportGenerator();

        // Ajouter des véhicules
        Vehicle vehicle1 = new Vehicle("Toyota", "Corolla", 2020, "ABC123");
        Vehicle vehicle2 = new Vehicle("Honda", "Civic", 2019, "XYZ789");
        vehicleManager.addVehicle(vehicle1);
        vehicleManager.addVehicle(vehicle2);

        // Ajouter des utilisateurs
        User user1 = new User("Alice", "PERMIS123", "123 rue A");
        User user2 = new User("Bob", "PERMIS456", "456 rue B");
        userManager.addUser(user1);
        userManager.addUser(user2);

        // Créer des réservations
        Reservation reservation1 = new Reservation(user1, vehicle1, LocalDate.now(), LocalDate.now().plusDays(3));
        Reservation reservation2 = new Reservation(user2, vehicle2, LocalDate.now(), LocalDate.now().plusDays(5));
        reservationManager.addReservation(reservation1);
        reservationManager.addReservation(reservation2);

        // Générer des rapports
        reportGenerator.generateVehicleReport(vehicleManager.getAllVehicles());
        reportGenerator.generateUserReport(userManager.getAllUsers());
        reportGenerator.generateReservationReport(reservationManager.getAllReservations());
    }
}
