package ec.edu.utpl.sic.arqapl.metrics;

import org.apache.commons.text.similarity.CosineDistance;

public class Cosine implements Similaritable {

    @Override
    public double similarity(String texto1, String texto2) {
        CosineDistance cosine = new CosineDistance();
        double similarity = 1.0 - cosine.apply(texto1, texto2);
        return similarity;
    }
}
