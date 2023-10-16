/*
* StudentsUnionApp.java
* @author: Ata Turkoglu
* Date: 17/02/2023
*/

import javax.swing.JOptionPane;
public class StudentsUnionApp{
    public static void main (String args[]){
        //Declare variables
        double caps, hoodies, tshirts;
        double total;

        //Declare objects 
        StudentsUnion myStudentsUnion;

        //Create objects
        myStudentsUnion = new StudentsUnion();

        //Input
        caps = Double.parseDouble(JOptionPane.showInputDialog(null,"Caps: "));
        myStudentsUnion.setNumC(caps);
        hoodies = Double.parseDouble(JOptionPane.showInputDialog(null,"Hoodies: "));
        myStudentsUnion.setNumH(hoodies);
        tshirts = Double.parseDouble(JOptionPane.showInputDialog(null,"Tshirts: "));
        myStudentsUnion.setNumT(tshirts);

        //Process
        myStudentsUnion.compute();

        //Output 
        total = myStudentsUnion.getTotal();

        JOptionPane.showMessageDialog(null,total +" Euro.");
    }
}