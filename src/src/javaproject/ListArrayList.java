package src.javaproject;
import java.util.*;
public class ListArrayList {

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
		
	
	System.out.println("***************************************");
	
	
	List<String> str1= new ArrayList<>();
	str1.add("russia");
	str1.add("china");
	for(String str : str1){
		System.out.println("new : "+str);
	}
str1.set(1, "england");
str1.set(0, "australia");
for(String str : str1){
	System.out.println("new : "+str);
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
