package Contest;

public class Bits {
    public static int binarytoNumberConversion(int n)
    {
        String binaryNo=Integer.toBinaryString(n);
        char[]BinaryArray=binaryNo.toCharArray();
        for(int i=0;i<BinaryArray.length;i++)
        {
            if(BinaryArray[i]=='1')
            {

            }
            else{
                BinaryArray[i]++;

            }
        }
        String binaryString=new String(BinaryArray);
        int decimal=Integer.parseInt(binaryString,2);
        return decimal;

    }
    public static void main(String[] args) {
        int n=18;
        System.out.println(binarytoNumberConversion(n));
       
    }
    
}
