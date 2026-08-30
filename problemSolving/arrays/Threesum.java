package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Threesum {

    public static void main(String[] args) {

    }

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> outList = new ArrayList<>();
        int numsLen = nums.length;
        int count = 0;
        int prev1 = 0, prev2 = 0, prev3 = 0;
        for (int i = 0; i < numsLen; i++) {
            if (nums[i] > 0) {
                break;
            }
            if ((count > 0) && (prev1 == nums[i])) {
                continue;
            }

            int rem = 0 - nums[i];
            int startIdx = i + 1;
            int endIdx = numsLen - 1;

            while (startIdx < endIdx) {
                int sum = nums[startIdx] + nums[endIdx];
                if (sum < rem) {
                    startIdx++;
                } else if (sum > rem) {
                    endIdx--;
                } else {
                    if ((count > 0) && (prev1 == nums[i]) && (prev2 == nums[startIdx])) {
                        System.out.println(" skipped " + nums[i] + " " + nums[startIdx] + " " + nums[endIdx]);
                    } else {
                        outList.add(Arrays.asList(nums[i], nums[startIdx], nums[endIdx]));
                        prev1 = nums[i];
                        prev2 = nums[startIdx];
                        prev3 = nums[endIdx];
                        count++;
                    }
                    startIdx++;
                }
            }
        }
        return outList;
    }
}
