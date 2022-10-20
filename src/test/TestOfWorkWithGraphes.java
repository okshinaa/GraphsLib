import org.junit.Before;
import org.junit.Test;
import ru.vsu.cs.okshina_v_a.Graph;
import ru.vsu.cs.okshina_v_a.GraphTraversal;

import static java.lang.String.valueOf;
import static org.junit.Assert.assertEquals;

public class TestOfWorkWithGraphs {
    private Graph gr;

    @Before
    public void setUp() {
        gr = new Graph();
    }

    @Test
    public void testAddVertex() {
        gr.addVertex("1");
        gr.addVertex("2");
        gr.addVertex("3");

        assertEquals("1[]2[]3[]", gr.printGraph());
    }

    @Test
    public void testDeleteVertex() {
        gr.addVertex("cat");
        gr.addVertex("dog");
        gr.addVertex("elephant");

        gr.removeVertex("dog");

        assertEquals("elephant[]cat[]", gr.printGraph());
    }

    @Test
    public void testAddEdges() {
        gr.addVertex("1");
        gr.addVertex("2");
        gr.addVertex("3");
        gr.addEdge("1", "3");

        assertEquals("3[1]2[]1[3]", gr.printGraph());
    }

    @Test
    public void testGraphTraversal() {
        gr.addVertex("1");
        gr.addVertex("2");
        gr.addVertex("3");
        gr.addEdge("1", "3");

        assertEquals("[3, 1]", valueOf(GraphTraversal.breadthFirstTraversal(gr, "3")));
    }
}