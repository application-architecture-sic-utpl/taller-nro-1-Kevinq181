package ec.edu.utpl.sic.arqapl.metrics;

import smile.math.distance.JaccardDistance;

public class Jaccard implements Similaritable {

    @Override
    public double similarity(String texto1, String texto2) {
        JaccardDistance<String> jaccard = new JaccardDistance();
        double similarity = 1.0 - jaccard.d(texto1.split("\\s"), texto2.split("\\s"));
        return similarity;
    }
}
