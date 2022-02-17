package com.te.questions.String;

public class DuplicateWoredOccurence {

	public static void main(String[] args) {

		int count = 0;
		String str = "krish is krish is krish again";
		String[] res = str.split(" ");
		for(int i = 0;i<res.length;i++) {
			count=1;
			for(int j =1+i;j<res.length;j++) {
				if(res[i].equals(res[j])) {
					count++;
					res[j]="x";
				}
			}
			if(count>1&&res[i]!="x")
			System.out.println(res[i]+" ");
		}
		
		
		
		
	}

}
