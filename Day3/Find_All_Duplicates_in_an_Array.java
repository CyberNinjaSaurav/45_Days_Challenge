package Day3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Find_All_Duplicates_in_an_Array {
     public List<Integer> findDuplicates(int[] nums) {

        List<Integer> ans = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            if(set.contains(nums[i])) ans.add(nums[i]);
            set.add(nums[i]);
        }
        return ans;
        
    }
}
