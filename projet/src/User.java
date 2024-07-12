public class User {
    private String nom;
    private String permis;
    private String adresse;

    public User(String nom, String permis, String adresse) {
        this.nom = nom;
        this.permis = permis;
        this.adresse = adresse;
    }

    // Getters et setters
    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }
    public String getPermis() { return permis; }
    public void setPermis(String permis) { this.permis = permis; }
    public String getAdresse() { return adresse; }
    public void setAdresse(String adresse) { this.adresse = adresse; }

    @Override
    public String toString() {
        return "User [nom=" + nom + ", permis=" + permis + ", adresse=" + adresse + "]";
    }
}
