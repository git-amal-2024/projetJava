import java.util.List;

public class ReportGenerator {
    public void generateVehicleReport(List<Vehicle> vehicles) {
        System.out.println("Rapport des véhicules:");
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }
    }

    public void generateUserReport(List<User> users) {
        System.out.println("Rapport des utilisateurs:");
        for (User user : users) {
            System.out.println(user);
        }
    }

    public void generateReservationReport(List<Reservation> reservations) {
        System.out.println("Rapport des réservations:");
        for (Reservation reservation : reservations) {
            System.out.println(reservation);
        }
    }

    public void generateMaintenanceReport(List<Maintenance> maintenances) {
        System.out.println("Rapport des entretiens:");
        for (Maintenance maintenance : maintenances) {
            System.out.println(maintenance);
        }
    }

}
