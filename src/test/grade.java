package test;



public class grade {
	static int[] grade = {3,2,1,2};
	    public static int[] solution(int[] grade) {
	    	int[] answer = new int[grade.length]; //정답은 grade길이만큼이고,,
	        int rank; //순위
	      
	        for(int i=0; i<grade.length; i++){
	        rank = 1;
	            for(int j=0; j<grade.length; j++){
	                if (grade[i]<grade[j]) {
	                    rank++;

	                    answer[i] = rank;
	                }
	            }
	        }
	        return answer;
	    	
//	        int[] answer = new int[grade.length];
//	        	for(int i=0; i<grade.length; i++) {
//	        		int[] find = Arrays.copyOfRange(grade,grade[i]+1,grade[i]);
//	        		Arrays.sort(grade);
//	        	}
//	        return answer;
	    }
	    public static void main(String[] args) {
	    	int[] resi = solution(grade);
	           
	           for (int C : resi) {
	               System.out.print(C);
	   
	        } 	 
	               
	               
	               
	               
	               
	               
	               
	               
			
		}
}
	

