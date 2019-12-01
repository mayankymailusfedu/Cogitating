import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class DashRearrangement {
	
	public static void main(String[] args) {
		solution("2-4A0r7-4k", 4);
	}
	
	public static String solution(String S, int K) {
        // write your code in Java SE 8
        List<String> myList = new ArrayList<String>(Arrays.asList(S.toUpperCase().split("")));
        Iterator<String> it = myList.listIterator();
        int dashCounter=0;
        while(it.hasNext()) {
        	String s = it.next();
        	if(s.equals("-")) {
        		dashCounter++;
        		it.remove();
        	}
        }
        int length = myList.size();
        int numberOfGroups = length/K;
        //System.out.println(numberOfGroups);
        if(numberOfGroups<2) {
        	return myList.toString();
        }
        Collections.reverse(myList); 
        ListIterator<String> it2 = myList.listIterator();
        int count=1;
        int groups=1;
        while(it2.hasNext() && groups<numberOfGroups) {
        	it2.next();
        	if(count==K) {
        		 it2.add("-");
        		 count=0;
        		 groups++;
        	}
        	count++;
        }
        //System.out.println(myList);
        Collections.reverse(myList);
        String s = myList.toString();
		return s;
    }

}
