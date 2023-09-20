import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class num3 {
    public static void main(String[] args) {
        JTextField distanceKm= new JTextField();    JTextField pricePerGallon= new JTextField();
        JTextField efficiencykpg= new JTextField();
        Object[] message = {"Enter the driving distance:", distanceKm,    
                            "Enter KM per gallon:", efficiencykpg,
                            "Enter price per gallon",pricePerGallon}; 
        Double resultMessage= (double)JOptionPane.showConfirmDialog(null, message, "Car Efficiency", 
                        JOptionPane.OK_CANCEL_OPTION);

        double costOfTrip = (Double.parseDouble(distanceKm.getText()) / Double.parseDouble(efficiencykpg.getText())) * Double.parseDouble(pricePerGallon.getText());
        if(resultMessage==JOptionPane.OK_OPTION){
            JOptionPane.showMessageDialog(null,"Distance/km:"+distanceKm.getText()+"\n"+ 
                "Price/gallon:"+pricePerGallon.getText()+"\n"+"KM/Gallon"+efficiencykpg.getText()+"\n"+
                "========================"+"\n"
                +"The cost of the trip is:   \u20B1" + costOfTrip);}}}      