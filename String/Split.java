package String;
public class Split {
    public static int SplitFunction(String numberous)
    {
        int cnt = 0;
        String splitting[]=numberous.split(";");
        for(String iteration:splitting)
        {
            if(iteration.equals("Hello"))//when I use the (iteration=="Hello")we use split() fn the refernces will be changed so thats why we are using the equals() method in java
            {
                cnt++;
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        String numerous ="Hello;Hii;Hello;Hiii;Hello";
        System.out.println(SplitFunction(numerous));
        String character = "Deepika";
        System.out.println(character.codePointAt(3));
        System.out.println(character.codePointBefore(3));
        System.out.println(character.codePointCount(0, 3));
    }
    
}
