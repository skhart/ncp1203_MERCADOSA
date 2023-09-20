import javax.swing.*;
public class num2{
    private static String classification;
    public static void main(String[] args) {
        JPanel panel = new JPanel(); 

        JTextField side1= new JTextField(10);   

        JTextField side2= new JTextField(10); JTextField side3= new JTextField(10);
        
        Object[] option = {"By Side","By Angle","Quit"}; Object[] options = {"ENTER"};
        
        panel.add(new JLabel("Side1"));  panel.add(side1);      
        
        panel.add(new JLabel("Side2"));  panel.add(side2);      
        
        panel.add(new JLabel("Side3"));  panel.add(side3);     
        
    Double Entrance=(double)JOptionPane.showOptionDialog(null,null, "Triangle Classifier",
    JOptionPane.YES_OPTION, JOptionPane.PLAIN_MESSAGE,null, options, null);
    
    Double Result=(double)JOptionPane.showOptionDialog(null,panel, "Triangle Classifier",
    JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE,null, option, null);
    
if(Entrance==JOptionPane.YES_OPTION){  
    if(Result==JOptionPane.YES_OPTION){
        if(side1.getText().isEmpty() || side2.getText().isEmpty() || side3.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Please ensure to input your angles or sides before proceeding",
            "Option 1 (By Side)",JOptionPane.WARNING_MESSAGE);
        }else if(Double.parseDouble(side1.getText()) + Double.parseDouble(side2.getText()) > Double.parseDouble(side3.getText()) ||
               Double.parseDouble(side3.getText()) + Double.parseDouble(side1.getText()) > Double.parseDouble(side2.getText()) ||
               Double.parseDouble(side3.getText()) + Double.parseDouble(side2.getText()) > Double.parseDouble(side2.getText()))
        {if (Double.parseDouble(side1.getText()) == Double.parseDouble(side2.getText()) && Double.parseDouble(side2.getText())== 
                Double.parseDouble(side3.getText())) 
            {classification = "equilateral";
        }else if (Double.parseDouble(side1.getText()) == Double.parseDouble(side2.getText()) || 
                Double.parseDouble(side1.getText())== Double.parseDouble(side3.getText())||
                Double.parseDouble(side2.getText()) == Double.parseDouble(side3.getText())) 
            {classification = "isosceles";
        }else if((Double.parseDouble(side1.getText()) + Double.parseDouble(side2.getText()) )<= Double.parseDouble(side3.getText()))
            {classification = "invalid";
        }else {classification = "scalene";

        }switch(classification){
            case "equilateral":
                JOptionPane.showMessageDialog(null, "The triangle is valid and it is equilateral.");break;
            case "isosceles":
                JOptionPane.showMessageDialog(null, "The triangle is valid and it is isosceles.");break;
            case "scalene":
                JOptionPane.showMessageDialog(null, "The triangle is valid and it iss scalene.");break;
            case "invalid":
                JOptionPane.showMessageDialog(null,"the triangle is invalid");break;}}}   
else if(Result==JOptionPane.NO_OPTION){
    if(side1.getText().isEmpty() || side2.getText().isEmpty() || side3.getText().isEmpty()){
        JOptionPane.showMessageDialog(null,"Please ensure to input your angles or sides before proceeding",
        "Option 2 (By Angles)",JOptionPane.WARNING_MESSAGE);
    }else if((Double.parseDouble(side1.getText()) + Double.parseDouble(side2.getText()) + Double.parseDouble(side3.getText()))!=180)
            {JOptionPane.showMessageDialog(null,"Input is invalid,\n input should be equal to 180",
            "Option 2 (By Angles)",JOptionPane.WARNING_MESSAGE);    

    }else if(Double.parseDouble(side1.getText()) + Double.parseDouble(side2.getText()) > Double.parseDouble(side3.getText()) ||
        Double.parseDouble(side3.getText()) + Double.parseDouble(side1.getText()) > Double.parseDouble(side2.getText()) ||
        Double.parseDouble(side3.getText()) + Double.parseDouble(side2.getText()) > Double.parseDouble(side2.getText())){
        }if((Double.parseDouble(side1.getText()) + Double.parseDouble(side2.getText()) + Double.parseDouble(side3.getText()))==180){   

            if ((Double.parseDouble(side1.getText()) > 90 )||(Double.parseDouble(side2.getText()) > 90)||Double.parseDouble(side3.getText()) > 90) 
                    {classification = "Obtuse-Angled";

            }else if ((Double.parseDouble(side1.getText()) < 90 )||(Double.parseDouble(side2.getText()) < 90)||Double.parseDouble(side3.getText()) < 90)  
                    {classification ="Acute Angled" ; 
        }else{classification="Right"  ;      
            }switch (classification){
                case "Acute Angled":
                    JOptionPane.showMessageDialog(null, "The triangle is valid and it is Acute Angled.");break;   
                case "Obtuse-Angled":
                    JOptionPane.showMessageDialog(null, "The triangle is valid and it is Obtuse-Angled.");break;
                case "Right":
                    JOptionPane.showMessageDialog(null, "The triangle is valid and it is Right-Angled.");break;}}}}}}