package numtheory;

public class FindMissingFirstPositive {

    public static void main(String[] args) {
        
    }


     public int firstMissingPositive(int[] nums) {
       
        int size = nums.length;
        int[] ary = new int[size+1];
        for(int i=0; i< size; i++){

            if( nums[i] > 0){
                if(nums[i] < size){
                    int idx = nums[i] - 1;
                    ary[idx] = nums[i];
                }
            }
        }

        for(int i=0; i< size; i++){
            if(ary[i] == 0){
                return i+1;
            }
        }

        return size;
     }

}
