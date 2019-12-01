import java.util.stream.*;

public class PainterPartition {
	
	public static void main(String[] args) {
		int [] A={10, 20, 30, 40};
		int k=2;
		int time = timetaken(A,k);
		System.out.println(time);
	}

	private static int timetaken(int[] a, int k) {
		// TODO Auto-generated method stub
		int high = getSum(a);
		int low = getMax(a);
		//System.out.println(high+" "+low);
		
		while(low<high) {
			//System.out.println("**************************");
			int mid = low + (high-low)/2;
			//System.out.println(mid);
			int painter=painterRequired(a,mid);
			if(painter<=k) {
				high=mid;
				//System.out.println(high);
			}
			else {
				low=mid+1;
				//System.out.println(low);
			}
		}
		return low;
	}

	private static int painterRequired(int[] a, int mid) {
		// TODO Auto-generated method stub
		int painter = 1;
		int sum=0;
		for(int i =0;i<a.length;i++) {
			sum+=a[i];
			if(sum>mid) {
				sum=a[i];
				painter++;
			}
		}
		return painter;
	}

	private static int getMax(int[] a) {
		// TODO Auto-generated method stub
		int max = IntStream.range(0, a.length).map(i -> a[i]).max().getAsInt();
		return max;
	}

	private static int getSum(int[] a) {
		// TODO Auto-generated method stub
		int sum = IntStream.of(a).sum();
		return sum;
	}

}
