package FitnessLib;

public class BMICalculator {

    public static double calculateBMIInLbsAndInches(double weightInLbs, double heightInInches) {
        return (weightInLbs / (heightInInches * heightInInches)) * 703;
    }

    public static String getBMICategory(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            return "Normal weight";
        } else if (bmi >= 25 && bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obesity";
        }
    }
}
