package ec.edu.utpl.sic.arqapl.metrics;

import org.apache.commons.text.similarity.JaroWinklerDistance;

public class JaroWinkler implements Similaritable {

    @Override
    public double similarity(String texto1, String texto2) {
        JaroWinklerDistance jaro = new JaroWinklerDistance();
        double similarity = jaro.apply(texto1, texto2);
        return similarity;
    }
}
