
public class ArrayGraphMain {
	public static void main(String[] args) {
		ArrayGraph ar = new ArrayGraph(4);
		ar.addEdge(0, 1, 10);
		ar.addEdge(0, 2, 20);
		ar.addEdge(1, 3, 16);
		ar.addEdge(1, 2, 5);
		ar.addEdge(2, 3, 20);
		
		//ar.printGraph();
		
		ar.BFS(0);
		//System.out.println(ar.allOccurance(0));
		//System.out.println(ar.allOccurance(1));
		//System.out.println(ar.allOccurance(2));
		//System.out.println(ar.allOccurance(3));
	}
}
