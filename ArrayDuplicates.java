import java.util.Arrays;

public class ArrayDuplicates {
	
	public static void main(String[] args) {
		int [] arr = {4,7,3,2,1,3,7};
		Arrays.sort(arr);
		
		solution1(arr);
		System.out.println();
		solution2(arr);
	}

	private static void solution1(int [] arr) {
		// TODO Auto-generated method stub
		int count=0;
		int  [] duplicates = new int[arr.length];
		for(int i =0;i<(arr.length-1);i++) {
			if(arr[i] == arr[i+1]) {
				duplicates[count]=arr[i];
				count++;
			}
		}
		
		for(int i =0;i<count;i++) {System.out.print(duplicates[i]);}
	}
	
	private static void solution2(int[] arr) {
		// TODO Auto-generated method stub
		int count=0;
		String duplicates = "";
		for(int i =0;i<(arr.length-1);i++) {
			if(arr[i] == arr[i+1]) {
				duplicates+=arr[i]+",";
				count++;
			}
		}
		
		String[] temp = duplicates.split(",");
		int [] newArr = new int[count];
		int j=0;
		for(String i:temp) {newArr[j]=Integer.parseInt(i);j++;}
		for(int i: newArr) {System.out.print(i);}
	}

}
