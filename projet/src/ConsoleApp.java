import java.time.LocalDate;
import java.util.Scanner;

public class ConsoleApp {
    private VehicleManager vehicleManager;
    private UserManager userManager;
    private ReservationManager reservationManager;
    private MaintenanceManager maintenanceManager;
  //  private IncidentManager incidentManager;
   // private AuthorizationManager authorizationManager;
  //  private VehicleAvailabilityChecker availabilityChecker;
    private ReportGenerator reportGenerator;
    private Scanner scanner;

    public ConsoleApp() {
        vehicleManager = new VehicleManager();
        userManager = new UserManager();
        reservationManager = new ReservationManager();
        maintenanceManager = new MaintenanceManager();
      //  incidentManager = new IncidentManager();
        //authorizationManager = new AuthorizationManager();
        //availabilityChecker = new VehicleAvailabilityChecker();
        reportGenerator = new ReportGenerator();
        scanner = new Scanner(System.in);
    }

    public void start() {
        boolean running = true;

        while (running) {
            System.out.println("1. Ajouter un véhicule");
            System.out.println("2. Ajouter un utilisateur");
            System.out.println("3. Créer une réservation");
            System.out.println("4. Ajouter un entretien");
            System.out.println("5. Ajouter un incident");
            System.out.println("6. Générer des rapports");
            System.out.println("7. Quitter");
            System.out.print("Choisissez une option : ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    addVehicle();
                    break;
                case 2:
                    addUser();
                    break;
                case 3:
                    createReservation();
                    break;
                case 4:
                    addMaintenance();
                    break;
                case 5:
                    addIncident();
                    break;
                case 6:
                    generateReports();
                    break;
                case 7:
                    running = false;
                    break;
                default:
                    System.out.println("Option invalide.");
            }
        }
    }

    private void addVehicle() {
        System.out.print("Marque: ");
        String marque = scanner.nextLine();
        System.out.print("Modèle: ");
        String modele = scanner.nextLine();
        System.out.print("Année: ");
        int annee = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        System.out.print("Immatriculation: ");
        String immatriculation = scanner.nextLine();

        Vehicle vehicle = new Vehicle(marque, modele, annee, immatriculation);
        vehicleManager.addVehicle(vehicle);
        System.out.println("Véhicule ajouté avec succès.");
    }

    private void addUser() {
        System.out.print("Nom: ");
        String nom = scanner.nextLine();
        System.out.print("Permis: ");
        String permis = scanner.nextLine();
        System.out.print("Adresse: ");
        String adresse = scanner.nextLine();

        User user = new User(nom, permis, adresse);
        userManager.addUser(user);
        System.out.println("Utilisateur ajouté avec succès.");
    }

    private void createReservation() {
        System.out.print("Permis de l'utilisateur: ");
        String permis = scanner.nextLine();
        User user = userManager.getAllUsers().stream()
                .filter(u -> u.getPermis().equals(permis))
                .findFirst()
                .orElse(null);

        if (user == null) {
            System.out.println("Utilisateur non trouvé.");
            return;
        }

        System.out.print("Immatriculation du véhicule: ");
        String immatriculation = scanner.nextLine();
        Vehicle vehicle = vehicleManager.getAllVehicles().stream()
                .filter(v -> v.getImmatriculation().equals(immatriculation))
                .findFirst()
                .orElse(null);

        if (vehicle == null) {
            System.out.println("Véhicule non trouvé.");
            return;
        }

        System.out.print("Date de début (AAAA-MM-JJ): ");
        LocalDate dateDebut = LocalDate.parse(scanner.nextLine());
        System.out.print("Date de fin (AAAA-MM-JJ): ");
        LocalDate dateFin = LocalDate.parse(scanner.nextLine());



        Reservation reservation = new Reservation(user, vehicle, dateDebut, dateFin);
        reservationManager.addReservation(reservation);
        System.out.println("Réservation créée avec succès.");
    }

    private void addMaintenance() {
        System.out.print("Immatriculation du véhicule: ");
        String immatriculation = scanner.nextLine();
        Vehicle vehicle = vehicleManager.getAllVehicles().stream()
                .filter(v -> v.getImmatriculation().equals(immatriculation))
                .findFirst()
                .orElse(null);

        if (vehicle == null) {
            System.out.println("Véhicule non trouvé.");
            return;
        }

        System.out.print("Type d'entretien: ");
        String type = scanner.nextLine();
        System.out.print("Date (AAAA-MM-JJ): ");
        LocalDate date = LocalDate.parse(scanner.nextLine());
        System.out.print("Description: ");
        String description = scanner.nextLine();

        Maintenance maintenance = new Maintenance(vehicle, type, date, description);
        maintenanceManager.addMaintenance(maintenance);
        System.out.println("Entretien ajouté avec succès.");
    }

    private void addIncident() {
        System.out.print("Immatriculation du véhicule: ");
        String immatriculation = scanner.nextLine();
        Vehicle vehicle = vehicleManager.getAllVehicles().stream()
                .filter(v -> v.getImmatriculation().equals(immatriculation))
                .findFirst()
                .orElse(null);

        if (vehicle == null) {
            System.out.println("Véhicule non trouvé.");
            return;
        }

        System.out.print("Date (AAAA-MM-JJ): ");
        LocalDate date = LocalDate.parse(scanner.nextLine());
        System.out.print("Description: ");
        String description = scanner.nextLine();
        System.out.print("Coût: ");
        double cost = scanner.nextDouble();
        scanner.nextLine();  // Consume newline

        //Incident incident = new Incident(vehicle, date, description, cost);
        //incidentManager.addIncident(incident);
        System.out.println("Incident ajouté avec succès.");
    }

    private void generateReports() {
        System.out.println("1. Rapport des véhicules");
        System.out.println("2. Rapport des utilisateurs");
        System.out.println("3. Rapport des réservations");
        System.out.println("4. Rapport des entretiens");
        System.out.println("5. Rapport des incidents");
        System.out.print("Choisissez une option : ");

        int choice = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        switch (choice) {
            case 1:
                reportGenerator.generateVehicleReport(vehicleManager.getAllVehicles());
                break;
            case 2:
                reportGenerator.generateUserReport(userManager.getAllUsers());
                break;
            case 3:
                reportGenerator.generateReservationReport(reservationManager.getAllReservations());
                break;
            case 4:
                reportGenerator.generateMaintenanceReport(maintenanceManager.getAllMaintenances());
                break;
            case 5:
               // reportGenerator.generateIncidentReport(incidentManager.getAllIncidents());
                break;
            default:
                System.out.println("Option invalide.");
        }
    }

    public static void main(String[] args) {
        ConsoleApp app = new ConsoleApp();
        app.start();
    }
}
