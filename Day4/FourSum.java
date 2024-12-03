package Day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FourSum {
    
     public List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);

        Set<List<Integer>> set = new HashSet<>();

        for(int i = 0; i < nums.length - 3; i++){
            for(int j = i + 1; j < nums.length -2; j++){
                int k = j + 1;
                int l = nums.length-1;

                while(k < l){
                    long sum = (long)nums[i] + nums[j] + nums[k] + nums[l];
                    if(sum == target){
                        List<Integer> put = new ArrayList<>();
                        put.add(nums[i]);
                        put.add(nums[j]);
                        put.add(nums[k]);
                        put.add(nums[l]);

                        if(!set.contains(put)){
                            set.add(put);
                        }
                        k++;
                        l--;
                    }else if(sum <= target){
                        k++;
                    }else if(sum > target){
                        l--;
                    }
                }
            }
        }
        list.addAll(set);
        return list;
    }
}
