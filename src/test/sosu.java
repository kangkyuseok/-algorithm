package test;

public class sosu {
	public static void main(String[] args) {
		int num = 29;
		
		boolean isPrimeNumber = true;
		//�Ҽ� 1, �ڱ��ڽ��� �����ϰ� ������ �������� ����� ������ -> �Ҽ����ƴ�
		// �Ҽ� = 1�� �ڱ��ڽŸ� ������ �������� �Ҽ�.
		for(int i = 2; i <= num - 1;i++ ) {
			if(num % i == 0) {
				isPrimeNumber = false;
				
				
			}
		}
		if(isPrimeNumber) {
			System.out.println(num + "�� �Ҽ� �Դϴ�.");
		}else {
			System.out.println(num + "�� �Ҽ��� �ƴմϴ�.");
		}
		
		
	}
}
