import java.util.Arrays;

public class Array_Functions {
	
	public static void main(String[] args) {
		int[] myarray = {0,1,2,3,4};
		//processing array
		for(int i =0;i<myarray.length;i++) {
			System.out.print(myarray[i]);
		}
		
		for(int i: myarray) {
			System.out.print(i);
		}
		
		//reverse an array
		int[] reverse=new int[myarray.length];
		for(int i=0,j=reverse.length-1; i < myarray.length;i++,j--) {
			reverse[j]=myarray[i];
		}
		for(int i: reverse) {
			System.out.println(i);
		}
		
		int i = Arrays.binarySearch(myarray, 6);
		System.out.println(i);
		
	}
}
