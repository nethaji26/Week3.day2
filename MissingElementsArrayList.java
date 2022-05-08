package week3.day2;

import java.util.ArrayList;
import java.util.Collections;

public class MissingElementsArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=1;
		ArrayList<Integer>list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(4);
		list1.add(6);
		list1.add(5);
		System.out.println(" The overall set of numbers are " + list1);
		Collections.sort(list1);
		System.out.println(list1);
		// to find the missing number
		for (int number : list1) 
		{
			if(number!=count)
			{
				System.out.println(" The missing number is " + count);
				break;
			}
			count++;
			
		}
		

	}

}
