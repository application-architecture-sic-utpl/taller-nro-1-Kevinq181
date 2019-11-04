package ec.edu.utpl.sic.arqapl;

import ec.edu.utpl.sic.arqapl.metrics.Similaritable;

public class TweetSimilarity {

    private Similaritable algoritmo;

    public TweetSimilarity(Similaritable algoritmo) {
        this.algoritmo = algoritmo;
    }

    public double similarity(String tweet1, String tweet2) {
        return algoritmo.similarity(tweet1, tweet2);
    }
}
