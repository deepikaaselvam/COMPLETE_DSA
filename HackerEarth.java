
import java.util.HashMap;
import java.io.IOException;
import java.util.stream.*;

import java.util.Scanner;
class Result {

  

    public static String happyLadybugs(String b) {
    // Write your code here
        HashMap<Character,Integer>mpp = new HashMap<>();
        boolean hasEmptySpace =false;
     
        for(int i = 0 ;i<b.length();i++)
        {
            char letter = b.charAt(i);
            if(letter =='_')
            {
               hasEmptySpace =true;
            }
            if(letter>='A' && letter<='Z')
            {
                mpp.put((letter), mpp.getOrDefault((char) letter, 0) + 1);
            }
           
        }
        for(Character key :mpp.keySet())
        {
            if( mpp.get(key)<2)
            {
                return "NO";
            }
           
        }
        if(!hasEmptySpace)
        {
            boolean alreadyHappy =true;
            for(int i=1;i<b.length()-1;i++)
            {
                if(b.charAt(i) != b.charAt(i-1) && b.charAt(i) != b.charAt(i+1))
                {
                    alreadyHappy =false;
                    break;
                }
            }
            if(!alreadyHappy)
            {
                return "NO";
            }
        }
        return "YES";
      
      


    }

}
/*
 * 1.4
7
RBY_YBR
6
X_Y__X
2
__
6
B_RRBR
Your Output (stdout)

YES
NO
YES
YES
 */


 /*
  * 2.5
5
AABBC
7
AABBC_C
1
_
10
DD__FQ_QQF
6
AABCBC
Your Output (stdout)

NO
YES
YES
YES
NO

  */

public class HackerEarth {
    public static void main(String[] args) {
  


        Scanner kbd = new Scanner(System.in);
        int n =kbd.nextInt();
        for(int i=1;i<=n;i++)
        {
            int no =kbd.nextInt();
            String str =kbd.next();
            String ans = Result.happyLadybugs(str);
            System.out.println(ans);

        }

        
    }
}
      // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        // // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        // int g = Integer.parseInt(bufferedReader.readLine().trim());

        // IntStream.range(0, g).forEach(gItr -> {
        //     try {
        //         int n = Integer.parseInt(bufferedReader.readLine().trim());

        //         String b = bufferedReader.readLine();

        //         String result = Result.happyLadybugs(b);

              
        //     } catch (IOException ex) {
        //         throw new RuntimeException(ex);
        //     }
        // });


        // bufferedReader.close();