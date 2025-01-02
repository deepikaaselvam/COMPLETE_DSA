package Basic;

public class Str2 {
    public static void main(String[] args) {
        String t1="DATA STRUCTURE WITH JAVA";
        String t2="DATA STRUCTURE WITH C++";
        String t3="DATA STRUCTURE WITH JAVA";
        String t4="data structure with c++";
        String t5="data structure with java";
        Boolean op1=t1.equalsIgnoreCase(t2);
        Boolean op2=t1.equals(t3);
        int op3=t1.compareTo(t4);
        int op4=t1.compareToIgnoreCase(t5);
        System.out.println(op1);
        System.out.println(op2);
        System.out.println(op3);
        System.out.println(op4);

    }
    
}
