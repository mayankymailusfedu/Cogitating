import java.util.*;

class Graph {
	int V;
	LinkedList<Integer> adjListArray[];
	LinkedList<Integer> costArray[] = null;

	// constructor
	Graph(int V) {
		this.V = V;
		adjListArray = new LinkedList[V];
		for (int i = 0; i < V; i++) {
			adjListArray[i] = new LinkedList<>();
			//costArray[i] = new LinkedList<>();
		}
	}

	static void addEdge(Graph graph, int src, int dest, int cost) {
		graph.adjListArray[src].add(dest);
		graph.costArray[src].add(dest);
		// For BFS comment the below line
		//graph.adjListArray[dest].add(src);
	}

	static void printGraph(Graph graph) {
		for (int v = 0; v < graph.V; v++) {
			System.out.println("Adjacency list of vertex " + v);
			for (Integer pCrawl : graph.adjListArray[v]) {
				System.out.print(" -> " + pCrawl);
			}
			System.out.println("\n");
		}
	}

	void BFS(int s) {
		boolean visited[] = new boolean[V];
		LinkedList<Integer> queue = new LinkedList<Integer>();
		visited[s] = true;
		queue.add(s);

		while (queue.size() != 0) {
			s = queue.poll();
			System.out.print(s + " ");
			Iterator<Integer> i = adjListArray[s].listIterator();
			System.out.println(adjListArray[s]);
			while (i.hasNext()) {
				int n = i.next();
				if (!visited[n]) {
					visited[n] = true;
					queue.add(n);
				}
			}
		}
	}

	void DFSUtil(int v, boolean visited[], int d) {
		// Mark the current node as visited and print it
		visited[v] = true;
		System.out.print(v + " ");
		if (v == d) {
			//System.out.println("STOP");
			System.exit(0);
		}
		// Recur for all the vertices adjacent to this vertex
		Iterator<Integer> i = adjListArray[v].descendingIterator();// .listIterator();
		//System.out.println(adjListArray[v]);
		while (i.hasNext()) {
			int n = i.next();
			if (!visited[n])
				DFSUtil(n, visited, d);
		}
	}

	void DFS(int s, int d) {
		// Mark all the vertices as not visited(set as
		// false by default in java)
		boolean visited[] = new boolean[V];

		// Call the recursive helper function to print DFS traversal
		// starting from all vertices one by one
		for (int i = s; i < V; ++i) {
			if (visited[i] == false && i != d)
				DFSUtil(i, visited, d);
		}

	}
}
