package Practice;

import java.util.Stack;

public class FPrice {
    public static int[] finalPrices(int[]prices)
    {
       /*  int[]answerArray = new int[price.length];          //Brute Force Approach
        
        for(int i=0;i<price.length-1;i++)
        {
            boolean checkCondition=false;
            int minimum=price[i];
            for(int j=i+1;j<price.length;j++)
            {
                if(price[j]<=minimum)
                {
                    answerArray[i]=minimum-price[j];
                    checkCondition=true;
                    break;
                }

            }
            if(!checkCondition)
            {
                answerArray[i]=price[i];
            }
        }
        answerArray[price.length-1]=price[price.length-1];
        return answerArray;*/
        
        int[] result = new int[prices.length];             // Optimised Code using MONOTONIC STACK
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < prices.length; i++) {
            while (!stack.isEmpty() && prices[stack.peek()] >= prices[i]) {
                int index = stack.pop();
                result[index] = prices[index] - prices[i];
            }
            stack.push(i);
            result[i] = prices[i]; // Default case, no discount
        }

        return result;
    }
        
    
    public static void main(String[] args) {
        int[]prices={8,4,6,2,3};//{10,1,1,6};    //{1,2,3,4,5};//
        int[]answer=finalPrices(prices);
        for(int i=0;i<answer.length;i++)
        {
            System.out.print(answer[i]+" ");
        }
    }
    
}
