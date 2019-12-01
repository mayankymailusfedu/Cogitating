import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayGraph {
	
	int V;
	List<Integer> source;
	List<Integer> destination;
	List<Integer> cost;
	
	public ArrayGraph(int v) {
		// TODO Auto-generated constructor stub
		V=v;
		source = new ArrayList<>();
		destination = new ArrayList<Integer>();
		cost = new ArrayList<Integer>();
	}
	
	protected void addEdge(int src, int dest, int c){
		source.add(src);
		destination.add(dest);
		cost.add(c);
	}
	
	protected void printGraph() {
		for(int i =0;i<source.size();i++) {
			System.out.println(source.get(i)+" --> "+destination.get(i)+" = "+cost.get(i));
		}
	}
	
	protected void BFS(int start) {
		boolean visited[] = new boolean[V];
		LinkedList<Integer> queue = new LinkedList<Integer>();
		//visited[start] = true;
		queue.add(start);

		while (queue.size() != 0) {
			start = queue.poll();
			System.out.print(start + " ");
			List<Integer> tempList = children(start);
			Iterator<Integer> i = tempList.listIterator();
			//System.out.println("List " + start + " -->" +tempList);
			int cost = 0 ;
			int totalCost = source.size() + destination.size();
			while (tempList.size()>0 && i.hasNext() && cost>totalCost) {
				int n = i.next();
				//System.out.println(n);
				/*if (!visited[n]) {
					visited[n] = true;*/
				ArrayGraphPath agp = new ArrayGraphPath(V);
				agp.addPath(n,start);
					queue.add(n);
					cost++;
				//}
			}
		}
	}
	
	protected List<Integer> children(int element) {
		List<Integer> childList = new ArrayList<>();
		for(int i=0;i<source.size();i++) {
			if(source.get(i)==element) {
				childList.add(destination.get(i));
			}
		}
		return childList;
	}

}
