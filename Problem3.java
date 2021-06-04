public class Problem3 {
    public static void main(String[] args) {
        long x = 600851475143L;
        System.out.println(largestPrimeFactor(x));
    }
    public static int largestPrimeFactor(long n){
        int largestFactor = 2;
        while(n>1) {
            if(n%largestFactor==0) {
                n = n/largestFactor;
            }else {
                while(true) {
                    largestFactor++;
                    if(isPrime(largestFactor)) {
                        break;
                    }
                }
            }
        }
        return largestFactor;
        

    }
    public static boolean isPrime(long n) {
        if(n==1) {
            return false;
        }else if(n<4) {
            return true;
        }else if(n%2==0) {
            return false;
        }else if(n<9) {
            return true;
        }else if(n%3==0) {
            return false;
        }else {
            int r = (int)(Math.sqrt(n));
            int f = 5;
            while(f<= r) {
                if(n%f==0) {
                    return false;
                }else if(n%(f+2)==0) {
                    return false;
                }
                f = f+6;
            }
        }
        return true;
    }
}
