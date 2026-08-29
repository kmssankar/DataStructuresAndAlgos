package arrays;

public class RotateArray {

    public static void main(String[] args) {
        
    }

     public void rotate(int[] nums, int k) {
        int endidx = nums.length -1;
        int kmod = k % nums.length;
        if(kmod > 0 && endidx > 0){
        reverseArray(nums, 0, endidx);
        reverseArray(nums, kmod , endidx);
        reverseArray(nums, 0 , kmod - 1 );
        }
    }

    private void reverseArray(int[] array, int start, int end){
        int j = 0;
        int eidx = ((end - start)/2) + start;
        int temp ;
        for(int i=start;  i <= eidx ; i++){
            temp = array[i];
            array[i] = array[end - j];
            array[end - j ] = temp;
            j++;
        }
    }
}
