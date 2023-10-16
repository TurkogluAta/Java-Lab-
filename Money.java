/*
* Money.java
* @author: Ata Turkoglu
* Date: 17/02/2023
*/

public class Money{
    //Declare data members - All private
    private double cash;
    private double revolut;
    private double total;
    private double pounds;

    //Constructor - Same name as the class, give each variable a default value 
    public Money(){
        cash = 0.0;
        revolut = 0.0;
        total = 0.0;
        pounds = 0.0;
    }

    //Setters - One for every input variable
    public void setCash(double cash){
        this.cash = cash;
    }
    public void setRev(double revolut){
        this.revolut = revolut;
    }
    
    //Compute method(s)
    public void computeTotal(){
        total = cash + revolut;
    }
    public void computePounds(){
        pounds = total*0.89;
    }

    //Getters - One for every output variable
    public double getTotal(){
        return total;
    }
    public double getPounds(){
        return pounds;
    }
}