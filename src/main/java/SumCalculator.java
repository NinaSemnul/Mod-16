public class SumCalculator {
    public int sum(int n){

        int sum = 0;
        for (int i = 0; i <= n ; i++){
            sum = sum + i;
        }

        if (n <= 0) {
            throw new IllegalArgumentException("n must be > 0 ");
        }

        return sum;
    }
}
