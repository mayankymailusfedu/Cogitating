import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class HashTableExample {

	public static void main(String[] args) {
		Hashtable<Integer, String> ht = new Hashtable<>();

		ht.put(1, "one");
		ht.put(2, "two");
		ht.put(3, "three");

		Set<Integer> keys = ht.keySet();
		for (int key : keys) {
			System.out.println(key + " -- " + ht.get(key));
		}

		ht.remove(1);

		System.out.println(ht);
	}

}
