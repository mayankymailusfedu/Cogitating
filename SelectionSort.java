
public class SelectionSort {
	
	public static void main(String[] args) {
		int[] arr = {5,6,8,2,3,9};
		arr = sort(arr); 
		print(arr);
	}

	private static int[] sort(int[] arr) {
		// TODO Auto-generated method stub
		for(int i =0;i<arr.length-1;i++) {
			int min_j = i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[min_j]>arr[j]) {
					min_j=j;
				}
			}
			int temp = arr[i];
			arr[i]=arr[min_j];
			arr[min_j]=temp;
		}
		return arr;
	}
	
	private static void print(int[] arr) {
		// TODO Auto-generated method stub
		System.out.println();
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
	}

}
