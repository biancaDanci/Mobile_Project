package Domain;

public class User {
    private int ID;
    private String nume;
    private String parola;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public User(String nume, String parola) {

        this.nume = nume;
        this.parola = parola;
    }

    public User(int ID, String nume, String parola) {

        this.ID = ID;
        this.nume = nume;
        this.parola = parola;
    }
}
