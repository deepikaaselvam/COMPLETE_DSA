package Basic;
public class Str {
    public static void main(String[] args) {
       StringBuffer sb=new StringBuffer("Hello");
       System.out.println("Buffer "+sb);
       System.out.println("Length "+sb.length());
       System.out.println("Capacity "+sb.capacity());

       sb.setCharAt(1,'i');
       sb.setLength(2);
       System.out.println("After setCharAt "+sb);
       System.out.println("charAt(1)after "+sb.charAt(1));


    }
    
}
