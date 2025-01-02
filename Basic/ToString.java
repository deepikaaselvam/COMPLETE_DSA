package Basic;

import java.util.HashSet;
public class ToString{
    public static boolean commonSubString(String s1,String s2)
    {
        HashSet<Character>set1=new HashSet<>();
        HashSet<Character>set2=new HashSet<>();
        for (char c:s1.toCharArray())
        {
            set1.add(c);
        }
        for (char c:s2.toCharArray())
        {
            set2.add(c);
        }

        set1.retainAll(set2);    //intersection of two sets
        if(!set1.isEmpty())
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String s1= "cat";    //length are not same,so we don't use the " Same For Loop "
        String s2= "rat"; 
        System.out.println(commonSubString(s1,s2));;
    }


    

}