package TwoPointer;

public class MovesToZero {
    public static int[]movesZeroToEnd(int[]array)
    {
        int i=0,j=0;int temp;
        while(j<array.length)
        {
            
            if(array[i]!=0 && array[j]!=0)
            {
                i++;j++;
            }
            else{
                j++;
                if(j>=array.length) break;
                while(array[j]!=0 )
                {
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                    i++;j++;
                    if(j>=array.length)
                    {
                        break;
                    }
                }
               
            }
            
        }
        return array;
    }
    public static void main(String[] args) {
        int[]array ={12,3,4,5,1};//{0,12,10,0,65,0,0,0,0,0,23,5,0};//{0,12,10,0,65,0,0,0,0,0,23,5,0,99,88,77};//{0,12,10,0,65,0,0,0,0,0,23,5,0};//{1,2,3,4,5};//{12,3,4,0,0};//{0,0,0,0};//{12,10,0,65,0,0,23,5,0};
       int[]answer= movesZeroToEnd(array);
       for(int i=0;i<answer.length;i++)
       {
        System.out.print(answer[i]+" ");
       }
    }
    
}
