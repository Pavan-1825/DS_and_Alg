package Test;

import com.ds_alg.CreditCard;

public class CreditCardTest {

    public static void main(String [] args){

        CreditCard[] wallet = new CreditCard[3];

        wallet[0] = new CreditCard("JOHN","CALIFORNIA_BANK","5012 2353 9532 4683", 5000);
        wallet[1] = new CreditCard("PAUL","CALIFORNIA_BANK","5216 3464 0641 5386", 600);
        wallet[2] = new CreditCard("WILLIAMS","CALIFORNIA_BANK","5132 0353 2532 1683", 350,100);

        for(int val= 1; val<=16; val++){ // spend some amount from the credit card(price)
            wallet[0].charge(val*4);
            wallet[1].charge(val*2);
            wallet[2].charge(val*6);
        }

        for(CreditCard card : wallet){
            CreditCard.printSummary(card);
            while(card.getBalance()>200){
                card.makePayment(200); // make a payment to credit card
                System.out.println("Credit cart available Balance: "+card.getBalance());
            }
        }
    }
}
