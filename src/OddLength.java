public class OddLength {
    public int sumOddLengthSubarrays(int[] arr) throws Exception {

        int sum = 0;

        if (arr.length >= 1 && arr.length <= 100) {
            for (int a :
                    arr) {
                if (a < 1 || a > 1000) {
                    throw new Exception();
                }
            }
            for (int i = 1; i <= arr.length; i += 2) {
                for (int j = 0; j < arr.length; j++) {
                    if (i + j <= arr.length) {
                        for (int k = j; k < j + i; k++ ) {
//                        System.out.println(arr[k]);
                            sum += arr[k];
                        }
                    }
                }
            }
//          System.out.println(sum);
            // 5 1 1 1 1 1 3 3 3 5
            // 4 1 1 1 1 3 3
            // 3 1 1 1 3
            // 2 1 1
        }
        return sum;
    }
}
