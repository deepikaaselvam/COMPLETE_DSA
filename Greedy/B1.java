/*package Greedy;
import java.util.Arrays;
public class B1 {
    public static void assignCookies(int[]greed,int[]cookiess)
    {
        Arrays.sort(greed);
        Arrays.sort(cookiess);
        int l=0,r=0;
        while(l<cookiess.length   && r<greed.length)
        {
            if(greed[r]<=cookiess[l])
            {
                r++;
            }
            l++;
        }
        System.out.println(r);
            
        
    }
    public static void main(String[] args) {
        int[]greed={1,5,3,3,4};
        int[]cookies={4,2,1,2,3};
        assignCookies(greed,cookies);
    }
    
}*/


/*package Greedy;
public class B1 {
    public static void validParanthesis(String Paranthesis)
    {
        int cnt=0;
        char[]CharacterArray=Paranthesis.toCharArray();
        for(int i=0;i<CharacterArray.length;i++)
        {
            if(CharacterArray[i]=='(')
            {
                cnt++;
            }
            else if(CharacterArray[i]==')')
            {
                cnt--;
            }
        }
        if(cnt==0)
        {
            System.out.print("Valid ");
        }
        else if(cnt<0)
        {
            System.out.println("Not Valid");
        }
       
    }
    public static void main(String[] args) {
        String paranthesis="(()())";
        validParanthesis(paranthesis);
    }
}*/
// package Greedy;
// import java.util.Arrays;
// public class B1 {
//     public static void shortestJobFirst(int[]SJF)
//     {
//         Arrays.sort(SJF);

//     }
//     public static void main(String[] args) {
//         int[]sjf={4,3,7,1,2};
//         shortestJobFirst(sjf);
//     }
// }



package Greedy;
public class B1{
    public static void stringCompression(String str)
    {
        int cnt=0;
        for(int i=1;i<str.length();i++)
        {
            
           if(str.charAt(i-1)!=str.charAt(i)||str.charAt(i)==str.length()-1)
            {
                cnt++;
                System.out.print(str.charAt(i)+""+cnt);
                cnt=0;
               
            }
            else{
                cnt++;
            }
        }

    }
    public static void main(String[] args) {
        String s="aaabbbcccdd";
        stringCompression(s);
    }
}