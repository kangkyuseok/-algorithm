package test;

import java.util.Arrays;

public class test1 {

	public static void sort() {
	int numSort[] = {1,2,3,4,5,6};
	Arrays.sort(numSort);
	
	for(int i=0; i<numSort.length; i++) {
		System.out.println(i + numSort[i]);
	}
	
	
	}
	public static void main(String[] args) {
		sort();
	}
}
