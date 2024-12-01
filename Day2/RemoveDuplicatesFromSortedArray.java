
package Day2;
public class RemoveDuplicatesFromSortedArray{

    public int removeDuplicates(int[] nums){
        if(nums.length == 0){
            return 0;
        }

        int i = 0;
        for(int j = 0; j < nums.length; j++){
            if(nums[j] != nums[i]){
                i++;
            }

            nums[j] = nums[i];
        }
        return i + 1;
    }
}