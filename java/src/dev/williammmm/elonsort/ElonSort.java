package dev.williammmm.elonsort;

import java.util.ArrayList;

public class ElonSort {

	public static ArrayList<Object> sort(ArrayList<Object> list) {
		ArrayList<Object> newList = new ArrayList<Object>();
		
		for (int i = 0; i < list.size(); i++) {
			if (Math.random() < 0.50) {
				newList.add(list.get(i));
			}
		}
		return newList;
	}
	
	private static Object[] addToArray(Object[] arr, Object obj) {
		int newSize = arr.length + 1;
		
		Object[] newList = new Object[newSize];
		
		for (int i = 0; i < arr.length; i++) {
			newList[i] = arr[i];
		}
		newList[arr.length] = obj;
		
		return newList;
	}
	
	public static Object[] sort(Object[] list) {
		Object[] newList = new Object[0];
		for (int i = 0; i < list.length; i++) {
			if (Math.random() < 0.50) {
				newList = addToArray(newList, list[i]);
			}
		}
		return newList;
	}
	
}
