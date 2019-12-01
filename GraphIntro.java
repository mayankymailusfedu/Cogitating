
public class GraphIntro {
	
	public static void main(String[] args) {
		int nodes = 4;
		Graph graph = new Graph(nodes);
		graph.addEdge(graph, 0, 1, 10);
		graph.addEdge(graph, 0, 2, 20);
		graph.addEdge(graph, 1, 3, 16);
		graph.addEdge(graph, 1, 2, 5);
		graph.addEdge(graph, 2, 3, 20);
		//graph.addEdge(graph, 1, 2);
		//graph.addEdge(graph, 2, 0);
		//graph.addEdge(graph, 2, 3);
		//graph.addEdge(graph, 3, 3);
		
		graph.printGraph(graph);
		//graph.BFS(0);
		
		//graph.DFS(0,3);
	}
}
