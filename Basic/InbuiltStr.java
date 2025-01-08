package Basic;

public class InbuiltStr {
    public static void main(String[] args) {
        String s[]={"asssssss","as","asss","mass","hero","superhero"};
        for(int i=0;i<s.length-1;i++)
        {
            for(int j=i+1;j<s.length;j++)
            {
                if(s[i].startsWith(s[j]))
                {
                    System.out.println(s[j]);
                   
                }
            }
        }
    }
    
}
