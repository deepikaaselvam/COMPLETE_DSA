package POTD;
public class Dec2 {
    public static int isPrefixOfWord(String sentence, String searchWord) {
            int matchIndex=1;
            char[]c1=sentence.toCharArray();
            char[]c2=searchWord.toCharArray();
            int i=0,j=0;
            while (i < c1.length) 
            {
                // Check if starting a new word or beginning of sentence
                if ((i == 0 || c1[i - 1] == ' ') && c1[i] == c2[j]) 
                {
                    j++;
                    int tempI = i + 1; // Temporary index to continue matching

                    while (j < c2.length && tempI < c1.length && c1[tempI] == c2[j]) 
                    {
                        tempI++;
                        j++;
                    }

                    if (j == c2.length) 
                    {
                        return matchIndex;
                    }
                    j = 0; // Reset if the full word wasn't matched
                }
                if (c1[i] == ' ') 
                {
                    matchIndex++; // Move to the next word
                }
            i++;
        }
     return -1;
}
    

        public static void main(String[] args) {
            String s1="this problem is the very easiedst program";//i use triple pillow   //i love eating burger
            String s2="pro";//pill   //burg
            System.out.println(isPrefixOfWord(s1, s2));
            
        }
    }
    

/*  public class Dec2 {
        public static int isPrefixOfWord(String sentence, String searchWord) {
             String[] words = sentence.split(" ");
             for (int i = 0; i < words.length; i++) {
                if (words[i].startsWith(searchWord)) {
                    return i + 1;
                }
             }
             return -1;
         }
         public static void main(String[] args) {
             String s1="hellohello helloello ";//i use triple pillow   //i love eating burger   //this problem is the very easiedst program
             String s2="ell";//pill   //burg
             System.out.println(isPrefixOfWord(s1, s2));
            
         }
   }*/