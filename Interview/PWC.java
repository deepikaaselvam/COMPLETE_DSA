package Interview;
public class PWC{
    public static char missingCharcater(char[] array)
    {
        if(array.length==0)
        {
            return ' ';
        }
       char[]extraCharacterArray= new char[array.length+1];
        for(int i=0;i<extraCharacterArray.length;i++)
        {
            extraCharacterArray[i]=(char)('a'+i);
        }
        for(int i=0;i<array.length;i++)
        {
            if(array[i]!=extraCharacterArray[i])
            {
                return extraCharacterArray[i];
            }
        }

        return extraCharacterArray[extraCharacterArray.length-1];

    }

    public static void main(String[] args) {
        char[]array={};//{'a','b','d','e','f'};//{'a','b','c'};//{'a','b','c','d','e','g','h','i','j','k'};//{'a','b','d','e','f'};
        System.out.println(missingCharcater(array));
        
    }
}