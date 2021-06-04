public class Problem4 {
    public static void main(String[] args) {
        System.out.println(highestPalNo(9999));
        
    }
    public static int highestPalNo(int n) {
        int largest = 0;
        for(int i=n; i>0; i--) {
            if(largest>=n*i) {
                return largest;
            }
            for(int j=n; j>=i; j--) {
                if(isPalindrome(i*j)) {
                    if(i*j>largest) {
                        largest = i*j;
                    }
                }
            }
        }
        return largest;
    }

    public static boolean isPalindrome(int n) {
        String x = Integer.toString(n);
        for(int i=0; i<(int)(x.length()/2); i++) {
            if(x.charAt(i)!=x.charAt(x.length()-1-i)) {
                return false;
            }
        }
        return true;
    }
}
