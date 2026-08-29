package arrays;

public class TwoSumSorted {

    public static void main(String[] args) {

    }

    public int[] twoSum(int[] numbers, int target) {
        int[] out = new int[2];
        int startIdx = 0, endIdx = numbers.length - 1;
        while (startIdx < endIdx) {
            int sum = numbers[startIdx] + numbers[endIdx];
            if (sum > target) {
                endIdx--;
            } else if (sum < target) {
                startIdx++;
            } else {
                return new int[] { startIdx + 1, endIdx + 1 };
            }
        }
        return out;
    }
}
