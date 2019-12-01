import java.util.Arrays;

public class RecycledPair {

	public static void main(String[] args) {
		int[] arr = {32, 42, 13, 23, 9, 5, 31};
		int num = 0;
		Arrays.sort(arr);
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				// System.out.println(arr[i]+" "+arr[j]);
				if (arr[i] < arr[j]) {
					int num1Size = intLength(arr[i]);
					int num2Size = intLength(arr[j]);
					if (num1Size == num2Size) {
						// System.out.println(arr[i]+" "+arr[j]);
						num = num + recycle(arr[i], arr[j]);
					}
					// System.out.println();
				}
			}
		}
		System.out.println(num);
	}

	private static int recycle(int a, int b) {
		// TODO Auto-generated method stub
		int alength = intLength(a);
		for (int i = 0; i < alength; i++) {
			int newA = rotateA(a, i, alength);
			if (newA == b) {
				//System.out.println(a + " " + b + " " + newA + " " + i);
				return 1;
			}
		}
		return 0;
	}

	private static int rotateA(int a, int move, int length) {
		int newA = (int) ((a % Math.pow(10, (length - move))) * Math.pow(10, move)
				+ (a - (a % Math.pow(10, (length - move)))) / Math.pow(10, length - move));
		return newA;
	}

	private static int intLength(int n) {
		// TODO Auto-generated method stub
		return String.valueOf(n).length();
	}

}
