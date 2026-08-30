package numtheory;

public class IsPalindrome {

    public static void main(String[] args) {
        
    }

     public boolean isPalindrome(int x) {
       int reverse = 0 , rem = 0;
       while(x > 0){

        rem = x % 10;
        reverse = reverse * 10 + rem;
        x = x / 10;
       }
       if(x == reverse ){
        return true;
       }
        return false;
     }
}
