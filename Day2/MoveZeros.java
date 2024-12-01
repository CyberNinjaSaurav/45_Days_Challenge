package 45_Days_Challenge.Day2;

public class MoveZeros {
    

    public void movezeros(int [] nums){
        int left = 0; 

        for(int right = 0; right < nums.length; right++){
            if(nums[right] != 0){
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left++;
            }
        }
    }
}
