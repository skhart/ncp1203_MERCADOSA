import javax.swing.JOptionPane;

public class num6 {
    public static void main(String[] args) {
        int Input = Integer.parseInt(JOptionPane.showInputDialog("Enter a number:"));

        String message = "";

        if (Input % 3 == 0 && Input % 5 == 0) {
            message = "Hep-Hep Hooray";
        }else if (Input % 3 == 0) {
            message = "Hep-Hep";
        }else if (Input % 5 == 0) {
            message = "Hooray";
        }else {
            message = "oh no!";}
        JOptionPane.showMessageDialog(null, "Your Input:"+Input+"\n\n"+message);}}