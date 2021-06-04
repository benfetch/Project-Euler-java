public class Problem2 {
    public static void main(String[] args) {
        System.out.println(sumFib(4000000));
    }
    //sums fibonacci numbers up to and including n
    public static int sumFib(int n) {
        int a = 1;
        int b = 2;
        int sum = 2;
        while(b<n) {
            int c = a+b;
            if(c%2==0) {
                sum = sum + c;
            }
            a = b;
            b = c;
        }
        return sum;

    }
}
