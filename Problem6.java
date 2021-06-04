public class Problem6 {
    public static void main(String[] args) {
        System.out.println(func(100));
    }
    public static int func(int n) {
        int first = (n*(2*n+1)*(n+1))/6;
        int second = (n*(n+1)/2);
        second = second*second;
        return second - first;
    }
}
