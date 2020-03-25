package dataStructures.graph.wide_walk;

public class GraphWide {

    private final int NUM_VERTEX = 20;
    private Vertex[] vertexArray;
    private int nVertex;
    private int[][] neighbors;
    private Queue theQueue;

    public GraphWide() {
        vertexArray = new Vertex[NUM_VERTEX];
        nVertex = 0;
        theQueue = new Queue();
        neighbors = new int[NUM_VERTEX][NUM_VERTEX];
        for (int i = 0; i < NUM_VERTEX; i++) {
            for (int j = 0; j < NUM_VERTEX; j++)
                neighbors[i][j] = 0;
        }
    }

    public void displayVertex(int i) {
        System.out.println(vertexArray[i].letter);
    }

    public void addVertex(char simbol) {
        vertexArray[nVertex++] = new Vertex(simbol);
    }

    public void addEdge(int start, int finish) {
        neighbors[start][finish] = 1;
        neighbors[finish][start] = 1;
    }

    public void wideWalk() {
        vertexArray[0].wasVisited = true;
        displayVertex(0);
        theQueue.push(0);
        int v2;

        while (!theQueue.isEmpty()) {
            int v1 = theQueue.remove();

            while ((v2 = findUnvisitedNeighbors(v1)) != -1) {
                vertexArray[v2].wasVisited = true;
                displayVertex(v2);
                theQueue.push(v2);
            }
        }
        for (int i = 0; i < nVertex; i++)
            vertexArray[i].wasVisited = false;
    }

    private int findUnvisitedNeighbors(int index) {
        for (int i = 0; i < nVertex; i++) {
            if (neighbors[index][i] == 1 && vertexArray[i].wasVisited == false)
                return i;
        }
        return -1;
    }
}
