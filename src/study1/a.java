package study1;

public class a { //���� ���� ���
	public static void main(String[] args) {
		int n = 13241324;
		
		int arr[] = new int [10]; // 0~9 �Էµ� ���� cnt ���� �뵵
		
		
		while(n > 0) {        //ũ�⸸ŭ���鼭 ���ϰ�??
			arr[n % 10]++;
			n /= 10;
			
		}
		
		for(int i = 0; i < 10; i++) {
			System.out.println(i+":" + arr[i]);
		}
	}
}
