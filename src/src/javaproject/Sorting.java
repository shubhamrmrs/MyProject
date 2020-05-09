package src.javaproject;
import java.util.*;


public class Sorting {

	 public static void main(String[] args) {
			
			List<String> list = new ArrayList<>();
			list.add("India");
			list.add("Pakistan");
			
			for(String str : list) {
				System.out.println("New : "+str);
			}

			list.set(0, "USA");
			
			System.out.println("0th data Search : "+list.get(0));
			
			for(String str : list) {
				System.out.println("Updated : "+str);
			}
			
			
			System.out.println("*************************************************");
			
			java.util.Collections.sort(list);
			
			for(String str : list) {
				System.out.println("Sorted : "+str);
			}

			list.remove(0);
			
			for(String str : list) {
				System.out.println("After deleting : "+str);
			}
			
           
					
		
		
		
		
		
		
		
		
		
		
	}

}
