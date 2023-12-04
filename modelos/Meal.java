package modelos;
public class Meal {
    private String name;
    private double macronutrients;
    private double calories;
    private double timeofday;

    public Meal(double calories, double macronutrients, double timeofday, String name) {
        this.name=name;
        this.macronutrients=macronutrients;
        this.timeofday=timeofday;
        this.calories = calories;
    }

    public void printInfo(){
        System.out.println("Nombre: " + name);
        System.out.println("Macronutrientes: " + macronutrients);
        System.out.println("Hora del dia: " + timeofday);
        System.out.println("Calorias: " + calories);
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public double getMacronutrients() {
        return macronutrients;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMacronutrients(double macronutrients) {
        this.macronutrients = macronutrients;
    }

    public double getTimeofday() {
        return timeofday;
    }

    public void setTimeofday(int timeofday) {
        this.timeofday = timeofday;
    }
}

    