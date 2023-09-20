import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class App {
    public static void main(String[] args) throws Exception {
        JTextField num1 = new JTextField(); JTextField num2 = new JTextField();
        Object[] options= {"Number1:",num1,"Number2:",num2};
        int Enter=(int)JOptionPane.showConfirmDialog(null,options
                ,"Enter Number:",JOptionPane.OK_OPTION);
        int one= 0; int two= 0;  int three= 0;
        if(Enter==JOptionPane.OK_OPTION){
            int NUM1= Integer.parseInt(num1.getText());
            int NUM2= Integer.parseInt(num2.getText());
            for (int i = NUM1; i <= NUM2; i++) {
                if (i % 2 == 0) {
                    one++;}
                if (i % 3 == 0) {
                    two++;}
                if (i % 2 == 0 && i % 3 == 0) {
                    three++;}}
            JOptionPane.showMessageDialog(null,"Divisible by 2: "+one+"\n"+
                    "Divisible by 3: "+two+"\n"+"Divisible by both number: "+three);}}}
