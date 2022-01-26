package test;

import java.util.Arrays;
//array	                           commands	                 return
//[1, 5, 2, 6, 3, 7, 4]	[[2, 5, 3], [4, 4, 1], [1, 7, 3]]	[5, 6, 3]
public class K_number {

  
    
    
      public static int[] solution(int[] array, int[][] commands) {
            int[] answer = new int[commands.length];     // 답지에 커맨드의양만듬 담고
                for(int i=0; i<commands.length; i++) {     
                    int[] find = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
                    Arrays.sort(find);
                    
               
                    
                    answer[i] = find[commands[i][2]-1];
                    }
            
            return answer;
        }
      public static void main(String[] args) {
          int[] array = {1,5,2,6,3,7,4};
           int [][] commands = {{2,5,3},{4,4,1},{1,7,3}};
           int[] resi = solution(array,commands);
           
           for (int C : resi) {
               System.out.print(C);
           }
       }
}

