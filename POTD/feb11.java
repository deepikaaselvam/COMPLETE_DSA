package POTD;
public class feb11 {
    public static String removeOcuurence(String s,String part)
    {
        while(s.contains(part))
        {
            int partStartIndex = s.indexOf(part);
            String before = s.substring(0,partStartIndex);
            String after = s.substring(partStartIndex+part.length());
            s=before+after;
        }

        return s;
    }
    public static void main(String[] args) {
     
        String s="daabcbaabcbc";
        String part ="abc";
        removeOcuurence(s,part);

        
    }
    
}
   // StringBuffer s=new StringBuffer("daabcbaabcbc");
        // StringBuffer part =new StringBuffer("abc");
        // StringBuffer qnsAlternate =s;
        // while(qnsAlternate.length()>=0)
        // {
        //     int index = s.indexOf(part.toString());
        //     if (index != -1) {
        //         s.delete(index, index + part.length());
        //     } else {
        //         break;
        //     }


        // }
        // System.out.println(qnsAlternate.toString());
        // String name = "Deepika";
        // name.replace('D','K');
        // System.out.println(name);
        // String cntry ="India";
        // // String cntry1 = new String("India").intern();
        // // System.out.println(cntry == cntry1);
        // String characterChange = Character.toString((char)(97)) + Character.toString((char)(99));
        // System.out.println(characterChange);
