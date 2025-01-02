package Contest;

public class gfg {
    
        // Function to find the first non-repeating character in a string.
        static char nonRepeatingChar(String s) {
            int[]array=new int[26];
           int ans=0;
           char character='\0';
         
            char[]stringArray=s.toCharArray();
            for(int i=0;i<stringArray.length;i++)
            {
             ans=stringArray[i]-'a';
             array[ans]++;
       
            }
            for(int i=0;i<array.length;i++)
            {
                if(array[i]==1)
                {
                    int  t=i+'a';
                   character=(char)(t);
                   break;
                }
                else if(array[i]>1||array[i]==0)
                {
                   
                }
             
            }
            return character;
        }
        public static void main(String[] args) {
            String s = "hello";//geeksforgeeks
            System.out.println(nonRepeatingChar(s));
        }
    }
    

