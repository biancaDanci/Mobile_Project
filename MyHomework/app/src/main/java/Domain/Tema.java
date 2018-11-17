package Domain;
import java.time.Duration;
import java.time.LocalDateTime;
public class Tema {
    private int ID;
    private int ID_Medie;
    private String descriere;
    private Duration timp_estimat;
    private int prioritate;
    private Double nota;
    private LocalDateTime deadline;

    public Tema(int ID_Medie, String descriere, Duration timp_estimat, int prioritate, Double nota, LocalDateTime deadline) {
        this.ID_Medie = ID_Medie;
        this.descriere = descriere;
        this.timp_estimat = timp_estimat;
        this.prioritate = prioritate;
        this.nota = nota;
        this.deadline = deadline;
    }

    public Tema(int ID, int ID_Medie, String descriere, Duration timp_estimat, int prioritate, Double nota, LocalDateTime deadline) {
        this.ID = ID;
        this.ID_Medie = ID_Medie;
        this.descriere = descriere;
        this.timp_estimat = timp_estimat;
        this.prioritate = prioritate;
        this.nota = nota;
        this.deadline = deadline;
    }

    @Override
    public String toString() {
        return "Tema{" +
                "ID=" + ID +
                ", ID_Medie=" + ID_Medie +
                ", descriere='" + descriere + '\'' +
                ", timp_estimat=" + timp_estimat +
                ", prioritate=" + prioritate +
                ", nota=" + nota +
                ", deadline=" + deadline +
                '}';
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getID_Medie() {
        return ID_Medie;
    }

    public void setID_Medie(int ID_Medie) {
        this.ID_Medie = ID_Medie;
    }

    public String getDescriere() {
        return descriere;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }

    public Duration getTimp_estimat() {
        return timp_estimat;
    }

    public void setTimp_estimat(Duration timp_estimat) {
        this.timp_estimat = timp_estimat;
    }

    public int getPrioritate() {
        return prioritate;
    }

    public void setPrioritate(int prioritate) {
        this.prioritate = prioritate;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public LocalDateTime getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDateTime deadline) {
        this.deadline = deadline;
    }
}
