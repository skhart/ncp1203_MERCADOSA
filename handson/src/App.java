
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        int money=1000;                                                                                 
    do{
        int menu=Integer.parseInt(JOptionPane.showInputDialog(" menu\n \n 1.Check balance input \n 2.Deposit input \n 3. Withdraw \n 4. Quit" ));
        if(menu==1){
            JOptionPane.showMessageDialog(null, "Initial Balance:"+money); 
        }if(menu==2){
            int deposit=Integer.parseInt(JOptionPane.showInputDialog("Deposit"));
            if(deposit < 0){JOptionPane.showMessageDialog(null, "input is invalid"); 
            }else if(deposit > 1) 
            {int Deposits=deposit+money;
            JOptionPane.showMessageDialog(null, "New Balance:"+Deposits); }
        }if(menu==3){
            int depositss=Integer.parseInt(JOptionPane.showInputDialog("Deposit"));
            int Deposits=money-depositss ;
                if(Deposits < 0){
                        JOptionPane.showMessageDialog(null, "input is invalid");    
                }else{JOptionPane.showMessageDialog(null,"New Balance:"+ Deposits); }
        }if(menu==4){
            JOptionPane.showMessageDialog(null, "Thank you for using the simple bank system!");
        }
    }while(true);
    }
    }