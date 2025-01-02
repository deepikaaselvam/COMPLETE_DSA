package Contest;

public class gfg1 {
        public int getSecondLargest(int[] arr) {
            if(arr.length==1)
            {
                return -1;
            }
            int largest=arr[0],secondLargest=-1;
            
            for(int i=1;i<arr.length;i++)
            {
               if(arr[i]>largest)
               {
                    secondLargest=largest;
                   largest=arr[i];
                 
               }
               else if(arr[i]<largest && arr[i]>=secondLargest)
               {
                   secondLargest=arr[i];
               }
              
               
            }
            return secondLargest;
            
         
        }
        public static void main(String[] args) {
            gfg1 gfg = new gfg1();
            int[]arr={10,10,10};//10,20,30,40,50   //10,5,10 //2, 35, 1, 10, 34, 1
            System.out.println(gfg.getSecondLargest(arr));
        }
    }
    

