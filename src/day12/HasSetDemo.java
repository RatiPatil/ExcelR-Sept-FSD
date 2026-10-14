package day12;

import java.util.HashSet;
import java.util.Set;

public class HasSetDemo {
	public static void main(String [] args) {
		Set<String> names = new HashSet();
		
		
		System.out.println(names.add("Ratikant"));
		System.out.println(names.add("Ben"));
		System.out.println(names.add("Ben"));
		
		
		String name = "viratkohli";
		
		
		Set<Character> hashset = new HashSet();
		
		for(char ch : name.toCharArray()) {
			
			if(hashset.contains(ch)) {
				System.out.println("First repeated char is " + ch);
				break;
			}else {
				hashset.add(ch
			}
			
		}
	}

}
