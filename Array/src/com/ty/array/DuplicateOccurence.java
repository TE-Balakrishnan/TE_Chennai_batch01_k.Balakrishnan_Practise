package com.ty.array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateOccurence {

	public static void main(String[] args) {

		int[] arr = { 4, 43, 343, 4, 343, 434, 343, 23, 43, 67, 89, 100 };
//		for(int i = 0;i<arr.length;i++) {
//			for(int j = i+1;j<arr.length;j++) {
//				if(arr[i]==arr[j]) {
//					System.out.println(arr[i]);
//				}
//			}
//		}
//		
		List<Integer> list = new ArrayList<Integer>();
//		Set<Integer> set = new HashSet<Integer>();
//
//		for (int i = 0; i < arr.length; i++) {
//			if (!set.add(arr[i])) {
//				list.add(arr[i]);
//
//			}
//
//		}
//		System.out.println(list);
		
		
		HashSet<Integer> set1 = new HashSet<Integer>();
		for(int res : arr) {
			if(set1.add(res)==false) {
				System.out.println(res);
			}
		}

	}

}
