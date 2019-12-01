
public class GcdMin {
	
	public static void main(String[] args) {
		int [] arr = {5, 10, 12, 1};
		int [] cost = {2, 1, 2, 6};
		int min=99;
		
		for (int i =0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				//System.out.println(arr[i]+" "+arr[j]);
				int gcd = gcdMethod(arr[i],arr[j]);
				//System.out.println(arr[i]+" "+arr[j]+" "+gcd);
				int currentMin=cost[i]+cost[j];
				//System.out.println(arr[i]+" "+arr[j]+" "+gcd+" "+currentMin);
				if(gcd==1 && currentMin<min) {
					min=currentMin;
				}
			}
		}
		System.out.println(min);
	}

	private static int gcdMethod(int num1, int num2) {
		// TODO Auto-generated method stub
		int gcd=0;
		for(int i = 1; i <=num1  && i <= num2; i++)
        {
            if(num1%i==0 && num2%i==0)
                gcd = i;
        }
		return gcd;
	}

}
