package Interview;
public class Basic {
    public static void main(String[] args) {
        String s="100";
        int N = s.length();
        int K =3;
        String ans="";
       
        for(int i=0;i<N*K;i++)
        {
            ans=ans+s.charAt(i%N);
        }
        System.out.println(ans);
    }
    
}
