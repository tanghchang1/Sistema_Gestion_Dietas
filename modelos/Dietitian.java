package modelos;
import javax.swing.plaf.PanelUI;
import java.util.LinkedList;

public class Dietitian {
    private String iddietitian;
    private String name;
    private String speciality;

    private LinkedList<Dietplan> misdietplans;


   private LinkedList<Patient> mispacientes;

    public Dietitian(String iddietitian, String name, String speciality) {
        this.iddietitian=iddietitian;
        this.name=name;
        this.speciality=speciality;
        this.misdietplans=new LinkedList<>();
        this.mispacientes=new LinkedList<>();
    }

    public LinkedList<Patient> getMispacientes() {
        return mispacientes;
    }

    public void setMispacientes(LinkedList<Patient> mispacientes) {
        this.mispacientes = mispacientes;
    }

    public LinkedList<Dietplan> getMisdietplans() {
        return misdietplans;
    }

    public void setMisdietplans(LinkedList<Dietplan> misdietplans) {
        this.misdietplans = misdietplans;
    }

    public void setIddietitian(String iddietitian) {
        this.iddietitian = iddietitian;
    }

    public String getIddietitian() {
        return iddietitian;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}
