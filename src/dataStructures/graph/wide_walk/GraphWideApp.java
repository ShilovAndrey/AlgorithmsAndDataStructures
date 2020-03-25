package dataStructures.graph.wide_walk;

public class GraphWideApp {

    public static void main(String[] args) {

        GraphWide theGraph = new GraphWide();

        theGraph.addVertex('a');
        theGraph.addVertex('b');
        theGraph.addVertex('c');
        theGraph.addVertex('d');
        theGraph.addVertex('e');
        theGraph.addVertex('f');
        theGraph.addVertex('g');

        theGraph.addEdge(0, 1);
        theGraph.addEdge(1, 2);
        theGraph.addEdge(0, 3);
        theGraph.addEdge(3, 4);
        theGraph.addEdge(0, 5);
        theGraph.addEdge(2, 6);

        theGraph.wideWalk();
    }
}
