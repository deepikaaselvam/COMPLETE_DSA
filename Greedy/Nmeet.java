package Greedy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class Meeting{
    int start,end,index;
    Meeting(int start,int end,int index)
    {
        this.start=start;
        this.end=end;
        this.index=index;
    }
}
class MeetingComparator implements Comparator<Meeting>
{
    public int compare (Meeting m1,Meeting m2)
    {
        if(m1.end!=m2.end)
        {
            return m1.end - m2.end;
        }
        return m1.index - m2.index;
    }
}
public class Nmeet {
    public static ArrayList<Integer> maxMeetings(int[]a1,int[]a2)
    {
        if(a1.length!=a2.length)
        {
            return null;
        }
        ArrayList<Meeting>meet = new ArrayList<>();
        int length1= a1.length;
        for(int i=0;i<length1;i++)
        {
            meet.add(new Meeting(a1[i],a2[i],i+1));

        }
        Collections.sort(meet, new MeetingComparator());
        ArrayList<Integer> selectedMeetings = new ArrayList<>();
        int lastEndTime = -1;

        for (Meeting meeting : meet) {
            if (meeting.start > lastEndTime) {
                selectedMeetings.add(meeting.index);
                lastEndTime = meeting.end;
            }
        }

        return selectedMeetings;
       
    }
    public static void main(String[] args) {
        int[]array1={0,3,1,5,5,8};
        int[]array2={5,4,2,9,7,9};
        ArrayList<Integer>selectedMeeeting=maxMeetings(array1,array2);
        System.out.println("Maximum Meeting will be done are ");
        for(int i=0;i<selectedMeeeting.size();i++)
        {
            System.out.print(selectedMeeeting.get(i)+" ");

        }
       
    }
    
}
