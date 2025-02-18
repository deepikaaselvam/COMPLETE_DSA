package stack;
import java.util.HashMap;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            String s = scanner.next();
            
            HashMap<String,String>mp =new HashMap<>();
            mp.put("00","A");
            mp.put("01","T");
            mp.put("10","C");
            mp.put("11","G");
            StringBuilder ans=new StringBuilder();
            String untilMatch="";
            for(int i=0;i<s.length();i++)
            {
                 untilMatch+=s.charAt(i);
                
                if(mp.containsKey(untilMatch))
                {
                    ans.append(mp.get(untilMatch));
                    untilMatch="";
                    
                }
              
            }
            System.out.println(ans);

            // Your code goes here
        }
    }
}
