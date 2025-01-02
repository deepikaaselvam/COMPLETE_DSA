package Greedy;

import java.util.Collections;
import java.util.ArrayList;
import java.util.Comparator;

// class Meeting {
//     int start;
//     int end;
//     int index;

//     Meeting(int start, int end, int index) {
//         this.start = start;
//         this.end = end;
//         this.index = index;
//     }
// }

// class MeetingComparator implements Comparator<Meeting> {
//     public int compare(Meeting m1, Meeting m2) {
//         // Sort by end time, and by index if end times are equal
//         if (m1.end != m2.end) {
//             return m1.end - m2.end;
//         }
//         return m1.index - m2.index;
//     }
// }

public class nMeetingInOneRoom {
    public static ArrayList<Integer> maxMeetings(int[] start, int[] end, int n) {
        ArrayList<Meeting> meetings = new ArrayList<>();
        
        // Add all meetings
        for (int i = 0; i < n; i++) {
            meetings.add(new Meeting(start[i], end[i], i + 1));
        }

        // Sort the meetings using the custom comparator
        Collections.sort(meetings, new MeetingComparator());

        ArrayList<Integer> ans = new ArrayList<>();
        int lastEndTime = -1;

        // Select meetings
        for (Meeting meet : meetings) {
            if (meet.start > lastEndTime) {
                ans.add(meet.index);
                lastEndTime = meet.end;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] start = {0, 3, 1, 5, 5, 8};
        int[] end = {5, 4, 2, 9, 7, 9};
        int n = start.length;

        ArrayList<Integer> selectedMeetings = maxMeetings(start, end, n);
        System.out.println("Selected Meetings: " + selectedMeetings);
    }
}

