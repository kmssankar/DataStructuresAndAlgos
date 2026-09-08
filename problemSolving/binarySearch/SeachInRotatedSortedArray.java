package binarySearch;
//https://leetcode.com/problems/search-in-rotated-sorted-array
public class SeachInRotatedSortedArray {

    public static void main(String[] args) {

    }

    public int search(int[] nums, int target) {

        int idxFound = 0;
        int aryLen = nums.length;
        int startIdx = 0;
        int endIdx = aryLen - 1;

        while(startIdx <= endIdx){
           if((target > nums[startIdx]) && (target < nums[endIdx]) ){
             

           }


        }


        return -1;
    }
}
