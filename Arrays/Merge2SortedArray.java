//https://leetcode.com/problems/merge-sorted-array/?envType=study-plan-v2&envId=top-interview-150
public class Merge2SortedArray {

    public static void main(String[] args) {

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = 0, j = 0;
        for (int k = 0; k < nums1.length; k++) {
           if(nums1[i] < nums2[j]){
            for(int z= i+1; z < nums1.length -1; z++){
                nums1[z] = nums1[z+1];
            }
            nums1[i] = nums2[j];
            i++;
            j++;
           }
        }
    }

}
