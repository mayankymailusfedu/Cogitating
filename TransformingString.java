import java.util.*;

public class TransformingString {
	
	public static void main(String[] args) {
		String a = "aabba";
		String b = "ab";
		
		List<String> myA = new ArrayList<>(Arrays.asList(a.split("")));
		List<String> myB = new ArrayList<>(Arrays.asList(b.split("")));
		//System.out.println(myB.size());
		int count=0;
		ListIterator<String> iter = myA.listIterator();
		while(iter.hasNext() && count<myB.size()){
			String n = iter.next().toString();
			String B = myB.get(count).toString();
		    if(!n.equals(B)){
		        iter.remove();
		    }
		    else if(n.equals(B)){
		    	count++;
		    }
		}
		if(myA.toString().equals(myB.toString())) {
			System.out.println(myA.toString());
		}
		else if(myA.containsAll(myB)) {
			myA=myB;
			System.out.println(myA.toString());
		}
		else {
			System.out.println("Not Found");
		}
	}

}
