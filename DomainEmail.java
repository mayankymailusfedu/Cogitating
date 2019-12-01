import java.util.regex.Pattern;

public class DomainEmail {
	
	public static void main(String[] args) {
		String[] L = {"unique@example.com", "uni.que@example.com", "unique+test@example.com", "unique@anotherexample.com"};
		int occurance = solution(L);
		
		System.out.println(occurance);
	}
	
	public static int solution(String[] L) {
		String[] newL = new String[L.length];
		int count=0;
		for(String i: L) {
			String[] split = i.split("@");
			String localname = split[0];
			String domainname = split[split.length-1];
			if(localname.contains("+")) {
				String[] plusSplit = localname.split("\\+");
				localname=plusSplit[0];
			}
			if(localname.contains(".")) {
				localname = localname.replaceAll("\\.", "");
			}
			//System.out.println(localname+"@"+domainname);
			newL[count]=localname+"@"+domainname;
			count++;
		}
		
		int maxcount = 0;
		int currentcount = 0;
		for(int i=0;i<newL.length;i++) {
			currentcount = 0;
			for(int j=0;j<newL.length;j++) {
				if(i!=j) {
					if(newL[i].equals(newL[j])) {
						currentcount++;
					}
					
				}
			}
			if(currentcount>maxcount) {
				maxcount = currentcount ;
			}
		}
		
		return maxcount+1;
        // write your code in Java SE 8
    }
}
