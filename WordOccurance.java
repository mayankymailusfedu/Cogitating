import java.util.*;

public class WordOccurance {
	
	public static void main(String[] args) {
		String input = "Hello how are you Java. I am fine thank you Java.";
		String filtered = input.replaceAll("[.,?/]","").toLowerCase();
		System.out.println(filtered);
		word(filtered);
		System.out.println();
		map(filtered);
	}
	
	private static void map(String line) {
		// TODO Auto-generated method stub
		String[] s = line.split(" ");
		HashMap<String, Integer> map = new HashMap<>();
		for (String i : s)
			map.put(i,0);
		for(String str:s) {
			if(map.containsKey(str)) {
				map.put(str,map.get(str)+1);
			}
		}
		System.out.println(map.toString());	
	}

	public static void word(String line) {
		String[] str = line.split(" ");
		List<String> occurance = new ArrayList<>();
		for(int i=0;i<str.length;i++) {
			int count=0;
			boolean flag=false;
			for(int j=0;j<str.length;j++) {
				if(str[i].equals(str[j]) && !occurance.contains(str[j])) {
					count++;
					flag=true;
				}
			}
			if(flag)
				System.out.print(str[i]+ "-" + count +";  ");
			occurance.add(str[i]);
		}
	}

}
