
public class Palindrome {
	
	public static void main(String[] args) {
		String str ="abcba";
		boolean bool = checkPalindrome(str);
		System.out.println(bool);
	}

	private static boolean checkPalindrome(String str) {
		// TODO Auto-generated method stub
		char[] charStr = str. toCharArray();
		boolean flag = false;
		int j=str.length()-1;
		for(int i=0;i<str.length()/2;i++) {
				//System.out.println(charStr[i]+" "+charStr[j]);
				if(charStr[i]==charStr[j])
					flag = true;
				else
					return false;
				j--;
			
		}
		return flag;
	}


}
