package SreedharSirPlacement;
public class N_Queen
{
    private static boolean isQueenSafe(int[]Queen_Placed,int qno,int pos)
    {
        int row;
        int col;
        int Placed_Array_Length =Queen_Placed.length;
         //left Diagonal     ->(r,c) = (r-1,c-1)
         for(row=qno-1,col=pos-1;(row>=0&&col>=0);row--,col--)
         {
            if(Queen_Placed[row]==col) return false;
         }
         //Top                ->(r,c) = (r-1,c)
         for(row=qno-1;row>=0;row--)
         {
            if(Queen_Placed[row]==pos) return false;
         }
         //Right Diagonal      ->(r,c) = (r-1,c+1)
         for(row=qno-1,col=pos+1;(row>=0 &&col<Placed_Array_Length);row--,col++)
         {
            if(Queen_Placed[row]==col) return false;
         }
         return true;
    }
    private static void printBoard(int[]Queen_Position)
    {
        int row;
        int col;
        for(row=0;row<Queen_Position.length;row++)
        {
            for(col=0;col<Queen_Position.length;col++)
            {
                System.out.printf( "%s\t", (Queen_Position[row]==col)?"Q":"-");
            }
            System.out.println();
        }
    }
    private static void n_Queen_Solver_helper(int[]Queen_Placed,int row)
    {
        if(row==Queen_Placed.length)
        {
            printBoard(Queen_Placed);
            return;
        }
        int col;
        for(col =0;col < Queen_Placed.length;col+=1)
        {
            if(isQueenSafe(Queen_Placed, row, col)==true)
            {
                Queen_Placed[row]=col;
                n_Queen_Solver_helper(Queen_Placed,row+1);
                Queen_Placed[row]=-1;
            }
        }
      
  
    }
    public static void n_Queen_Solver(int no_of_Queens)
    {
        //arm length 
        if(no_of_Queens==1)
        {
            System.out.println("Q");
            return;
        }
        //pass an environment
        int[]Queen_Placed =new int[no_of_Queens];

        // System.out.println("here1");
        for(int Qposition_Index =0;Qposition_Index<no_of_Queens;Qposition_Index+=1)
        {
            Queen_Placed[Qposition_Index] = -1 ;
        }
        //call a helper recursively,initiate
        n_Queen_Solver_helper(Queen_Placed,0);
    }
    public static void main(String[] args) {
        int No_of_Queens=8;
        n_Queen_Solver(No_of_Queens);
    }
}