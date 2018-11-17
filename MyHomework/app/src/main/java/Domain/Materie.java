package Domain;

public class Materie {
    private int ID;
    private String nume;
    private String nume_Prof;
    private double medie;

    public Materie(int ID, String nume, String nume_Prof, double medie) {
        this.ID = ID;
        this.nume = nume;
        this.nume_Prof = nume_Prof;
        this.medie = medie;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Meterie{" +
                "nume='" + nume + '\'' +
                ", nume_Prof='" + nume_Prof + '\'' +
                ", medie=" + medie +
                '}';
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getNume_Prof() {
        return nume_Prof;
    }

    public void setNume_Prof(String nume_Prof) {
        this.nume_Prof = nume_Prof;
    }

    public double getMedie() {
        return medie;
    }

    public void setMedie(double medie) {
        this.medie = medie;
    }

    public Materie(String nume, String nume_Prof, double medie) {

        this.nume = nume;
        this.nume_Prof = nume_Prof;
        this.medie = medie;
    }
}
