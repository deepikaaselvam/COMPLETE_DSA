package stack;
import java.util.Scanner;
import java.util.Stack;

public class ShorterLeftWindMills {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] heights = new int[n];

        for (int i = 0; i < n; i++) {
            heights[i] = scanner.nextInt();
        }

        int[] counts = findShorterWindMills(heights);

        for (int count : counts) {
            System.out.print(count + " ");
        }
    }

    private static int[] findShorterWindMills(int[] heights) {
        int n = heights.length;
        int[] counts = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && heights[i] >= heights[stack.peek()]) {
                int shorterIndex = stack.pop();
                counts[shorterIndex] = i - shorterIndex - 1; // -1 to exclude the current index
            }
            stack.push(i);
        }

        // Remaining indices on the stack have no shorter wind-mills to the left
        while (!stack.isEmpty()) {
            int shorterIndex = stack.pop();
            counts[shorterIndex] = 0;
        }

        return counts;
    }
}