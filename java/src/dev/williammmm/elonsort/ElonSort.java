package dev.williammmm.elonsort;

import java.util.ArrayList;
import java.util.List;

public class ElonSort {

	public static List<Object> sort(List<Object> list) {
		Object[] arr = list.toArray();
		arr = sort(arr);
		
		List<Object> newList = new ArrayList<Object>();
		for (int i = 0; i < arr.length; i++) {
			newList.add(arr[i]);
		}
		return newList;
	}
	
	public static Object[] sort(Object[] list) {
		Object[] oldList = new Object[0];
		Object[] newList = new Object[0];
		for (int i = 0; i < list.length; i++) {
			if (Math.random() < 0.50) {
				oldList = newList;
				newList = new Object[oldList.length];
				
				for (int j = 0; j < oldList.length; j++) {
					newList[j] = oldList[j];
				}
				
				newList[oldList.length] = list[i];
			}
		}
		return newList;
	}
	
	/**
	 * The following is something I would *really* prefer not to do, however
	 * primatives do not inherit any other type :/
	 */
	
	public static byte[] sort(byte[] list) {
		byte[] oldList = new byte[0];
		byte[] newList = new byte[0];
		for (int i = 0; i < list.length; i++) {
			if (Math.random() < 0.50) {
				oldList = newList;
				newList = new byte[oldList.length];
				
				for (int j = 0; j < oldList.length; j++) {
					newList[j] = oldList[j];
				}
				
				newList[oldList.length] = list[i];
			}
		}
		return newList;
	}
	
	public static short[] sort(short[] list) {
		short[] oldList = new short[0];
		short[] newList = new short[0];
		for (int i = 0; i < list.length; i++) {
			if (Math.random() < 0.50) {
				oldList = newList;
				newList = new short[oldList.length];
				
				for (int j = 0; j < oldList.length; j++) {
					newList[j] = oldList[j];
				}
				
				newList[oldList.length] = list[i];
			}
		}
		return newList;
	}
	
	public static int[] sort(int[] list) {
		int[] oldList = new int[0];
		int[] newList = new int[0];
		for (int i = 0; i < list.length; i++) {
			if (Math.random() < 0.50) {
				oldList = newList;
				newList = new int[oldList.length];
				
				for (int j = 0; j < oldList.length; j++) {
					newList[j] = oldList[j];
				}
				
				newList[oldList.length] = list[i];
			}
		}
		return newList;
	}
	
	public static long[] sort(long[] list) {
		long[] oldList = new long[0];
		long[] newList = new long[0];
		for (int i = 0; i < list.length; i++) {
			if (Math.random() < 0.50) {
				oldList = newList;
				newList = new long[oldList.length];
				
				for (int j = 0; j < oldList.length; j++) {
					newList[j] = oldList[j];
				}
				
				newList[oldList.length] = list[i];
			}
		}
		return newList;
	}
	
	public static float[] sort(float[] list) {
		float[] oldList = new float[0];
		float[] newList = new float[0];
		for (int i = 0; i < list.length; i++) {
			if (Math.random() < 0.50) {
				oldList = newList;
				newList = new float[oldList.length];
				
				for (int j = 0; j < oldList.length; j++) {
					newList[j] = oldList[j];
				}
				
				newList[oldList.length] = list[i];
			}
		}
		return newList;
	}
	
	public static double[] sort(double[] list) {
		double[] oldList = new double[0];
		double[] newList = new double[0];
		for (int i = 0; i < list.length; i++) {
			if (Math.random() < 0.50) {
				oldList = newList;
				newList = new double[oldList.length];
				
				for (int j = 0; j < oldList.length; j++) {
					newList[j] = oldList[j];
				}
				
				newList[oldList.length] = list[i];
			}
		}
		return newList;
	}
	
	public static boolean[] sort(boolean[] list) {
		boolean[] oldList = new boolean[0];
		boolean[] newList = new boolean[0];
		for (int i = 0; i < list.length; i++) {
			if (Math.random() < 0.50) {
				oldList = newList;
				newList = new boolean[oldList.length];
				
				for (int j = 0; j < oldList.length; j++) {
					newList[j] = oldList[j];
				}
				
				newList[oldList.length] = list[i];
			}
		}
		return newList;
	}
	
	public static char[] sort(char[] list) {
		char[] oldList = new char[0];
		char[] newList = new char[0];
		for (int i = 0; i < list.length; i++) {
			if (Math.random() < 0.50) {
				oldList = newList;
				newList = new char[oldList.length];
				
				for (int j = 0; j < oldList.length; j++) {
					newList[j] = oldList[j];
				}
				
				newList[oldList.length] = list[i];
			}
		}
		return newList;
	}
}
