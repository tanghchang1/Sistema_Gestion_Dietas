package src;
import javax.swing.*;
    import java.util.LinkedList;
    import modelos.Patient;
    import modelos.Meal;
    import modelos.Dietplan;
    
    public class Main {
        public static void main(String[] args) {
            String Id = JOptionPane.showInputDialog("Ingrese el ID del usuario");
            String name = JOptionPane.showInputDialog("Ingrese el nombre del paciente");
            int age = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad del paciente"));
            double weihgt = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso del paciente"));
            double height = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura del paciente"));
            String preexistingcondicion = JOptionPane.showInputDialog("Ingresa las recomendaciones");
            Patient mipaciente = new Patient(Id, name, age, weihgt, height, preexistingcondicion);
            mipaciente.printInfo();
    
            String id_del_plan = JOptionPane.showInputDialog("digita el id del plan");
            int calorias = Integer.parseInt(JOptionPane.showInputDialog("digita las calorias diarias"));
            double macronutrients = Double.parseDouble(JOptionPane.showInputDialog("Digita los macronutrientes totales"));
            String recomendations = JOptionPane.showInputDialog("Digita las recomendaciones");
            Dietplan midietplan = new Dietplan(calorias, macronutrients, id_del_plan, recomendations);
            midietplan.printInfo();
            LinkedList<Meal> miscomidas = new LinkedList<>();
            boolean bandera = true;
            while (bandera) {
                String namec = JOptionPane.showInputDialog("Nombre de la comida");
                double macronut = Double.parseDouble(JOptionPane.showInputDialog("macronutrientes de la comida"));
                double calories = Double.parseDouble(JOptionPane.showInputDialog("calorias de la comida"));
                double timeofday = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la hora de comer"));
                Meal micomida = new Meal(calories, macronut, timeofday, namec);
                miscomidas.add(micomida);
                micomida.printInfo();
                int escape = Integer.parseInt(JOptionPane.showInputDialog("ingrese 1 si desea cear otra comida o 0 para salir"));
                if (escape == 0) {
                    bandera = false;
    
                }
            }
            }
        }
        
    
    
