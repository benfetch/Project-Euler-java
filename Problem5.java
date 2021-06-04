public class Problem5 {
    public static void main(String[] args) {
        int counter = 20;
        while(true) {
            if(isDivisibleAllNumberUpTo(counter, 13)) {
                System.out.println(counter);
                break;
            }
            counter=counter+2;
        }
    }
    public static boolean isDivisibleAllNumberUpTo(int x, int n) {
        for(int i=2; i<=n; i++) {
            if(x%i!=0) {
                return false;
            }
        }
        return true;
    }
}
