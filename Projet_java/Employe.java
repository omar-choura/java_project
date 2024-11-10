package Projet2;

public class Employe extends Personne {

    private String fonction;
    private Date de;
    private String situation;
    private double salaire;

    public Employe(String n, String p, int cIN, Date dt, Date DE, String situation, double salaire, String fonction) {
        super(n, p, cIN, dt);
        this.fonction = fonction;
        this.de = DE;
        this.situation = situation;
        this.salaire = salaire;
    }

    public Date getDe() {
        return de;
    }

    public void setDe(Date de) {
        this.de = de;
    }

    public String getSituation() {
        return situation;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public String getFonction() {
        return fonction;
    }

    public void setFonction(String fonction) {
        this.fonction = fonction;
    }

    public void affiche() {
        super.affiche();
        System.out.println("Fonctio=" + fonction + " date embauche=" + de.toString() + " situation=" + situation + " salaire=" + salaire);
    }

    public String toString() {
        return super.toString() + "Fonctio=" + fonction + " date embauche=" + de.toString() + " situation=" + situation + " salaire=" + salaire;
    }

    public boolean anciennete(Date d1) {
        int annees = d1.getA() - this.getDe().getA();
        if (d1.getM() < this.getDe().getM() || (d1.getM() == this.getDe().getM() && d1.getJ() < this.getDe().getJ())) {
            annees--;
        }
        return annees >= 5;
    }



    public String situation() {
        Date dateActuelle = new Date();
        int annees = dateActuelle.getA() - de.getA();
        if (dateActuelle.getM() < de.getM() || (dateActuelle.getM() == de.getM() && dateActuelle.getJ() < de.getJ())) {
            annees--;
        }
        if (annees > 4)
            this.situation = "Titulaire";
        else
            this.situation = "Contractuelle";
        return situation;
    }

    public void augmenterSalaire() {
        this.setSalaire(this.getSalaire() * 2);
    }

}
