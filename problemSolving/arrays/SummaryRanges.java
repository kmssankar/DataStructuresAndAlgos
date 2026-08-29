package arrays;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {

    public static void main(String[] args) {

    }

    public List<String> summaryRanges(int[] nums) {
        List<String> outPut = new ArrayList<>();
        int length = nums.length;
        if(length < 1) return outPut;
        int previous = nums[0];
        int startRange = nums[0];

        for (int i = 1; i < length; i++) {

            if (!((nums[i] - previous) == 1 ) || ((nums[i] - previous) == 0)) {

                if (startRange == previous) {
                    outPut.add("" + startRange);
                } else {
                    outPut.add(startRange + "->" + nums[i - 1]);
                }
                startRange = nums[i];

            }
            previous = nums[i];
        }
        if ((nums[length - 1] == startRange) ) {
            outPut.add("" + startRange);
        } else {
            outPut.add(startRange + "->" + nums[length - 1]);
        }
        return outPut;
    }
}
