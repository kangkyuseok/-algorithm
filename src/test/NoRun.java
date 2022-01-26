package test;
import java.util.*;
/*���� ����
������ ������ �������� �����濡 �����Ͽ����ϴ�. �� �� ���� ������ �����ϰ�� ��� ������ �������� �����Ͽ����ϴ�.

�����濡 ������ �������� �̸��� ��� �迭 participant�� ������ �������� �̸��� ��� �迭 completion�� �־��� ��, �������� ���� ������ �̸��� return �ϵ��� solution �Լ��� �ۼ����ּ���.

���ѻ���
������ ��⿡ ������ ������ ���� 1�� �̻� 100,000�� �����Դϴ�.
completion�� ���̴� participant�� ���̺��� 1 �۽��ϴ�.
�������� �̸��� 1�� �̻� 20�� ������ ���ĺ� �ҹ��ڷ� �̷���� �ֽ��ϴ�.
������ �߿��� ���������� ���� �� �ֽ��ϴ�.
����� ��
participant	completion	return
["leo", "kiki", "eden"]	["eden", "kiki"]	"leo"
["marina", "josipa", "nikola", "vinko", "filipa"]	["josipa", "filipa", "marina", "nikola"]	"vinko"
["mislav", "stanko", "mislav", "ana"]	["stanko", "ana", "mislav"]	"mislav"
����� �� ����
���� #1
"leo"�� ������ ��ܿ��� ������, ������ ��ܿ��� ���� ������ �������� ���߽��ϴ�.

���� #2
"vinko"�� ������ ��ܿ��� ������, ������ ��ܿ��� ���� ������ �������� ���߽��ϴ�.

���� #3
"mislav"�� ������ �� �ܿ��� �� ���� ������, ������ ��ܿ��� �� ��ۿ� ���� ������ �Ѹ��� �������� ���߽��ϴ�.

��ó ���α׷��ӽ�!!*/
public class NoRun {
	class Solution {
	    public String solution(String[] participant, String[] completion) {
	        String answer = "";
	        Arrays.sort(participant);  //������� ����
	        Arrays.sort(completion);   // ��͵� ����
	        
	        int i = 0;     // int�� 0���� ����    
	        for(; i<completion.length; i++)   //for �ȿ� ���
	            if(!participant[i].equals(completion[i])) //���� ���������ƴϹ� ���´�         
	                break;
	            
	        return participant[i]; // ���ϳ�����?
	    }
	    
	}
	
}
