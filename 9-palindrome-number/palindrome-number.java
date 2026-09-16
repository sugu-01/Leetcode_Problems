class Solution {
    public boolean isPalindrome(int x) {
        
        int orgx = x;
        int rev =0;

        while ( x > 0){
            rev = (rev * 10) + (x % 10);
            x /= 10;
        }

        if(orgx == rev){
            return true;
        }
        else{
            return false;
        }

    }
}