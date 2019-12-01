
public class NoOfPalindrome {
	public static void main(String[] args) {
		String str1 ="abcd";
		String str2 = "abba";
		//int bool = countPalindrome(str1,str2);
		System.out.println(CountPS(str1.toCharArray(),str2.toCharArray()));
		//System.out.println(bool);
	}
	
	static int CountPS(char str1[], char str2[] ) 
    { 
		int n = str1.length;
        int dp[][] = new int[n][n]; 
        boolean P[][] = new boolean[n][n]; 
       
        // palindrome of single lenght 
        for (int i= 0; i< n; i++) 
            P[i][i] = true; 
       
        // palindrome of length 2 
        for (int i=0; i<n-1; i++) 
        { 
            if (str1[i] == str2[i+1]) 
            { 
                P[i][i+1] = true; 
                dp[i][i+1] = 1 ;
            } 
        } 
 
        for (int gap=2 ; gap<n; gap++) 
        {  
            for (int i=0; i<n-gap; i++) 
            { 
                int j = gap + i; 
                // If current string is palindrome 
                if (str1[i] == str2[j] && P[i+1][j-1] ) 
                    P[i][j] = true; 
       
                // Add current palindrome substring ( + 1) 
                // and rest palinrome substring (dp[i][j-1] + dp[i+1][j]) 
                // remove common palinrome substrings (- dp[i+1][j-1]) 
                if (P[i][j] == true) 
                    dp[i][j] = dp[i][j-1] + dp[i+1][j] + 1 - dp[i+1][j-1]; 
                else
                    dp[i][j] = dp[i][j-1] + dp[i+1][j] - dp[i+1][j-1]; 
            } 
        } 
       
        // return total palindromic substrings 
        return dp[0][n-1]; 
    } 
	
	private static int countPalindrome(String str1, String str2) {
		// TODO Auto-generated method stub
		char[] char1 = str1. toCharArray();
		char[] char2 = str2. toCharArray();
		int [] point = new int [str1.length()];
		int count=0;
		for(int i=0;i<str1.length();i++) {
			if(char1[i]==char2[i]) {
				System.out.println(i);
				point[count]=i;
				count++;
			}
		}
		return 0;
	}
}
