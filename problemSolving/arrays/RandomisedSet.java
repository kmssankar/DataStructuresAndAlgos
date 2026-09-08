package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RandomisedSet {

    public static void main(String[] args) {

    }

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> outList = new ArrayList<>();
        int numsLen = nums.length;

        for(int i=0 ; i< numsLen; i++){

            if(nums[i] > 0){
                break;
            }

            List<Integer> triplet = new ArrayList<>();
            triplet.add(nums[i]);

            int rem = 0 - nums[i];

            int startIdx = i + 1;
            int endIdx = numsLen - 1;
            while(startIdx < endIdx){
                int sum = nums[startIdx] + nums[endIdx];
                if(sum < rem){
                    startIdx ++;
                }else if(sum > rem){
                    endIdx --;
                }else{
                    triplet.add(nums[startIdx]);
                    triplet.add(nums[endIdx]);
                    outList.add(triplet);
                    break;
                }
            }   

        }
    return outList;

    }

}
