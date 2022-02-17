package com.ty.array;

public class Array2 {

	private int[] arr;
	private int position;
	private final int DEFAULT_SIZE = 10;

	public Array2(int a) {
		arr = new int[a];
	}

	public Array2() {
		arr = new int[DEFAULT_SIZE];
	}

	public boolean add(int element) {
		arr = ensureCapacity(arr);
		arr[position++] = element;
		return true;
	}

	private int[] ensureCapacity(int[] arr) {
		return (position < arr.length) ? arr : grow(arr, arr.length);

	}

	private int[] grow(int[] arr, int oldCapacity) {
		int newSize = oldCapacity + (oldCapacity >> 1);
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
		int length = arr.length - 1 - index;
		System.arraycopy(arr, index + 1, arr, index, length);
		position--;
	}

}
