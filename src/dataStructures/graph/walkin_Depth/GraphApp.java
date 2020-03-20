package dataStructures.graph.walkin_Depth;

public class GraphApp {

    public static void main(String[] args) {

        Graph theGraph = new Graph();

        theGraph.addVertex('a');
        theGraph.addVertex('b');
        theGraph.addVertex('c');
        theGraph.addVertex('d');
        theGraph.addVertex('e');
        theGraph.addVertex('f');
        theGraph.addVertex('g');

        theGraph.addEdge(0,1);
        theGraph.addEdge(1,2);
        theGraph.addEdge(0,3);
        theGraph.addEdge(3,4);
        theGraph.addEdge(0,5);
        theGraph.addEdge(2,6);

        theGraph.walkInDepth();
    }
}
