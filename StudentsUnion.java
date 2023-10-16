/*
* StudentsUnion.java
* @author: Ata Turkoglu
* Date: 17/02/2023
*/

public class StudentsUnion{
    //Declare data members - All private
    private double caps;
    private double hoodies;
    private double tshirts;
    private double total;

    //Constructor - Same name as the class, give each variable a default value 
    public StudentsUnion(){
        caps = 0;
        hoodies = 0;
        tshirts = 0;
        total = 0.0;
    }

    //Setters - One for every input variable
    public void setNumC(double caps){
        this.caps = caps;
    }
    public void setNumH(double hoodies){
        this.hoodies = hoodies;
    }
    public void setNumT(double tshirts){
        this.tshirts = tshirts;
    }

    //Compute method(s)
    public void compute(){
        total = (caps*5)+(hoodies*20)+(tshirts*10);
    }

    //Getters - One for every output variable
    public double getTotal(){
        return total;
    }
}