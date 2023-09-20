import javax.swing.JOptionPane;

public class ccc {
    public static void main(String[] args) {
        Boolean repeat = false;
        Boolean loop1 = false;
        Boolean loop2 = false;
        double balance = 1000;
        do {
            JOptionPane.showMessageDialog(null, "Welcome to the Simple Banking System!" , "Simple Banking System!", JOptionPane.PLAIN_MESSAGE);
                int choice = Integer.parseInt(JOptionPane.showInputDialog(null, "Your initial balance is : "+ balance +"\n Menu: \n[1] Check Balance\n[2] Deposit money\n[3] Withdraw money\n[4] Quit" , "PHILLIPINE NATIONAL BANK", JOptionPane.PLAIN_MESSAGE));
                if (choice == 1){
                    JOptionPane.showMessageDialog(null, "Your balance is : " + balance , "Simple Banking System", JOptionPane.PLAIN_MESSAGE);
                } else if (choice == 2) {
                    while (!loop1){
                    double deposit = Double.parseDouble(JOptionPane.showInputDialog(null, "How much you want to deposit?  " , "Simple Banking System", JOptionPane.PLAIN_MESSAGE));
                    if (deposit > 0){
                        balance = balance + deposit;
                        JOptionPane.showMessageDialog(null, "Successful!! Your deposited money is added to your balance" , "Simple Banking System", JOptionPane.PLAIN_MESSAGE);
                        loop1 = true;
                    } else {
                        JOptionPane.showMessageDialog(null, "INVALID INPUT", "ERROR", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                } else if (choice == 3) {
                    while (!loop2){
                    double Withdraw = Double.parseDouble(JOptionPane.showInputDialog(null, "How much you want to withdraw?  " , "Simple Banking System", JOptionPane.PLAIN_MESSAGE));
                    if (Withdraw > 0 && balance >= Withdraw){
                        balance = balance - Withdraw;
                        JOptionPane.showMessageDialog(null, "Successful!! You have withdrawed " + Withdraw + " on your Bank account" , "Simple Banking System", JOptionPane.PLAIN_MESSAGE);
                        loop2 = true;
                    } else {
                        JOptionPane.showMessageDialog(null, "INVALID INPUT", "ERROR", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                } else if (choice == 4) {
                    JOptionPane.showMessageDialog(null, "Thank you! Come again", "ERROR", JOptionPane.ERROR_MESSAGE);
                    repeat = true;
                } else {
                    JOptionPane.showMessageDialog(null, "INVALID INPUT", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            
            } while (!repeat);
        
    }
}