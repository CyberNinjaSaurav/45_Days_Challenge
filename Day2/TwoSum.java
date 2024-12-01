import java.util.HashMap;
import java.util.Map;

package 45_Days_Challenge.Day2;

public class TwoSum {
    
    public  int[] twoSum(int[] nums, int target) {

        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int rem = target - nums[i];

            if(map.containsKey(rem)){
                return new int[]{map.get(rem), i};
            }
            map.put(nums[i], i);

            }
            return new int[]{};
        }
}
