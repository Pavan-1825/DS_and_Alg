package Chapter_1;

import datastructures_algorithms.CreditCard;

public class PredatoryCreditCard extends CreditCard {

    private double apr;

    public PredatoryCreditCard(String customer, String bank, String account, int limit, double balance, double annulRate) {
        super(customer, bank, account, limit, balance);
        this.apr = annulRate;
    }

    // Method to calculate the monthly intereset rate for the credit card balance
    public void processMonth(){
        if(balance>0){
            //The correct computation is to take the twelfth-root of 1 + apr, and
            //use that as a multiplicative factor.
            double monthlyInterest = Math.pow(1+apr, 1.0/12);
            balance+= monthlyInterest;
        }
    }

    public boolean charge(double price){
        boolean isSuccess = super.charge(price);
        if(!isSuccess){ // if Charge is unsuccessful assess a 5$ penalty
            balance+=5;
        }
        return isSuccess;
    }

    @Override
    public String toString() {
        return "PredatoryCreditCard{" +
                "apr=" + apr +
                ", balance=" + balance +
                '}';
    }
}
