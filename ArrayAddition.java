
public class ArrayAddition {

	public static void main(String[] ags) {
		
		//Declaration of A and B Matrix
		int[][] a = new int[][] { { 1, 1, 1 }, { 1, 1, 1 }, { 1, 1, 1 } };
		int[][] b = new int[][] { { 1, 1, 1 }, { 1, 1, 1 }, { 1, 1, 1 } };
		
		//Result of For-Each
		int[][] c = addfor(a, b);
		for (int[] i : c) {
			for (int j : i) {
				System.out.print(j);
			}
		}
		
		System.out.println();
		
		//Result of While
		int[][] d = addwhile(a,b);
		for (int[] i : d) {
			for (int j : i) {
				System.out.print(j);
			}
		}
	}
	
	//For-Each
	public static int[][] addfor(int[][] a, int[][] b) {

		int[][] result = new int[a.length][a[0].length];
		int i = 0;
		for (int[] x : a) {
			int j = 0;
			for (int y : x) {
				result[i][j] = y + b[i][j];
				j++;
			}
			i++;
		}
		return result;
	}
	
	//While Loop
	public static int[][] addwhile(int[][] a, int[][] b) {

		int[][] result = new int[a.length][a[0].length];
		int i = 0;
		while(i<result.length) {
			int j=0;
			while(j<result[i].length) {
				result[i][j]=a[i][j] + b[i][j];
				j++;
			}
			i++;
		}
		return result;
	}

}
