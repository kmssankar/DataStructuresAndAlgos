package arrays;

public class MajorityElement {

    public static void main(String[] args) {
        
    }

    public int majorityElement(int[] nums) {
        int element = nums[0];
        int count = 1;
        int len = nums.length;
        for(int i=1; i< len; i++){
            if(count > 0){
             if(nums[i] == element){
               count ++;
             }
             else{
                count --;
             }
            }
            else{
                count = 1;
                element = nums[i];
            }
        }
        return element;
    }
}
