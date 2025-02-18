package POTD;

public class Jan6 {
    public static int[] miniOperationstomoveOneBall(String boxes)
    {
        int answer[]= new int[boxes.length()];
        int[]Questionarray = new int[boxes.length()];
        for(int i=0;i<boxes.length();i++)
        {
            Questionarray[i]=boxes.charAt(i)-'0';
        }
        int leftArray[]=new int[boxes.length()];
        int[]rightArray=new int[boxes.length()];
        int OnesCnt=0;
        //To calculate the left prefixsum and left One Count
        OnesCnt=Questionarray[0];
        leftArray[0]=0;
        for(int i=1;i<leftArray.length;i++)
        {
            leftArray[i]=leftArray[i-1]+OnesCnt;
            OnesCnt+=Questionarray[i];
        }
        //To calculate the right prefixsum and right One Count
        OnesCnt=Questionarray[Questionarray.length-1];
        rightArray[rightArray.length-1]=0;
        for(int i=rightArray.length-2;i>=0;i--)
        {
            rightArray[i]=rightArray[i+1]+OnesCnt;
            OnesCnt+=Questionarray[i];
        }
        //To Calculate the Answer
        for(int i=0;i<boxes.length();i++)
        {
            answer[i]=leftArray[i]+rightArray[i];
        }
       
        return answer;

    }
    public static void main(String[] args) {
        String s="001011";//"10101";//"001011";
        int[]result = miniOperationstomoveOneBall(s);
        System.out.println();
        for(int i=0;i<result.length;i++)
        {
            System.out.print(result[i]+" ");
        }
    }
     //Brute Force Approach
        /*
        char[]CharacterArray = s.toCharArray();
         for(int i=0;i<CharacterArray.length;i++)
         {
             for(int j=0;j<CharacterArray.length;j++)
             {
                 if(CharacterArray[j]=='1')
                 {
                     answer[i]+=Math.abs(i-j);
                 }
             }
         }
         * 
         */
        
         //Problem Description
         /*
          * You have n boxes. You are given a binary string boxes of length n, where boxes[i] is
           '0' if the ith box is empty, and '1' if it contains one ball.
In one operation, you can move one ball from a box to an adjacent box. Box i is adjacent to box j if
 abs(i - j) == 1. Note that after doing so,
 there may be more than one ball in some boxes.
Return an array answer of size n, where answer[i] is the minimum number of operations needed 
to move all the balls to the ith box.
Each answer[i] is calculated considering the initial state of the boxes.

 

Example 1:

Input: boxes = "110"
Output: [1,1,3]
Explanation: The answer for each box is as follows:
1) First box: you will have to move one ball from the second box to the first box in one operation.
2) Second box: you will have to move one ball from the first box to the second box in one operation.
3) Third box: you will have to move one ball from the first box to the third box in two operations,
 and move one ball from the second box to the third box in one operation.
Example 2:

Input: boxes = "001011"
Output: [11,8,5,4,3,4]
 

Constraints:

n == boxes.length
1 <= n <= 2000
boxes[i] is either '0' or '1'.
          */
    
}
