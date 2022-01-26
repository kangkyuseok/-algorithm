package test;

public class sosu {
	public static void main(String[] args) {
		int num = 29;
		
		boolean isPrimeNumber = true;
		//소수 1, 자기자신을 제외하고 나누어 떨어지는 약수가 있으면 -> 소수가아님
		// 소수 = 1과 자기자신만 나누어 떨어지면 소수.
		for(int i = 2; i <= num - 1;i++ ) {
			if(num % i == 0) {
				isPrimeNumber = false;
				
				
			}
		}
		if(isPrimeNumber) {
			System.out.println(num + "은 소수 입니다.");
		}else {
			System.out.println(num + "은 소수가 아닙니다.");
		}
		
		
	}
}
