import java.util.*;
import java.util.stream.Collectors;

public class DataStructures {
	
	public static void main(String[] args) {
		//ArrayList
		List<String> alist = new ArrayList<String>();
		alist.add("Hi");
		alist.add("How");
		printl(alist);
		alist.clear();
		printi(alist.size());
		
		
		
		//LinkedList
		List<String> llist = new LinkedList<String>();
		llist.add("Are");
		llist.add("You");
		
		//Stack
		Stack<String> stack = new Stack<String>();
		stack.push("Stack");
		stack.push("Test");
		prints(stack.firstElement());
		prints(stack.lastElement());
		//stack.pop();
		prints(stack.lastElement());
		printi(stack.capacity());
		printi(stack.size());
		stack.insertElementAt("Hello", 1);
		printi(stack.size());
		prints(stack.lastElement());
		
		//PriorityQueue
		Queue<String> pq=new PriorityQueue<String>();
		//Same functions as above COllections
		
		//Dequeue
		Deque<String> dq=new ArrayDeque<String>();
		dq.add("Hi");
		dq.addFirst("First");
		dq.addLast("Last");
		Iterator itrdq= dq.iterator();
		while(itrdq.hasNext()) {
			System.out.print(itrdq.next());
		}
		
		//Set
		Set<String> hashset = new HashSet<String>();
		hashset.add("zz");
		hashset.add("aa");
		hashset.add("df");
		hashset.add(null);
		Iterator itrhs= hashset.iterator();
		while(itrhs.hasNext()) {
			System.out.println(itrhs.next());
		}
		
		Set<String> linkedhashset = new LinkedHashSet<String>();
		linkedhashset.add("zz");
		linkedhashset.add("aa");
		linkedhashset.add("df");
		Iterator itrlhs= linkedhashset.iterator();
		while(itrlhs.hasNext()) {
			System.out.println(itrlhs.next());
		}
		
		Set<String> sortedset = new TreeSet<String>(linkedhashset);
		Collections.max(sortedset);
		Iterator itrss= sortedset.iterator();
		while(itrss.hasNext()) {
			System.out.println(itrss.next());
		}
		
		
		
		//HAshMap
		String s = "IV";
		HashMap<String,Integer> roman = new HashMap<String,Integer>();
        roman.put("I",1);
        roman.put("V",5);
        roman.put("X",10);
        roman.put("L",50);
        roman.put("C",100);
        roman.put("D",500);
        roman.put("M",1000);
        String str[]=s.split("");
        int sum=0;
        List<Integer> romanlist=new ArrayList<Integer>();
        for(String i:str) {
        	romanlist.add(roman.get(i));
        }
        System.out.println(romanlist);
        
        for(int i=0;i<romanlist.size();i++) {
        	
        	if(i+1<romanlist.size() && romanlist.get(i)<romanlist.get(i+1)) {
        		int current=romanlist.get(i);
            	int next = romanlist.get(i+1);
        		if(next<10) {
        			sum-=1;
        		}
        		else if(next<100) {
        			sum-=10;
        		}
        		else if(next<1000) {
        			sum-=100;
        		}
        	}
        		sum+=romanlist.get(i);
        }
        System.out.println(sum);
		
	}
	
	public static void printi(int i) {
		System.out.println(i);
	}
	
	public static void prints(String str) {
		System.out.println(str);
	}
	
	public static void printl(List<String> list) {
		Iterator itr=list.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());
		}
	}
	
}
