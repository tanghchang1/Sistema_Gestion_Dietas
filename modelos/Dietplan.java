package modelos;
import java.util.LinkedList;
    public class Dietplan {
        private String planId;
        private int dailyCalories;
        private double macronutrientDistribution;
        private String specificRecommendations;
        private LinkedList<Meal> miscomidas;
    
    
        public Dietplan(int dailyCalories,double macronutrientDistribution,String planId,String specificRecommendations) {
            this.planId=planId;
            this.dailyCalories=dailyCalories;
            this.macronutrientDistribution=macronutrientDistribution;
            this.specificRecommendations=specificRecommendations;
            this.miscomidas=new LinkedList<>();
        }
    //metodo para imprimir informacion
     public void printInfo(){
         System.out.println("Id "+planId);
         System.out.println("Calorias "+dailyCalories);
         System.out.println("Macronutrientes "+macronutrientDistribution);
         System.out.println("Recomendaciones "+specificRecommendations);
         System.out.println("Comidas "+miscomidas);
    
    
     }
    
        public LinkedList<Meal> getMiscomidas() {
            return miscomidas;
        }
    
        public void setMiscomidas(LinkedList<Meal> miscomidas) {
            this.miscomidas = miscomidas;
        }
    
        public int getDailyCalories() {
            return dailyCalories;
        }
    
        public void setDailyCalories(int dailyCalories) {
            this.dailyCalories = dailyCalories;
        }
    
        public double getMacronutrientDistribution() {
            return macronutrientDistribution;
        }
    
        public void setMacronutrientDistribution(int macronutrientDistribution) {
            this.macronutrientDistribution = macronutrientDistribution;
        }
    
        public String getPlanId() {
            return planId;
        }
    
        public void setPlanId(String planId) {
            this.planId = planId;
        }
    
        public String getSpecificRecommendations() {
            return specificRecommendations;
        }
    
        public void setSpecificRecommendations(String specificRecommendations) {
            this.specificRecommendations = specificRecommendations;
        }
    }
    
