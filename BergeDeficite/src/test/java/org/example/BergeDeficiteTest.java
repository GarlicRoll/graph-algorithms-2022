package org.example;

import com.mathsystem.api.graph.GraphFactory;
import com.mathsystem.api.graph.model.Graph;
import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.FileNotFoundException;

public class BergeDeficiteTest {
    @Test
    void BergeTest() throws FileNotFoundException {
        Graph graph;
        DeficiteByTatt tatt = new DeficiteByTatt();
        int[] expectedAnswers = {0, 1, 0, 1, 0, 1};
        for (int i = 0; i < expectedAnswers.length; i++) {
            graph = GraphFactory.loadGraphFromFile(new File("src/test/resources/Berge" + i + ".txt"));
            int res = tatt.execute(graph);
            if (res != expectedAnswers[i]) {
                System.out.println("Error in test #" + i);
                System.out.println("Expected: " + expectedAnswers[i] + " Got: " + res);
            } else {
                System.out.println("Test #" + i + " passed. Answer: " + res);
            }
        }
    }
}
