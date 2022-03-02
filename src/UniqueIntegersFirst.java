public class UniqueIntegersFirst {
    public int[] sumZero(int n) throws Exception {
        if (n >= 1 && n <= 1000) {
            int[] result = new int[n];
            for(int i = 0; i < n; i++) {
                result[i]= 2 * i - n + 1;
            }
            return result;
        }
        else {
            throw new Exception();
        }
    }
}
