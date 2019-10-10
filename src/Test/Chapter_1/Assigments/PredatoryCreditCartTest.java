package Test.Chapter_1.Assigments;

import Chapter_1.PredatoryCreditCard;

public class PredatoryCreditCartTest {

    public static void main(String[] args){

        PredatoryCreditCard predatoryCreditCard = new PredatoryCreditCard("WILLIAMS","CALIFORNIA_BANK","5132 0353 2532 1683", 2500,300,12);

        predatoryCreditCard.processMonth();

        Boolean balanceAvailable = predatoryCreditCard.charge(2456);
        System.out.println("Balance available to Charge? "+ balanceAvailable);

        if(!balanceAvailable)
        System.out.println("interest rate and fine for excess charge :" + predatoryCreditCard.toString());

        predatoryCreditCard.printSummary(predatoryCreditCard);



    }
}
