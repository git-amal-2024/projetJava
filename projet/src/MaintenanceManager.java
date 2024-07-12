import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MaintenanceManager {
    private List<Maintenance> maintenances;

    public MaintenanceManager() {
        this.maintenances = new ArrayList<>();
    }

    public void addMaintenance(Maintenance maintenance) {
        maintenances.add(maintenance);
    }

    public List<Maintenance> getMaintenancesByVehicle(Vehicle vehicle) {
        return maintenances.stream()
                .filter(maintenance -> maintenance.getVehicle().equals(vehicle))
                .collect(Collectors.toList());
    }

    public List<Maintenance> getAllMaintenances() {
        return new ArrayList<>(maintenances);
    }
}
