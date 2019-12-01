import java.util.Arrays;

public class CouponsDraw {
	
	public static void main(String[] args) {
		int[] coupons = {3,6,1,9};//{5, 3, 4, 2, 3, 4, 5, 7};
		int money = solution(coupons);
		System.out.println(money);
	}
	
	public static int solution(int[] coupons) {
		int occurance =0;
		int efficient=0, flag=0;
		int[] cost = new int[coupons.length];
		for(int i =0;i<coupons.length-1;i++) {
			occurance=0;
			flag=0;
			for(int j=i+1;j<coupons.length;j++) {
				//System.out.println(coupons[i]+" "+coupons[j]);
				if(coupons[i]==coupons[j] && flag==0) {
					//System.out.println(coupons[i]+" "+coupons[j]+" "+i+" "+j+" "+(j-i+1));
					occurance = j-i+1;
					efficient=1;
					flag = 1;
				}
			}
			cost[i]=occurance;
		}
		//System.out.println(Arrays.toString(cost));
		if(efficient==1) {
			int minValue = 99;
			  for(int i=0;i<cost.length;i++){
			    if(cost[i] < minValue && cost[i]!=0){
				  minValue = cost[i];
				}
			  }
			  return minValue;
		}
		return -1;
        // write your code in Java SE 8
    }

}
