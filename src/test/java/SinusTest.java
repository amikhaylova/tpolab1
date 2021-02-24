import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SinusTest {

    private final double delta = 0.0001;
    private Map<Double, Double>  testMap = new HashMap<Double, Double>();

    @BeforeEach
    void setUp() {
        testMap.put(-Math.PI, 0.0);
        testMap.put(-Math.PI/2, -1.0);
        testMap.put( -Math.PI/4,-1/Math.sqrt(2));
        testMap.put( 0.0, 0.0);
        testMap.put( Math.PI/4,1/Math.sqrt(2));
        testMap.put(Math.PI/2, 1.0);
        testMap.put(Math.PI, 0.0);
    }

    @AfterEach
    void tearDown() {
        testMap.clear();
    }

    @Test
    void sin() {
        for (Map.Entry<Double, Double> entry : testMap.entrySet()) {
            final Double testData = entry.getKey();
            final Double expected = entry.getValue();
            final Double actual = Sinus.sin(testData);
            assertEquals(expected, actual, delta);
        }
    }
}