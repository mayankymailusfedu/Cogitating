
public class MergeSort {

	public static void main(String[] args) {
		int[] arr = { 5, 3, 6, 8, 1, 6 };
		Sort s = new Sort();
		s.sort(arr, 0, arr.length - 1);
		print(arr);
	}

	private static void print(int[] arr) {
		// TODO Auto-generated method stub
		//System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}

class Sort {
	protected static void sort(int[] arr, int start, int end) {
		// TODO Auto-generated method stub
		//System.out.println(start+" "+ end);
		if (start < end) {
			int mid = (start + end) / 2;
			sort(arr, start, mid);
			sort(arr, mid + 1, end);

			merge(arr, start, mid, end);
		}
	}

	private static void merge(int[] arr, int l, int m, int r) {
		// TODO Auto-generated method stub
		int n1 = m - l + 1; 
        int n2 = r - m; 
  
        /* Create temp arrays */
        int L[] = new int [n1]; 
        int R[] = new int [n2]; 
  
        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i) 
            L[i] = arr[l + i]; 
        for (int j=0; j<n2; ++j) 
            R[j] = arr[m + 1+ j]; 
  
  
        /* Merge the temp arrays */
  
        // Initial indexes of first and second subarrays 
        int i = 0, j = 0; 
  
        // Initial index of merged subarry array 
        int k = l; 
        while (i < n1 && j < n2) 
        { 
            if (L[i] <= R[j]) 
            { 
                arr[k] = L[i]; 
                i++; 
            } 
            else
            { 
                arr[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
  
        /* Copy remaining elements of L[] if any */
        while (i < n1) 
        { 
            arr[k] = L[i]; 
            i++; 
            k++; 
        } 
  
        /* Copy remaining elements of R[] if any */
        while (j < n2) 
        { 
            arr[k] = R[j]; 
            j++; 
            k++; 
        } 
	}
}
