package com.ty.array.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayToList {

	public static void main(String[] args) {

		int arr[] = { 4, 3, 4, 34, 34, 5, 343, 4, 34 };
		List<Integer> list = new ArrayList<Integer>() {
			{

				add(67);
				add(89);
				add(45);
				add(56);
				add(78);
			}
		};

		System.out.println(list);
		List<Integer> nlist = Arrays.asList(1, 2, 3, 4, 5);
		System.out.print(nlist);

			//System.out.println(list);
			int[] a = new int[nlist.size()];
			int index = 0;
			for (Integer integer : nlist) {
				a[index++] = integer;
			}
			System.out.println(a[2]);
			
			Integer[]  z = list.toArray(new Integer[0]);
			for (Integer integer : z) {
				System.out.println(integer);
				
			}
			
			List< Integer> arrlist = new ArrayList<Integer>();
			for(int x : arr) {
				arrlist.add(x);
			}
			System.out.println("new list" +arrlist);
			
			
	}

}
