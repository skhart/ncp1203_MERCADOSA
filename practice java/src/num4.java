import javax.swing.JOptionPane;

public class num4{
    public static void main(String[] args) {
        // Input initial tuition fee
        String initialTuitionFeeInput = JOptionPane.showInputDialog("Tuition Fee (PHP):");
        double initialTuitionFee = Double.parseDouble(initialTuitionFeeInput);

        // Input increase rate
        String increaseRateInput = JOptionPane.showInputDialog("Increase Rate (Percentage):");
        double increaseRate = Double.parseDouble(increaseRateInput) / 100; // Convert percentage to decimal

        // Input number of years
        String numberOfYearsInput = JOptionPane.showInputDialog("Number of Years:");
        int numberOfYears = Integer.parseInt(numberOfYearsInput);

        StringBuilder output = new StringBuilder();
        output.append("------------------\n");
        output.append("Year\tEst. Tuition Fee at ").append((increaseRate * 100)).append("% IR\n");

        for (int year = 1; year <= numberOfYears; year++) {
            double estimatedTuitionFee = initialTuitionFee * Math.pow(1 + increaseRate, year);
            output.append(year).append("\tPHP ").append(String.format("%.2f", estimatedTuitionFee)).append("\n");
        }

        // Display the result using JOptionPane
        JOptionPane.showMessageDialog(null, output.toString());

        System.exit(0);
    }
}
