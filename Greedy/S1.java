package Greedy;
import java.lang.String;

public class S1 {

    public static void  main(String []args)
    {
      String s1="  The Sky is Blue";
      String s2="";
      String s3="";
      int j=s1.length()-1;
      while(j>=0)
      {
       /*  if(s1.charAt(j)==' '&&  s2.length()==0)    //we use the Trimming Function so No problem,,To use these
        {
           
        }*/
        if(s1.charAt(j)!=' ')
        {
            s2=s1.charAt(j)+s2;
        }
        else if(s1.charAt(j)==' ' && s2.length()>0)
        {
            
           
            s3+=s2+" ";
            s2="";
        }

        j--;
        
      }
      if (!s2.isEmpty()) {
        s3 += s2;
    }
      System.out.println(s3.trim());
     }

    }
    

