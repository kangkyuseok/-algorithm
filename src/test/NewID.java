package test;

public class NewID {
	boolean isValid(char c) {
		if (Character.isLetterOrDigit(c)) return true;
		if (c == '-' || c == '_' || c == '.') return true;
		return false;
	}
	public String NewID(String new_id) {
		StringBuilder answer = new StringBuilder(); //answer타입을 스티링빌더로 바꿈
		
		boolean lastDot = false;
		for(char ch : new_id.toCharArray()) {  //문자열 하나하나 탐색
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
		
		if(answer.length() >= 16)   //16글자 이상일경우
			answer.setLength(15);   //15개로 변경
		
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
		
		return answer.toString(); //to.string 하고 반환
	}
}
