package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Add one array to another array using list
public class Add2ArraysEx2 {

	public static void main(String args[]) {

		List<Integer> list1 = new ArrayList<Integer>(
				Arrays.asList(new Integer("1"), new Integer("2"), new Integer("3"), new Integer("4")));
		List<Integer> list2 = Arrays.asList(new Integer("6"), new Integer("7"), new Integer("8"), new Integer("9"));

		int j = 0;
		int size = list1.size() + list2.size();
		for (int i = 0; i <= size; i++) {
			if (i > list1.size()) {
				list1.add(list2.get(j));
				j++;
			}
		}
		System.out.println(list1);
		
		list1.addAll(list2);
		System.out.println("Using addAll" +list1);

	}
}
