package Contest;

public class Rvowel {
    public static String reverseVowels(String s) {
            if(s.length()==1)
            {
                return s;
            }
            String vowels="aeiouAEIOU";
            char[]charArr=s.toCharArray();
            int l=0;int r=charArr.length-1;
            while(l<=r)
            {
                while( l<r && !vowels.contains(String.valueOf(charArr[l])) || charArr[l]==' ')
                {
                    l++;
                }
                while( l<r && !vowels.contains(String.valueOf(charArr[r])) ||charArr[r]==' ')
                {
                    r--;
                }
                if(l<r && vowels.contains(String.valueOf(charArr[l]))
                   && vowels.contains(String.valueOf(charArr[r])))
                {
                    char temp=charArr[l];
                    charArr[l] = charArr[r];
                    charArr[r]=temp;
                   
                }
                l++;
                r--;
            }
            return new String(charArr);
        }
    public static void main(String[] args) {
        String s="Race a car";//IceCreAm   //leetcode
        String answer=reverseVowels(s);
        System.out.println(answer);

        
    }
    
}
