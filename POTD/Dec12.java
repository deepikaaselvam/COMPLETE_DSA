package POTD;
import java.util.PriorityQueue;
import java.util.Collections;       //Using Priority Queue or Heap Concept
public class Dec12 {
    public static long takeGiftsfromPile(int[]gifts,int k)
    {
        PriorityQueue<Integer>heap=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<gifts.length;i++)
        {
            heap.add(gifts[i]);
        }
        while(k>0 && !heap.isEmpty())
        {
            int topVal = heap.poll();
            int FloorsqrtConversion = (int)Math.floor(Math.sqrt(topVal));
            heap.add(FloorsqrtConversion);
            k--;
        }


        long TotalGifts=0l;
        while(!heap.isEmpty())
        {
            TotalGifts += heap.poll();
        }
        return TotalGifts;

    }
    public static void main(String[] args) {
        int[]gifts={25,64,9,4,100};
        int k=4;
        long ans=takeGiftsfromPile(gifts,k);
        System.out.println(ans);
    }
    
}
