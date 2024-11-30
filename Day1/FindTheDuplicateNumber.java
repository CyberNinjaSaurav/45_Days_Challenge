package Day1;
public class FindTheDuplicateNumber {

    public int findDuplicate(int[] nums) {
        int slow = 0, fast = 0; 
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);
        
        slow = 0; 
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }

    public static void main(String[] args) {
        FindTheDuplicateNumber finder = new FindTheDuplicateNumber();
        int[] nums = {1, 3, 4, 2, 2}; // Corrected array declaration
        System.out.println(finder.findDuplicate(nums)); // Call the method on the instance
    }
}

/*Most optimal approch using flyod's algo
 * time complexity O(n)
 * space complexity O(1)
 */