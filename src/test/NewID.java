package test;

public class NewID {
	boolean isValid(char c) {
		if (Character.isLetterOrDigit(c)) return true;
		if (c == '-' || c == '_' || c == '.') return true;
		return false;
	}
	public String NewID(String new_id) {
		StringBuilder answer = new StringBuilder(); //answerŸ���� ��Ƽ�������� �ٲ�
		
		boolean lastDot = false;
		for(char ch : new_id.toCharArray()) {  //���ڿ� �ϳ��ϳ� Ž��
			if(isValid(ch) == false) continue;
			if (ch == '.') {
				if(answer.length() == 0 || lastDot) continue;
				lastDot = true;
			} else {
				lastDot = false;
			}
			
			ch = Character.toLowerCase(ch);
			answer.append(ch);
		}
		
		if(answer.length() >= 16)   //16���� �̻��ϰ��
			answer.setLength(15);   //15���� ����
		
		if(answer.length() == 0 )
			answer.append('a');
		
		if(answer.charAt(answer.length() - 1) == '.')
			answer.deleteCharAt(answer.length() - 1 );
		
		if(answer.length() <= 2) {
			char ch = answer.charAt(answer.length() - 1);
			while (answer.length() < 3) {
				answer.append(ch);
			}
		}
		
		return answer.toString(); //to.string �ϰ� ��ȯ
	}
}
