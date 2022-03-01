package Basic.Javaproject;

import java.util.ArrayList;
import java.util.ListIterator;

public class Arralist2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
      ArrayList <String> color = new ArrayList <String>();
		
		// Add Elements to ArrayList
		color.add("Red");
		color.add("Pink");
		color.add("Black");
		color.add("Blue");
		color.add("Orange");
		
		System.out.println("ArrayList: " + color);
		
		//checksize
		System.out.println("ArrayList length: " + color.size());
				
		// Access ArrayList Elements
		String get_elem = color.get(1);
		System.out.println("Element: " + get_elem);
				
		//Change ArrayList Elements
		color.set(3, "Violet");
		System.out.println("Modified ArrayList: " + color);
				
		//Remove ArrayList Elements
		String str = color.remove(2);
		System.out.println("Removed Element: " + str);
		
		//Java ArrayList contains()
		String checkData = "Pink";
		System.out.print(checkData + " is present in the arraylist: ");
		System.out.println(color.contains(checkData));
		
		
		//View data using ListIterator
		ListIterator <String> li =  color.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		
		//ArrayList to Array
		String[] arr = new String[color.size()];
		color.toArray(arr);
		
		for (String clr : arr) {
			System.out.print(clr + ", ");
		}

		
	}

}
