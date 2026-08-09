import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {
        
    }

      public int[] twoSum(int[] nums, int target) {
   int arrayLength = nums.length;
        HashMap<Integer, Integer> comboMap = new HashMap<>(arrayLength);
        for(int i=0 ; i < arrayLength; i++ ){
            int key = target - nums[i];
            if(comboMap.containsKey(key)){
                return new int[]{i, comboMap.get(key)};
            }else{
                comboMap.put(nums[i], i);
            }
        }
       return new int[]{}; 
    }

}
