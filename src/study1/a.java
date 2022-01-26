package study1;

public class a { //숫자 갯수 출력
	public static void main(String[] args) {
		int n = 13241324;
		
		int arr[] = new int [10]; // 0~9 입력된 수를 cnt 위한 용도
		
		
		while(n > 0) {        //크기만큼돌면서 구하고??
			arr[n % 10]++;
			n /= 10;
			
		}
		
		for(int i = 0; i < 10; i++) {
			System.out.println(i+":" + arr[i]);
		}
	}
}
