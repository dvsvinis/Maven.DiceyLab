public class Simulation {



    public static void main(String[] args) {
        int numDice = 0;  //number of dice
        int numToss = 0;  //number of rolls

        //Roll of Dice
        numDice = 2;
        numToss = 1000;
        Dice myDice = new Dice(numDice);
        Bins myBins = new Bins(numDice, (numDice * 6));

        //toss the dice numTosses
        for (int i = 0; i < numToss; i++) {

            //add to bin
            myBins.incrementBins(myDice.tossAndSum());
        }

        //print bins
        System.out.println("Simulation of " + numDice + " tossed for " + numToss + " times.");
        for (int i = 1; i < (numDice * 6 + 1); i++) {
            System.out.printf("%5d   :  %8d \n", i, myBins.getBin(i));
        }

    }

}
