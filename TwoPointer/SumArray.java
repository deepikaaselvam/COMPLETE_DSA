package TwoPointer;
public class SumArray {
    public static int[]prefixSumArray(int[]question){
        int[]prefixSum= new int[question.length];
        prefixSum[0]=question[0];
        for(int i=1;i<question.length;i++)
        {
            prefixSum[i]=prefixSum[i-1]+question[i];
        }
        //to calculate the sum between index 2 and 6;
        //to do that ,we use the Prefix Sum Method ...Formulae ->A[i,j]=A[j]-A[i-1];
        int ParticularRangeAnswer=prefixSum[6]-prefixSum[2-1];
        System.out.println(ParticularRangeAnswer);
        return prefixSum;
    }
    public static void main(String[] args) {
        int[]array1={6,3,-2,4,-1,0,-5};
       int[]answer = prefixSumArray(array1);
       
       for(int i=0;i<answer.length;i++)
       {
        System.out.print(answer[i]+" ");
       }
    }
    
}
