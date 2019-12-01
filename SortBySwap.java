
public class SortBySwap {

	public static void main(String[] args) {
		int[] arr = { 1, 5, 4, 3, 2, 8, 7, 999, 6 };

		for (int i = 0; i < arr.length; i++) {
			if(leastIndex(arr, i) != i) {
				System.out.println();
				printArray(arr);
				int get999index = get999Index(arr);
				arr = tempSwap(arr, get999index, i);
				printArray(arr);
				int leastindex = leastIndex(arr, i);
				arr = tempSwap(arr, i, leastindex);
				printArray(arr);
			}		
		}
	}

	private static void printArray(int[] arr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

	}

	private static int[] tempSwap(int[] arr, int a, int b) {
		// TODO Auto-generated method stub
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
		return arr;
	}

	private static int get999Index(int[] arr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 999) {
				return i;
			}
		}
		return -1;
	}

	private static int leastIndex(int[] arr, int start) {
		// TODO Auto-generated method stub
		int index = start;
		int min = arr[index];
		for (int i = start; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
				index = i;
			}
		}
		return index;
	}
}
