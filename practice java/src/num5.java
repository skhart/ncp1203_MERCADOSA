import javax.swing.JOptionPane;
public class num5 {
    public static void main(String[] args) {
        String mobileNumber=(JOptionPane.showInputDialog(null,"Enter your Number","Telco Prefix",JOptionPane.OK_CANCEL_OPTION));

        if (mobileNumber.length() != 11) {
            JOptionPane.showConfirmDialog(null,"Error: Mobile number should be 11 digits.",
                "Error",JOptionPane.YES_OPTION);    return;}
            
        String prefix = mobileNumber.substring(0, 4); String network;

        switch (prefix) {
            
            case "0905":    case "0915":
            case "0906":    case "0916":   network = "Globe";     
            break;

            case "0917":    case"0908":
            case "0918":    case"0961": network = "Smart";
            break;    
                 
            case "0920":    case "0928":
            case "0921":    network = "Talk 'N Text";
            break;
                
            case "0933":    case "0942":
            case "0934":    network = "Sun Cellular";
            break;

            default:
                network = "Unknown";    break;
    
        }JOptionPane.showMessageDialog(null,"The mobile network is: " + network);}}