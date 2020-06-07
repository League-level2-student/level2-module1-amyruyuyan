package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> haii = new ArrayList<String>();
		//2. Add five Strings to your list
		haii.add("hello");
		haii.add("2");
		haii.add("e");
		haii.add("4");
		haii.add("5");
		//3. Print all the Strings using a standard for-loop
		for(int i = 0; i < haii.size(); i++) {
			System.out.println(haii.get(i));
		}
		//4. Print all the Strings using a for-each loop
		for(String j : haii){
			System.out.println(j);
		}
		//5. Print only the even numbered elements in the list.
		for(int l = 0; l < haii.size(); l++){
		if (l%2 == 0) {
		System.out.println(haii.get(l));
		}
		//6. Print all the Strings in reverse order.
		for(int k = haii.size() - 1; k >= 0; k--){
			System.out.println(haii.get(k)); 
		}
		//7. Print only the Strings that have the letter 'e' in them.
		for (String m : haii) {
			if (m.contains("e")) {
				System.out.println();
		}
			
		}
	}
}
}
