/*
* MoneyApp.java
* @author: Ata Turkoglu
* Date: 17/02/2023
*/

import javax.swing.JOptionPane;
public class MoneyApp{
    public static void main(String args[]){
        //Declare variables
        double cash, revolut, euro, pounds;

        //Declare objects 
        Money myMoney;

        //Create objects
        myMoney = new Money();

        //Input
        cash = Double.parseDouble(JOptionPane.showInputDialog(null,"How much cash was collected: "));
        myMoney.setCash(cash);
        revolut = Double.parseDouble(JOptionPane.showInputDialog(null,"How much money was collected with revolut: "));
        myMoney.setRev(revolut);

        //Process
        myMoney.computeTotal();
        myMoney.computePounds();

        //Output 
        euro = myMoney.getTotal();
        pounds = myMoney.getPounds();

        JOptionPane.showMessageDialog(null,euro +" Euro was collected.");
        JOptionPane.showMessageDialog(null,pounds+" Pounds was collected.");
    }
}
