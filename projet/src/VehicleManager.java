import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class VehicleManager {
    private List<Vehicle> vehicles;

    public VehicleManager() {
        this.vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void removeVehicle(String immatriculation) {
        vehicles.removeIf(vehicle -> vehicle.getImmatriculation().equals(immatriculation));
    }

    public List<Vehicle> searchVehicles(String marque, String modele, int annee) {
        return vehicles.stream()
                .filter(vehicle -> (marque == null || vehicle.getMarque().equals(marque)) &&
                        (modele == null || vehicle.getModele().equals(modele)) &&
                        (annee == 0 || vehicle.getAnnee() == annee))
                .collect(Collectors.toList());
    }

    public List<Vehicle> getAllVehicles() {
        return new ArrayList<>(vehicles);
    }
}
