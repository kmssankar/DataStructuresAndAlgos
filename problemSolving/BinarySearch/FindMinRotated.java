package BinarySearch;

public class FindMinRotated {
    public static void main(String[] args) {
        
    }

      public int findMin(int[] nums) {
        int numsLen = nums.length;
        int start = 0, end = numsLen - 1;
        int mid = start;
        while (end > start) {
            //System.out.println(" start " + start + " - " + end);
            if (nums[end] > nums[start]) {
                return nums[start];
            } else {
                mid = ((end - start) / 2) + start;
                if (nums[mid] > nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid;
                }
            }
        }
        return nums[start];
  }
}
