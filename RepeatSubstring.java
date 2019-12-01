
public class RepeatSubstring {
	
	public static void main(String[] args) {
		String a ="abcd";
		String b="cdabcdab";
		int n = repeat(a,b);
		System.out.println(n);
	}

	private static int repeat(String a, String b) {
		// TODO Auto-generated method stub
		int times=1;
		String newA=a;
		for(int i=0;i<b.length()*a.length();i++) {
			if(newA.contains(b)) {
				return times;
			}
			else {
				newA=newA+newA;
				times++;
			}
		}
		return -1;
	}

}
