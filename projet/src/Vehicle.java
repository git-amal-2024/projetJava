public class Vehicle {
    private String marque;
    private String modele;
    private int annee;
    private String immatriculation;

    public Vehicle(String marque, String modele, int annee, String immatriculation) {
        this.marque = marque;
        this.modele = modele;
        this.annee = annee;
        this.immatriculation = immatriculation;
    }

    // Getters et setters
    public String getMarque() { return marque; }
    public void setMarque(String marque) { this.marque = marque; }
    public String getModele() { return modele; }
    public void setModele(String modele) { this.modele = modele; }
    public int getAnnee() { return annee; }
    public void setAnnee(int annee) { this.annee = annee; }
    public String getImmatriculation() { return immatriculation; }
    public void setImmatriculation(String immatriculation) { this.immatriculation = immatriculation; }

    @Override
    public String toString() {
        return "Vehicle [marque=" + marque + ", modele=" + modele + ", annee=" + annee + ", immatriculation=" + immatriculation + "]";
    }
}
