package Interview;

public class Conversion {
    public static String conversion(String time)
    {
        String answer="";
        String[]splitArray= time.split(":");
        if(time.contains("PM"))
        {
            if(splitArray[0].equals("12"))
            {
                answer = splitArray[0]+":"+splitArray[1]+":"+splitArray[2].replace("PM","");
            }
            else{
                int hour = Integer.parseInt(splitArray[0]);
                hour+=12;
                answer=(hour) +":"+splitArray[1]+":"+splitArray[2].replace("PM","");
            }
        }
        else{
            if(splitArray[0].equals("12"))
            {
                answer=("00") +":"+splitArray[1]+":"+splitArray[2].replace("AM","");
            }
            else{
                answer=splitArray[0]+":"+splitArray[1]+":"+splitArray[2].replace("AM","");
            }


        }
        return answer;
    }
    public static void main(String[] args) {
        String t="11:58:00PM";//"12:01:00AM";//"12:00:00PM";
        System.out.println(conversion(t));
    }
    
}
