package comp.csipl.test;

import java.util.HashMap;

public class CountOccurence {
	public static void main(String[] args) {
		String str="APPLE";
		countOccurence(str);
	}

	private static void countOccurence(String str) {
		char[] charArray=str.toCharArray();
		HashMap<Character, Integer> map=new HashMap<>();
		for (int i = 0; i < charArray.length; i++) {
			if(map.containsKey(charArray[i])) {
				map.put(charArray[i], map.get(charArray[i])+1);
				
			}else {
				map.put(charArray[i], 1);
			}
			
		}
		System.out.println(map);
		
	}

}
