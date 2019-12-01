public class ArrayDuplicatesWithoutSort {
	public static void main(String[] args) {
		int [] arr = {4,7,3,2,1,3,7};
		
		withoutSort(arr);
		System.out.println();
	}

	private static void withoutSort(int [] arr) {
		// TODO Auto-generated method stub
		int count=0;
		int  [] duplicates = new int[arr.length];
		for(int i =0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] == arr[j]) {
					duplicates[count]=arr[i];
					count++;
				}
		}
		}
		
		for(int k =0;k<count;k++) {System.out.print(duplicates[k]);}
	}
	}
