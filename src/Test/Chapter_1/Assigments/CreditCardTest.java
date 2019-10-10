package Test.Chapter_1.Assigments;

import datastructures_algorithms.CreditCard;

public class CreditCardTest {

    public static void main(String [] args){

        CreditCard[] wallet = new CreditCard[3];

        wallet[0] = new CreditCard("JOHN","CALIFORNIA_BANK","5012 2353 9532 4683", 5000);
        wallet[1] = new CreditCard("PAUL","CALIFORNIA_BANK","5216 3464 0641 5386", 3500);
        wallet[2] = new CreditCard("WILLIAMS","CALIFORNIA_BANK","5132 0353 2532 1683", 2500,300);

        for(int val= 1; val<=17; val++){ // spend some amount from the credit card(price)
            wallet[0].charge(val*3);
            wallet[1].charge(val*2);
            wallet[2].charge(val);
        }

        for(CreditCard card : wallet){
            CreditCard.printSummary(card);
            while(card.getBalance()>200){
                card.makePayment(200); // make a payment to credit card
                System.out.println("Credit card available Balance: "+card.getBalance());
            }
        }
    }
}
