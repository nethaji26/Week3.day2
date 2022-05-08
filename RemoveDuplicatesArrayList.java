package week3.day2;

import java.util.ArrayList;

public class RemoveDuplicatesArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String>list = new ArrayList<String>();
		list.add("Nethaji");
		list.add("is");
		list.add("is");
		System.out.println("The list with duplicates" +list);
		ArrayList<String> newlist = removeDuplicates(list);
		

    // Print the ArrayList with duplicates removed
    System.out.println("ArrayList without duplicates : " + newlist);
				
				
				
				
	}

	private static ArrayList<java.lang.String> removeDuplicates(ArrayList<java.lang.String> list) {
		 ArrayList<String> newList = new ArrayList<String>();
		  
	        // Traverse through the first list
	        for (String element : list) {
	  
	            // If this element is not present in newList
	            // then add it
	            if (!newList.contains(element)) {
	  
	                newList.add(element);
	            }
	        }
	  
	        // return the new list
	        return newList;
	    }
	
	}

	
	
