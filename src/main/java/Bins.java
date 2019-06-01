
public class Bins {

    int[] bins; //storage place for the tosses

    public Bins (int numDice, int highBin){
        this.bins = new int[highBin + 1];
        for (int i = 0; i < highBin; i++){    //initialize bins to 0
            bins[i] = 0;
        }
    }


    public int getBin(int bin){
        return bins[bin];
    }


    public void incrementBins(int bin){
        bins[bin]++;
    }

}
