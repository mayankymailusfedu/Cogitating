import java.util.ArrayList;
import java.util.List;

public class ArrayGraphPath {

	int V;
	List<Integer> node;
	List<Integer> totalCost;
	List<Integer> parent;

	public ArrayGraphPath(int V) {
		// TODO Auto-generated constructor stub
		for (int i = 0; i < V; i++) {
			node.add(i);
		}
		for(int i = 0; i < V; i++) {
			totalCost.add(99);
			parent.add(99);
		}
	}

	protected void addPath(int source, int cost, int pa) {
		int pastCost = totalCost.get(source);
		if(pastCost > cost) {
			totalCost.add(source, cost);
			parent.add(source, pa);
		}
		
	}

}
