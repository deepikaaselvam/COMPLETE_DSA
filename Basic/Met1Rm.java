package Basic;
import java.util.ArrayList;
public class Met1Rm {
    public static void nMeetingInOneRoom(int[]start,int[]end)
    {
        ArrayList<Integer>list = new ArrayList<>();
        for(int i=0;i<start.length;i++)
        {
            list.add(start[i],end[i]);
        }
        for(int i=0;i<list.size();i++)
        {
            System.out.print(list.get(i)+" ");
        }
    }
    public static void main(String[] args) {
        int[]start={0,3,1,5,5,8};
        int[]end={5,4,2,79,7,9};
        nMeetingInOneRoom(start,end);
    }
    
}
