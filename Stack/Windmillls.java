package stack;
import java.util.Stack;

public class Windmillls {
    public static int[] shorterLeftWindmills(int[] heights) {
        int n = heights.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            // Remove elements from the stack that are greater than or equal to current height
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            // The remaining elements in the stack are shorter
            result[i] = stack.size();
            // Push the current index onto the stack
            stack.push(i);
        }

        return result;
    }

    public static void main(String[] args) {
        // Example input
        int[] heights = {100, 200, 105, 110, 120, 250};
        int[] result = shorterLeftWindmills(heights);

        // Print the result
        for (int count : result) {
            System.out.print(count + " ");
        }
    }
}
