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
		 
		 int [] array2 = Arrays.copyOf(array1, 2); // �����迭 . �����ϰ��������� ����
		 
		 for(int i : array2){
		  System.out.print(i +" "); 
		 }
		 
		 System.out.println();
		    int [] array3 = Arrays.copyOfRange(array1,3,4);  
		 
		 for(int i : array3){
		  System.out.print(i +" "); 
		 }
		 System.out.println();
		 int[] arr1 = Arrays.copyOfRange(arr, 2,6); //copyOfRange �����迭 �����ε��� ����������ε����� �����ε���

		 System.out.print("arr�� ��� �� �ε���2���� 5����  �ҷ����� :  ");
		 for(int i=0;i<arr1.length;i++) {
		 System.out.print(arr1[i]+" ");
		 }
	 }
} //class
