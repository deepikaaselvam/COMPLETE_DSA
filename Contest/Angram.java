package Contest;

public class Angram {


    // Function is to check whether two strings are anagram of each other or not.
    public static boolean areAnagrams(String s1, String s2) {

        // Your code here
        if(s1.length() != s2.length())
        {
            return false;
        }
        int ans1=0;int ans2=0;
        int[]checkAnagrams=new int[26];
        for(int i=0;i<s1.length();i++)
        {
            ans1=s1.charAt(i)-'a';
            checkAnagrams[ans1]+=1;
            ans2=s2.charAt(i)-'a';
            checkAnagrams[ans2]-=1;
        }
        for(int i=0;i<checkAnagrams.length;i++)
        {
            if(checkAnagrams[i]!=0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s1="geeks";
        String s2="seekg";
        System.out.println(areAnagrams(s1, s2));
        
    }
}
    

