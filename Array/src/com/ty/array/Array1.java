package com.ty.array;

public class Array1 {
	
	private int[] arr;
	private final int DEFAULT_SIZE = 10;
	private int position;
	
	public Array1(int a) {
		arr = new int[a];
	}
	public Array1() {
		arr = new int[DEFAULT_SIZE];
	}
	
	public boolean add(int element) {
		arr = ensureCapacity(arr);
		arr[position++] = element;
		return true;
		
	}
	private int[] ensureCapacity(int[] arr) {
		return (position < arr.length)?arr:grow(arr,arr.length);
	}
	private int[] grow(int[] arr, int length) {
		int newSize = length+(length >>1);
		int[] arr2 = new int[newSize];
		System.arraycopy(arr, 0, arr2, 0, arr.length);
		return arr2;
	}
	public int size() {
		return position;
	}
	public void set(int index, int element) {
		arr[index] = element;
	}
	public void remove(int index) {
		int length = arr.length-1-index;
		System.arraycopy(arr, index+1, arr, index, length);
		position--;
		
	}
	
	
	// 0  1  2  3  4  5  6				
	// 11 22 33 44 - 66 77 	

}
