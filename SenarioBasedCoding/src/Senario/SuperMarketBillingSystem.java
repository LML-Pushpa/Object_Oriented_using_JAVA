package Senario;
// 1. Supermarket Billing System (Arrays/Strings)
// Scenario:
// You are given a list of products purchased at a supermarket. Each product has a price. Write a program to calculate the total bill, given the list of prices.

// Sample Input:
// prices = [100, 200, 50,put:**
// Total bill: 425
import javax.print.attribute.standard.PrinterName;

public class SuperMarketBillingSystem {
    private String Pname;
    private double PPrice;

    public SuperMarketBillingSystem(){
        Pname="Default";
        PPrice=00.00;
    }

    public SuperMarketBillingSystem(String Pname,double PPrice){
        this.Pname=Pname;
        this.PPrice=PPrice;
    }

    @Override
    public String toString() {
        return "List : "+Pname + " " +PPrice;
    }

    public String getPname() {
        return Pname;
    }

    public void setPname(String pname) {
        Pname = pname;
    }

    public double getPPrice() {
        return PPrice;
    }

    public void setPPrice(double PPrice) {
        this.PPrice = PPrice;
    }
}
