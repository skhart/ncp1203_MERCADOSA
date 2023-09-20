import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.util.Random;
public class num1 {
    public static void main(String[] args) throws Exception {
        JTextField num1 = new JTextField(); JTextField num2 = new JTextField();
        Object[] options= {"num1",num1,"num2",num2};
        int Enter=(int)JOptionPane.showConfirmDialog(null,options
            ,"Input Numbers:",JOptionPane.OK_OPTION);
        
        if(Enter==JOptionPane.OK_OPTION){
            int NUM1= Integer.parseInt(num1.getText()); 
            int NUM2= Integer.parseInt(num2.getText());
            int one = 0,two= 0,three= 0;
        for(int i = NUM1; NUM2 <= i ;i++){

            if(i % 2 == 0)
        {one++;
            
            } if(i % 3 == 0)
            {two++;
                
            } if(i % 2 == 0 && i % 3 == 0)
            {three++;
                }
            }
        JOptionPane.showMessageDialog(null,"a:"+one);     
        JOptionPane.showMessageDialog(null,"b:"+two); 
        JOptionPane.showMessageDialog(null,"c:"+three);  
        }
    }
}
class tuitionfee{
    public static void main(String[] args) throws Exception{
        JTextField T_fee= new JTextField(); JTextField Rates= new JTextField(); JTextField N_years= new JTextField();
        Object[] options= {"Tuition fee:",T_fee,
                            "Increased Rates:",Rates,
                            "Number of years:",N_years};
        int Enter=(int)JOptionPane.showConfirmDialog(null,options,"Tuition fee",JOptionPane.OK_CANCEL_OPTION);
        if(Enter==JOptionPane.OK_OPTION){
            double Tui_Fee= Double.parseDouble(T_fee.getText()); 
            double rate= Double.parseDouble(Rates.getText()) /100;
            double Years= Double.parseDouble(N_years.getText()); 
            if(Tui_Fee==0 & rate ==0 & Years==0){
                    JOptionPane.showMessageDialog(null,"incorrect input for the number of years!"); 
            }else{
                StringBuilder Result_message=new StringBuilder();       
                Result_message.append("------------------\n");
                Result_message.append("Year\tEst. Tuition Fee at ").append((rate)).append("% IR\n");
                for(int i=1; i <= Years; i++){
                   double est_tui_fee=(double)Tui_Fee * Math.pow(1 + rate, i);
                   Result_message.append(i).append("\t\u20B1").append(String.format("%.2f", est_tui_fee)).append("\n");}
                   JOptionPane.showMessageDialog(null,Result_message.toString()); }}}}
 class InBetweenGame {
    public static void main(String[] args) {
        double pocketMoney = 1000.00;
        Random random = new Random();
        int minNumber = 1;
        int maxNumber = 13;

        while (pocketMoney > 0) {
            String pocketMoneyString = String.format("Pocket Money: PHP %.2f", pocketMoney);
            String inputBetAmount = JOptionPane.showInputDialog(null, pocketMoneyString + "\nEnter your bet amount (0 to quit):");
            double betAmount = Double.parseDouble(inputBetAmount);

            if (betAmount == 0) {
                JOptionPane.showMessageDialog(null, "Game over. You are quitting with PHP " + pocketMoney);
                break;
            }

            if (betAmount > pocketMoney) {
                JOptionPane.showMessageDialog(null, "You don't have enough pocket money to place that bet.");
                continue;
            }

            int firstCard = random.nextInt(maxNumber - minNumber + 1) + minNumber;
            int secondCard = random.nextInt(maxNumber - minNumber + 1) + minNumber;
            int thirdCard = random.nextInt(maxNumber - minNumber + 1) + minNumber;

            String message = "First card: " + firstCard + "\nSecond card: " + secondCard + "\n";

            if (firstCard == secondCard) {
                message += "Third card: " + thirdCard + "\n";
                int choice = JOptionPane.showOptionDialog(
                    null,
                    message + "The cards are equal. Do you want to go higher or lower?",
                    "Choose an option",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    new String[]{"Higher", "Lower"},
                    "Higher"
                );

                if ((choice == 0 && thirdCard > firstCard) || (choice == 1 && thirdCard < firstCard)) {
                    pocketMoney += betAmount * 2;
                    message += "Congratulations! You won PHP " + (betAmount * 2) + "\nPocket Money: PHP " + pocketMoney;
                } else {
                    pocketMoney -= betAmount;
                    message += "Sorry, you lost PHP " + betAmount + "\nPocket Money: PHP " + pocketMoney;
                }

                JOptionPane.showMessageDialog(null, message);
            } else {
                int choice = JOptionPane.showOptionDialog(
                    null,
                    message + "Deal or no deal?",
                    "Choose an option",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    new String[]{"Deal", "No Deal"},
                    "Deal"
                );

                if (choice == 1) {
                    pocketMoney += betAmount;
                    JOptionPane.showMessageDialog(null, "You decided not to deal. You won PHP " + betAmount + "\nPocket Money: PHP " + pocketMoney);
                } else {
                    if ((choice == 0 && firstCard < secondCard) || (choice == 1 && firstCard > secondCard)) {
                        pocketMoney += betAmount * 2;
                        message += "Congratulations! You won PHP " + (betAmount * 2) + "\nPocket Money: PHP " + pocketMoney;
                        JOptionPane.showMessageDialog(null, message);
                    } else {
                        pocketMoney -= betAmount;
                        message += "Sorry, you lost PHP " + betAmount + "\nPocket Money: PHP " + pocketMoney;
                        JOptionPane.showMessageDialog(null, message);
                    }
                }
            }
        }

        if (pocketMoney <= 0) {
            JOptionPane.showMessageDialog(null, "Game over. You are out of pocket money.");
        }
    }
}

