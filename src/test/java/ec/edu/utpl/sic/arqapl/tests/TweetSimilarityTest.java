package ec.edu.utpl.sic.arqapl.tests;

import ec.edu.utpl.sic.arqapl.TweetSimilarity;
import ec.edu.utpl.sic.arqapl.metrics.*;
import java.util.Arrays;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(value = Parameterized.class)
public class TweetSimilarityTest {

    /*Forma para realizar pruebas parametrizadas*/
    @Parameterized.Parameters
    public static Iterable<Object[]> getData() {
        return Arrays.asList(new Object[][]{
            {"hola mundo", "hola mundo", 1},
            {"hela mundo", "hola mundo", 1},
            {"Hola este es un tweet de comprobación", "Hola este es un tweet de comprobación", 1}
        });

    }
    private String tweet1;
    private String tweet2;
    private int exp;

    public TweetSimilarityTest(String tweet1, String tweet2, int exp) {
        this.tweet1 = tweet1;
        this.tweet2 = tweet2;
        this.exp = exp;
    }

    @Test
    public void similar1() {
        TweetSimilarity algoritmo = new TweetSimilarity(new Jaccard());
        assertEquals(exp, algoritmo.similarity(tweet1, tweet2), 0);
    }

    @Test
    public void similar2() {
        TweetSimilarity algoritmo = new TweetSimilarity(new Cosine());
        assertEquals(exp, algoritmo.similarity(tweet1, tweet2), 0);
    }

    @Test
    public void similar3() {
        TweetSimilarity algoritmo = new TweetSimilarity(new JaroWinkler());
        assertEquals(exp, algoritmo.similarity(tweet1, tweet2), 0);
    }
}

