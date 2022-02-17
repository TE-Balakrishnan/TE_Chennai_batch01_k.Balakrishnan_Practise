package com.ty.array.copy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MapDuplicate {

	public static void main(String[] args) {

			int[]	a= {58,45,45,58,1,2,3,45};
			
			Set<Integer> set = new HashSet<Integer>();
			List<Integer>list = new ArrayList<Integer>();
			Set<Integer> nset = new HashSet<Integer>();
			for(int res : a) {
				if(!set.add(res)) {
					nset.add(res);
				}
			}
			System.out.println(nset);
		
		
	}

}
