public class Problem9 {
    public static void main(String[] args) {
        for(int n=11; n<=300; n++) {
            double prod = 1;
            for(int i=0; i<10; i++) {
                prod = prod * (n-i)/n;
            }
            System.out.println(n + ", " + prod);
        }
    }
    public static int factorial(int n) {
        if(n==1||n==0) {
            return 1;
        }else {
            return n*factorial(n-1);
        }
    }
    public static double eulerFact(double n, int m) {
        double top = Math.pow(m, n);
        top = top * factorial(m);
        double bottom = 1;
        for(int i=1; i<=m; i++) {
            bottom = bottom*(n+i);
        }
        return top/bottom;
    }
    public static int stirling(int n) {
        double left = Math.sqrt(2*n*Math.PI);
        double middle = Math.pow((n/Math.E), n);
        double right = 1+1/(12*n);
        return (int)(left*middle*right);
    }
}
