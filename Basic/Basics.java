/* for(int i=0;i<=array.length-2;i++)         
        //using Nested Loop To check the array is Sorted
{
    for(int j=i+1;j<array.length;j++)
    {
        if(array[i]>array[j])
        {
            return  false;
        }
    }
}   */


 /*using Two Pointer approach To check the array is Sorted */
 /*{
    for(int i=0;i<array.length-1;i++)
     {
        if(array[i]>array[i+1])
        {
            return false;
        }
        
    }
    return true;
}*/

/*The largest element in the array using Brute Force Approach,Nested Loop Approach */
/*package Basic;
public class Basics {
    public static boolean isSorted(int[]array)   
     /*using Two Pointer approach To check the array is Sorted 
    {
        for(int i=0;i<array.length-1;i++)
         {
            if(array[i]>array[i+1])
            {
                return false;
            }
            
        }
        return true;
    }
    
    public static void main(String[] args) {
        int[]array={1,2,1,3,7,5,6};
        boolean ans=isSorted(array);
        System.out.println(ans+" ");
    }
    
}*/
/*package Basic;
public class Basics{
    public static void largestElement(int[]array)
    {
        int element=0;
        for(int i=0;i<=array.length-2;i++)
        {
            for(int j=1;j<=array.length-1;j++)
            {
                if(array[i]>array[j])
                {
                    element=array[i];
                }
                else{
                    element=array[j];
                }
            }
        }
        System.out.println("The Largest Element in the Arrray is "+element);
    }
    public static void main(String[] args) {
        int[]array={3,1,2,5,9,6782};
        largestElement(array);
        
    }
}*/

/*package Basic;
public class Basics
{
    public static int removeDuplicates(int[]array)
    {
        int i=1;
        while(i<=array.length-1)
        {
            if(array[i-1]!=array[i])
            {
                
               
               i++;
            }
            else{
                array[i-1]=array[i];
                i++;
                
            }
           
           i++;
      
        }
        return i+1;             
    }
    public static void main(String[] args) {
        int[]array={1,1,2,3,4,4,5};
        System.out.println(removeDuplicates(array));
       
        
    }
}*/



/*package Basic;
public class Basics{
    public static void secondLargest(int[]array)
    {
        int slargest=-1,largest=array[0];
        for(int i=1;i<array.length;i++)
        {
            if(array[i]>largest)
            { 
                slargest=largest;
                largest=array[i];
               
            }
            else if(array[i]<largest && array[i]>slargest)
            {
                slargest=array[i];
                
            }
        }
        System.out.println(slargest);
    }
    public static void secondSmallest(int[]array)
    {
        int smallest=array[0],secondSmallest=Integer.MAX_VALUE;
        for(int i=1;i<array.length;i++)
        {
            if(array[i]<smallest)
            {
                secondSmallest=smallest;
                smallest=array[i];
            }
            else if(array[i]!=smallest && array[i]<secondSmallest)
            {
                secondSmallest=array[i];
            }
        }
        System.out.println(secondSmallest+" ");
    }
    public static void main(String[] args) {
        int[]array={2,7,9,7,89,8,0};
        secondLargest(array);
        secondSmallest(array);
    }
}*/


/*package Basic;
public class Basics {
    public static void removeDuplicates(int[]array)
    {
        int i=0;
        for(int j=1;j<array.length;j++)
        {
            if(array[i]!=array[j])
            {
                array[i+1]=array[j];
               
                i++;
            }
            System.out.println(array[i+1]);
            

            
        }
       
    }
    public static void main(String[] args) {
        int[]array={1,1,2,2,2,2,3};
        removeDuplicates(array);
    }
}*/
package Basic;
public class Basics {
    public static int[] uniqueArray(int[]array)
    {
        int i=0;
        for(int j=1;j<array.length;j++)
        {
            if(array[i]!=array[j])
            {
                array[i+1]=array[j];
                i++;
            }
            // System.out.println(arrray[i+1]);
        }
        int answerArray[]=new int[i+1];
        System.arraycopy(arrray, 0, answerArray, 0, i+1);
        return answerArray;
        
    }
   
    public static void main(String[] args) {
        int[]array={1,1,2,2,2,3,3};
        int[]answer=uniqueArray(array);
        for(int  i=0;i<answer.length;i++)
        {
            System.out.println(answer[i]);
        }
       
    
    }
}
