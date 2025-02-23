package Heap;
import java.util.PriorityQueue;
public class KthLargest {
    public static int kthLargest(int[]array,int k)
    {
        if(k==0)
        {
            return -1;
        }
        PriorityQueue<Integer>maxHeap = new PriorityQueue<>();
        for(int i=0;i<array.length;i++)
        {
            maxHeap.add(array[i]);
            if(maxHeap.size()>k){
                maxHeap.poll();
            }
        }
        return maxHeap.peek();
    }
    public static void main(String[] args) {
        int[]array={3,2,1,4,5,6};
        int k=1;
        System.out.print(kthLargest(array,k));;
    }
    
}
