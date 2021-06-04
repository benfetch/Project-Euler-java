public class Problem1 {
    public static void main(String[] args) {
        System.out.println(sumMultiplesBelow(1000));
    }
    public static int sumMultiplesBelow(int n) {
        int sum = 0;
        for(int i=3; i<n; i++) {
            if(i%3==0 || i%5==0) {
                sum = sum + i;
            }
        }
        return sum;
    }
}