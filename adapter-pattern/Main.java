
public class Main {
    public static void main(String[] args) {
        double weightInKg = 70;
        double heightInMeter = 1.75; 
        double bmi = BMIAdapter.calculateBMI(weightInKg, heightInMeter);
        System.out.println("BMI: " + bmi);
        System.out.println("BMI Category: " + BMIAdapter.getBMICategory(bmi));
    }
}
