package Patterns;

public class Snake {
    public static void snakeGame(int[][]snakeArrayyyy)
    {
        int n=snakeArrayyyy.length;
        
        for(int i=0;i<n;i++)
        {
            int reverse=n-1;
            for(int j=0;j<n;j++)
            {
                if(i%2==0)
                {
                    System.out.print(snakeArrayyyy[i][j]+"  ");
                }
                else{
                    System.out.print(snakeArrayyyy[i][reverse]+"  ");
                    reverse--;

                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][]snakeArray={{1,2,3,1},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        snakeGame(snakeArray);

    }
    
}
