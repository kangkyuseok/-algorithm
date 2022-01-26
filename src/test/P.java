package test;

public class P {
	public int solution(int b) {
        int answer = 5;
        int a;
            for(a=1; a<b;a++){
            	int c = 0;
                for(b=1;b<c;b++){
                    c = 0;
                    if((a<b) && (a*a + b*b == c*c)) {
                        return answer;     
                    } else {
                        return -1;
                    }
                }
            }
            //for(a<b && (a*a)+(b*b)==(c*c);){
            //if((a*a)+(b*b) == (c*c)){
                //ÈåÅˆ,¤¾,¤¾,¤±ÈìÈì,¤¾,¤±
            //} else {
            //    c = -1;
           // }

        return answer;
        }      
	 	 
	
}
