import java.time.LocalDate;

public class Maintenance {
    private Vehicle vehicle;
    private String type;
    private LocalDate date;
    private String description;

    public Maintenance(Vehicle vehicle, String type, LocalDate date, String description) {
        this.vehicle = vehicle;
        this.type = type;
        this.date = date;
        this.description = description;
    }

    // Getters et setters
    public Vehicle getVehicle() { return vehicle; }
    public void setVehicle(Vehicle vehicle) { this.vehicle = vehicle; }
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    @Override
    public String toString() {
        return "Maintenance [vehicle=" + vehicle + ", type=" + type + ", date=" + date + ", description=" + description + "]";
    }
}
