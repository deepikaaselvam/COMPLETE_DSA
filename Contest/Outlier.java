package Contest;
import java.util.TreeMap;
public class Outlier
{
    public int getLargestOutlier(int[] nums) 
    {
        // Step 1: Calculate the total sum of the array
        int sum = 0;
        for (int num : nums)
        {
            sum += num;
        }
        
        // Step 2: Use a TreeMap to mimic multiset functionality
        TreeMap<Integer, Integer> frequencyMap = new TreeMap<>();
        for (int num : nums) 
        {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        // Step 3: Initialize the answer as the smallest possible value
        int ans = Integer.MIN_VALUE;

        // Step 4: Iterate through each number in the array
        for (int num : nums) 
        {
            // Check if the sum excluding the current number is even
            if ((sum - num) % 2 == 0) 
            {
                int target = (sum - num) / 2;

                // Temporarily reduce the count of the current number
                frequencyMap.put(num, frequencyMap.get(num) - 1);
                if (frequencyMap.get(num) == 0) 
                {
                    frequencyMap.remove(num);
                }

                // Check if the target exists in the map
                if (frequencyMap.containsKey(target)) 
                {
                    // Update the maximum outlier found so far
                    ans = Math.max(ans, num);
                }

                // Restore the current number to the map
                frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
            }
        }
        
        // Step 5: Return the largest outlier, or a default value if none found
        return ans == Integer.MIN_VALUE ? -1 : ans;
    }
    public static void main(String[] args) {
        int[]array={2,3,5,10};
        Outlier obj = new Outlier();
        System.out.println(obj.getLargestOutlier(array));

    }
}