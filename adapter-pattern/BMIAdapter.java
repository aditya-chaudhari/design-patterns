import FitnessLib.BMICalculator;

public class BMIAdapter {
    
    public static double calculateBMI(double weight, double height) {
        return BMICalculator.calculateBMIInLbsAndInches(convertKgToLbs(weight), convertMeterToInches(height));
    }

    public static double convertKgToLbs(double weightInKg) {
        return weightInKg * 2.20462;
    }

    public static double convertMeterToInches(double heightInMeter) {
        return heightInMeter * 39.3701;
    }

    public static String getBMICategory(double bmi) {
        return BMICalculator.getBMICategory(bmi);
    }
}
