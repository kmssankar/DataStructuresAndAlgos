package bitmanupulation;

public class SingleNumber2 {

    public static void main(String[] args) {
          int[] inpAry = {2,2,14,2,14,14,4};
        System.out.println( singleNumber(inpAry));
    }

      public static int singleNumber(int[] nums) {
        int sum = nums[0];
        int andSum = nums[0];
        for(int i=1; i< nums.length; i++){

            sum = sum ^ (nums[i]);
            
            andSum =andSum | nums[i];
            System.out.println(i+ " -> " + sum+ "  "+ andSum);
        }
        int sumMod = sum & ( sum << 1 );
        System.out.println(sum ^ sumMod);
        return sum;
    }
}
/*
 1000 
 

*/

//24 ^ 32