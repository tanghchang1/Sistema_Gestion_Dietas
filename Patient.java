
import javax.naming.LimitExceededException;

public class Patient {
    private String PatientId;
    private String Name;
    private int Age;
    private double weight;
    private double Height;
    private String preexistingCondition;
    private Dietplan midietplan;

    public Patient(String patientId,String Name,int Age,double weight,double Height,String preexistingCondition) {
        this.PatientId = patientId;
        this.Name=Name;
        this.Age=Age;
        this.weight= weight;
        this.Height=Height;
        this.preexistingCondition=preexistingCondition;
    }

    // Método para imprimir información del paciente
    public void printInfo() {
        System.out.println("Patient ID: " + PatientId);
        System.out.println("Name: " + Name);
        System.out.println("Age: " + Age);
        System.out.println("Weight: " + weight);
        System.out.println("Height: " + Height);
        System.out.println("Preexisting Condition: " + preexistingCondition);
        System.out.println("Diet Plan: " + midietplan);
        System.out.println();
    }

    public Dietplan getMidietplan() {
        return midietplan;
    }

    public void setMidietplan(Dietplan midietplan) {
        this.midietplan = midietplan;
    }

    public String getPatientId() {
        return PatientId;
    }

    public void setPatientId(String patientId) {
        PatientId = patientId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getHight() {
        return Height;
    }

    public void setHight(double hight) {
        Height = hight;
    }

    public String getPreexistingCondition() {
        return preexistingCondition;
    }

    public void setPreexistingCondition(String preexistingCondition) {
        this.preexistingCondition = preexistingCondition;
    }
}

