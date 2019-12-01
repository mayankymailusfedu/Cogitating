import java.util.*;

public class RandomSublist {

	public static void main(String[] args) {
		List<Integer> L = Arrays.asList(1, 2, 3, 4, 5);
		int N = 3;
		System.out.println(L.size());

		for (int i = 0; i < L.size() - 2; i++) {
			for (int j = i + 1; j < L.size() - 1; j++) {
				for (int k = j + 1; k < L.size(); k++) {
					System.out.println(L.get(i) +" "+L.get(j)+" "+L.get(k));
				}
			}
		}

	}
}
