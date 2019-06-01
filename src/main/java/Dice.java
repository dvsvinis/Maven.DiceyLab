public class Dice {

    int numDice;

    public Dice(int numDice) {
        this.numDice = numDice;
    }

    public int tossAndSum()
    {
        int sum = 0;
        for (int i = 1; i <= numDice; i++){
            sum += ((int)(Math.random() * 6) + 1 );
        }
        return sum;
    }


}
