package String;
import java.util.HashMap;
public class Word {
    public static boolean iswordPattern(String pattern, String s) {
        String wordSplitting[]=s.split(" ");
        if(pattern.length()!=wordSplitting.length)
        {
            return false;
        }
        
        HashMap<Character,String> charToWord=new HashMap<>();
        HashMap<String,Character>wordTochar=new HashMap<>();
        for(int i = 0 ;i<pattern.length();i++)
        {
            char c=pattern.charAt(i);
            String word=wordSplitting[i];
            if(charToWord.containsKey(c))
            {
                if(!charToWord.get(c).equals(word))
                {
                    return false;
                }
            }
                else{
                    charToWord.put(c,word);
          }
            
            if(wordTochar.containsKey(word))
            {
                if(wordTochar.get(word)!=c)
                {
                    return false;
                }
            }
                else{
                    wordTochar.put(word,c);
                }
            
        }
        
        
        return true;
        
    }
    public static void main(String[] args) {
        String pattern="abca";
        String word="dog cat cat dog";
        System.out.println(iswordPattern(pattern, word));
        
    }
}
    

