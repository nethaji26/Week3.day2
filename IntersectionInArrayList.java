package week3.day2;

import java.util.ArrayList;

public class IntersectionInArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String >AL = new ArrayList<String>();
		AL.add("Nethaji");
		AL.add("is");
		AL.add("walking");
		System.out.println(" Sentence from first array" +AL);
		ArrayList<String>AL2 = new ArrayList<String>();
		AL2.add("s1");
		AL2.add("is");
		AL2.add("running");
		System.out.println(" Sentence from second array" +AL);
		AL.retainAll(AL2);
		System.out.println(" The intersection list 1 and list 2 are " +AL);
	}

}
