import java.text.DecimalFormat;
import javax.swing.JOptionPane;
public class num7 {
    public static void main(String[] args) {
        double monthlySalary = Double.parseDouble(JOptionPane.showInputDialog("Enter the monthly salary in Philippine Peso:"));

        double annualTaxableIncome = monthlySalary * 12;

        double incomeTax = calculateIncomeTax(annualTaxableIncome);

        DecimalFormat DeciFormat= new DecimalFormat(".00");
        String DeciIncomeTax= DeciFormat.format(incomeTax);

        String resultMessage = "Monthly income tax: ₱" + DeciIncomeTax;
        JOptionPane.showMessageDialog(null, resultMessage);}
    
    public static double calculateIncomeTax(double annualIncome) {
        double tax = 0.0;

        if (annualIncome <= 250000) {tax = 0.0;
        }else if (annualIncome <= 400000) {
            tax = (annualIncome - 250000) * 0.2; // 20% tax rate
        }else if (annualIncome <= 800000) {
            tax = (annualIncome - 400000) * 0.25 + 30000; // 25% tax rate with fixed tax
        }else if (annualIncome <= 2000000) {
            tax = (annualIncome - 800000) * 0.3 + 130000; // 30% tax rate with fixed tax
        }else {
            tax = (annualIncome - 2000000) * 0.35 + 490000;} // 35% tax rate with fixed tax
        return tax / 12;}}// Divide by 12 to get monthly tax
