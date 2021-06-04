public class Problem7 {
    public static void main(String[] args) {
        System.out.println(numberPrime(10001));
    }
    public static int numberPrime(int n) {
        if(n==1) {
            return 2;
        }else {
            int x = 3;
            int counter = 2;
            while(counter<=n) {
                if(isPrime(x)) {
                    counter++;
                }
                x=x+2;
            }
            return x-2;
        }
        

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
