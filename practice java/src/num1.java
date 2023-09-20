import java.text.DecimalFormat;
import javax.swing.*;
public class num1 {
    public static void main(String[] args){
        JTextField SubTotalBill= new JTextField();
        JTextField TipRate= new JTextField();
        Object[] message = {"Sub Total Bill:", SubTotalBill,    
                            "Tip Rate:", TipRate};   
                                
        Double Input = (double)JOptionPane.showConfirmDialog(null, message, "XYZ Restaurant", 
            JOptionPane.OK_CANCEL_OPTION);
        if(Input==JOptionPane.OK_OPTION){
            double TipAmount= Double.parseDouble(SubTotalBill.getText()) * Double.parseDouble(TipRate.getText())/ 100.00;
            double TotalBill= Float.parseFloat(SubTotalBill.getText()) + TipAmount; 
        DecimalFormat DeciFormat= new DecimalFormat(".00");
        String DeciTipAmount= DeciFormat.format(TipAmount);
        String DeciTotalBill= DeciFormat.format(TotalBill);
            JOptionPane.showMessageDialog(null,"Tip Amount:"+DeciTipAmount+"\n"+"TotalBill:"+DeciTotalBill+"\n"+"\n"
                                          +"Subtotal Bill:"+SubTotalBill.getText()+"\n"+"Tip Given:"+TipRate.getText());}}}