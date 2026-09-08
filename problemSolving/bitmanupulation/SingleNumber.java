package bitmanupulation;

public class SingleNumber {

    public static void main(String[] args) {
        int[] inpAry = {1,1,2,2,5};
        System.out.println( singleNumber(inpAry));
    }

     public static int singleNumber(int[] nums) {
        int sum = nums[0];
        for(int i=1; i< nums.length; i++){
            sum = sum ^ nums[i];
        }
        return sum;
     }
}
