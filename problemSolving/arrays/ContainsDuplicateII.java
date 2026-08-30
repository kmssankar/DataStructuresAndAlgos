package arrays;

import java.util.HashMap;
//https://leetcode.com/problems/contains-duplicate-ii
public class ContainsDuplicateII {

    public static void main(String[] args) {
        
    }

      public boolean containsNearbyDuplicate(int[] nums, int k) {        
         int len = nums.length;

        HashMap<Integer, Integer> table = new HashMap<>();
        for (int i = 0; i < len; i++) {

            int indexNum = nums[i];
            if (table.containsKey(indexNum)) {
                if ((i - table.get(indexNum)) <= k) {
                    return true;
                }else{
                    table.put(indexNum, i);
                }

            } else {
                table.put(indexNum, i);
            }
        }
        return false;
    }
}
