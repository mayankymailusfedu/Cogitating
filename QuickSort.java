
public class QuickSort {

	public static void main(String[] args) {
		int[] arr = { 5, 3, 6, 8, 1, 6 };
		QSort s = new QSort();
		s.sort(arr, 0, arr.length - 1);
		print(arr);
	}

	private static void print(int[] arr) {
		// TODO Auto-generated method stub
		// System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}

class QSort {
	protected static void sort(int[] arr, int start, int end) {
		// TODO Auto-generated method stub
		// System.out.println(start+" "+ end);
		if (start < end) {
			int pi = partition(arr, start, end);

			sort(arr, start, pi - 1);
			sort(arr, pi + 1, end);

		}
	}

	private static int partition(int[] arr, int l, int r) {
		// TODO Auto-generated method stub
		int pivot = arr[r];
		int i = (l - 1);
		for (int j = l; j < r; j++) {
			if (arr[j] < pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;

			}
		}

		int temp = arr[i + 1];
		arr[i + 1] = arr[r];
		arr[r] = temp;

		return i + 1;
	}
}