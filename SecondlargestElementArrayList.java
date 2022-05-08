package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondlargestElementArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(3);
		list1.add(2);
		System.out.println("The list of numbers are :" + list1);
		Collections.sort(list1);
		System.out.println("The sorted is" +list1);
		int size = list1.size();
		System.out.println(" The size is " +size);
		System.out.println("The second highest value in list is " +list1.get(size-2));
		
				
		

	}

}
