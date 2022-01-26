package test;

import java.util.Arrays;

public class arrayscopy { //class
	private static int[] arr = {0,1,2,3,4,5,6,7,8,9,10};
	 public static void main(String[] args) {
		 
		 int [] array1 = {1,2,3,4,5};
		 for(int i : array1){
		  System.out.print(i +" "); 
		 }
		 
		 System.out.println();
		 
		 int [] array2 = Arrays.copyOf(array1, 2); // 원본배열 . 복사하고싶은요소의 길이
		 
		 for(int i : array2){
		  System.out.print(i +" "); 
		 }
		 
		 System.out.println();
		    int [] array3 = Arrays.copyOfRange(array1,3,4);  
		 
		 for(int i : array3){
		  System.out.print(i +" "); 
		 }
		 System.out.println();
		 int[] arr1 = Arrays.copyOfRange(arr, 2,6); //copyOfRange 원본배열 복사인덱스 마지막요소인덱스의 다음인덱스

		 System.out.print("arr의 요소 중 인덱스2에서 5까지  불러오기 :  ");
		 for(int i=0;i<arr1.length;i++) {
		 System.out.print(arr1[i]+" ");
		 }
	 }
} //class
